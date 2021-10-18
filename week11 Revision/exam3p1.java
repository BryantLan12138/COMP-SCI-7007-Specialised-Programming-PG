public class exam3p1 {
    public static int exam3p1(int[] pos, int[] delta) {
        int current_position = 0;
        int supply = 0;
        int result = 0;
        boolean[] visited = new boolean[pos.length];
        int i = 0;
        for(; i < pos.length; i++) {
            supply += delta[i];
            // if that's a supply
            if(delta[i] >= 0 ) {
                visited[i] = true;
            }
            if(supply >= 0) {
                result += pos[i] - current_position;
                current_position = pos[i];
                for(int j = 0; j <= i; j++) {
                    if(!visited[j]) {
                        result += (current_position - pos[j]) * 2;
                        break;
                    }
                }
                for(int j = 0; j <= i; j++) {
                    visited[j] = true;
                }
            }


        }
        return result;
    }

    public static void main(String[] args) {
        int[] pos = 	{5858, 11904, 17841, 23810, 29655, 35510, 41286, 47110, 52845, 58812, 64685, 70630, 76461, 82411, 88355, 94226};
        int[] del =  {98859, -69024, 5545, -86293, -18837, -60379, -59829, -81642, 41016, 19594, 29352, 100000, 76080, -49337, 20628, 34267};
        System.out.println(exam3p1(pos, del));
    }
}
