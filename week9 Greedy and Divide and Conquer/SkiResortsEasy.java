public class SkiResortsEasy {
    public static int minCost(int[] altitude) {
        int cost = 0;
        for(int i = 0; i < altitude.length; i++) {
            for(int j = i + 1; j < altitude.length; j++) {
                if(altitude[j] > altitude[i]) {
                    cost += altitude[j] - altitude[i];
                    altitude[j] = altitude[i];
                    break;
                }
            }
        }
        return cost;
    }



    public static void main(String[] args) {
        int[] altitude = {712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745};

        System.out.println(minCost(altitude));
    }
}
