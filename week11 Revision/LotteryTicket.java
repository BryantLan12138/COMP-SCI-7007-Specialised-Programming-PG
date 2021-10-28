public class LotteryTicket {
    public static String buy(int price, int b1, int b2, int b3, int b4) {
        int[] b = new int[4];
        b[0] = b1;
        b[1] = b2;
        b[2] = b3;
        b[3] = b4;

        if(price == b1 + b2 + b3 + b4) {
            return "POSSIBLE";
        }

        for(int i = 0; i < 4; i++) {
            for(int j = i + 1; j < 4; j++) {
                if(b[i] == price) {
                    return "POSSIBLE";
                }
                for(int k = j + 1; k < 4; k++) {
                    if(b[i] + b[j] == price) {
                        return "POSSIBLE";
                    }
                    if(b[i] + b[j] + b[k] == price) {
                        return "POSSIBLE";
                    }
                }
            }
        }

        return "IMPOSSIBLE";
    }

    public static void main(String[] args) {
        System.out.println(buy(	4000, 1000, 999, 1000, 1000));
    }

}
