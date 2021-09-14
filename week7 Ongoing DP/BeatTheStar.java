public class BeatTheStar {
    public static double doesItMatter(int N, int G) {
        int total_score = ((1 + N) * N) / 2;

        //dp stores the possibility of each score, the max score could reach is calculated and stored in total_score
        double[] dp = new double[total_score + 1];
        //if you don't do any question, the possibility to get 0 score is 100%
        dp[0] = 1.0;
        for(int i = 1; i <=N; i++) {
            // do not consider the possibility of winning game G
            if(i == G) {
                continue;
            }
            for(int j = dp.length - 1; j >= 0; j--) {
                if(dp[j] > 0) {
                    dp[j] *= 0.5;
                    dp[j+i] += dp[j];
                }
            }
        }

        double result = 0;
        for(int i = 0; i < dp.length; i++) {
            if(dp[i] > 0) {
                if(i * 2 < total_score && (i + G) > total_score / 2) {
                    result += dp[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(doesItMatter(98, 45));
    }

}
