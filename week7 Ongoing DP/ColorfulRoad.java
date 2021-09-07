// road will contain 2 and 15 characters inclusive

public class ColorfulRoad {

    public static void main(String[] args) {
        System.out.println(getMin("RGGGB"));
    }

    public static int getMin(String road) {
        int length = road.length();
        long[] cost = new long[length];
        for(long i: cost) {
            i = Integer.MAX_VALUE;
            System.out.print(i + " ");
        }
        cost[length - 1] = 0;
        for(int i = length - 1; i >= 1; i-- ) {
            char prev = getPrev(road.charAt(i));
            for(int j = i - 1; j >= 0; j--) {
                if(prev == road.charAt(j)){
                    long curCost = cost[j];
                    long newCost = cost[i] + (i - j)^2;
                    if(newCost < curCost) {
                        cost[j] = newCost;
                    }
                }
            }
        }
        if(cost[0] == Integer.MAX_VALUE)
            return -1;

        return (int)cost[0];
    }

    // R -> G -> B
    public static char getPrev(char current) {
        if(current == 'R') {
            return 'B';
        }
        if(current == 'G') {
            return 'R';
        }
        if(current == 'B') {
            return 'G';
        }

        // error
        return 'Q';
    }


}
