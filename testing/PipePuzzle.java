public class PipePuzzle {
    public static int go(int y, int x, int dir, String[] pipes, boolean[][] visited) {
        int ny = y, nx = x, ret = 0;

        if(dir == 0) {
            ny = y -1;
        }
        else if(dir == 1){
            ny = y + 1;
        }
        else if(dir == 2){
            nx = x - 1;
        }
        else if(dir == 3){
            nx = x + 1;
        }

        if(nx < 0 || nx >= pipes[0].length()) {
            return 0;
        }

        if(ny < 0 || ny >= pipes.length) {
            return 0;
        }

        if(visited[ny][nx] == true && pipes[ny].charAt(nx) != '+') {
            return 0;
        }

        visited[ny][nx] = true;
        ret++;

        if(pipes[ny].charAt(nx) == 'L' ) {
            if(dir == 0 || dir == 1) {
                ret += Math.max(go(ny, nx, 3, pipes, visited), go(ny , nx, 2, pipes, visited));
            }
            else
                ret += Math.max(go(ny, nx, 0, pipes, visited), go(ny, nx, 1, pipes, visited));
        }
        // in the case is '+'
        else {
            ret += go(ny, nx, dir, pipes, visited);
        }

        return ret;
    }

    public static int longest(String[] pipes) {
        // default coordination
        int x = -1, y = -1, dir = 0;
        String direction = "NSWE";
        for(int i = 0; i < pipes.length; i++) {
            if(x != -1 && y != -1) {
                break;
            }
            for(int j = 0; j < pipes[i].length(); j++) {
                if(direction.contains(Character.toString(pipes[i].charAt(j)))) {
                    x = i;
                    y = j;
                    dir = direction.indexOf(Character.toString(pipes[i].charAt(j)));
                    System.out.println(dir);
                    break;
                }
            }
        }

        // 2d array to track which pipe has been visited
        boolean[][] visited = new boolean[pipes.length][pipes[0].length()];
        for(int i = 0; i < pipes.length; i++) {
            for(int j = 0; j < pipes[i].length(); j++) {
                //set default value to false
                visited[i][j] = false;
            }
        }

        // except for the initial point
        visited[y][x] = true;
        return go(y, x, dir, pipes, visited);
    }

    public static void main(String[] args) {
        String[] test =
                        {"LL-L-",
                        "L+L+L",
                        "--NL-",
                        "L+--L",
                        "LL+L-"};

        System.out.println(longest(test));
    }
}
