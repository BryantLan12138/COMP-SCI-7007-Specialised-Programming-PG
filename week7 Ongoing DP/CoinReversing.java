public class CoinReversing {
    public static double expectedHeads(int N, int[] a) {
        // the length of probability is equal to a.length (number of actions)
        double[] dp = new double[a.length + 1];
        // all coins are heads up, so the expectation is equal to number of coins
        dp[0] = (double)N;
        double result = 0;
        for(int i = 1; i <= a.length; i++) {
            // (coins (heads up) remain it status + coins (heads down) flip / N
            dp[i] = (dp[i - 1]*((double)(N - a[i - 1]) / (double)N)) + ((double)((double)N - dp[i - 1]))*((double)(a[i - 1]/ (double)N));
        }
//        if(N - dp[N - 1] == 0){
//            return 0.0;
//        }
//        for (int i = 0; i < a.length+1 ; i++) {
//            System.out.println(dp[i]);
//        }
        return dp[a.length];
    }

    public static void main(String[] args) {
        int[] a = {10, 10, 10};
        System.out.println(expectedHeads(10, a));
    }
}
