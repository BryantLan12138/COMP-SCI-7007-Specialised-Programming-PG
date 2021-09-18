import java.util.Arrays;
public class BuyOneGetOneFree {
    public static int buy(int[] prices) {
//        if(prices.length == 1) {
//            return prices[0];
//        }
        int[] checked = new int[prices.length];
        int result = 0;
        Arrays.sort(prices);
        if(prices.length % 2 == 0) {
            for(int i = prices.length - 1; i >= 0; i-=2) {
                result += prices[i];
            }
        }
        else {
            for(int i = prices.length - 1; i >= 0; i-=2) {
                result += prices[i];
//                System.out.println(result);
            }
//            result += prices[0];
        }


        return result;
    }

    public static int findMax(int[] prices) {
        int max = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(max < prices[i]) {
                max = prices[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] prices = {441, 567, 465, 585, 352, 264, 525};
        System.out.println(buy(prices));
    }
}
