public class Exam3p3 {
    public static int count(int s, int a, int b, int c) {
        int[][][][] dp = new int[51][51][51][51];
        for(int i = 0; i < 51; i++) {
            for(int j = 0; j < 51; j++) {
                for(int k = 0; k < 51; k++) {
                    for(int m = 0; m < 51; m++) {
                        dp[i][j][k][m] = -1;
                    }
                }
            }
        }

        if(s > (a + b + c)) {
            return 0;
        }

        if(dp[s][a][b][c] != -1) {
            return dp[s][a][b][c];
        }

        for(int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                for (int k = 0; k < 51; k++) {
                    for (int m = 0; m < 51; m++) {
                        if(i == 0 && j == 0 && k == 0 && m == 0) {
                            dp[i][j][k][m] = 1;
                        }
                        else if (i == 0 || (j == 0 && k == 0 && m ==0) ) {
                            dp[i][j][k][m] = 0;
                        }

                        else {
                            dp[i][j][k][m] = 0;
                            if(j > 0) {
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j-1][k][m]) % 1000000007 ;
                            }
                            if(k>0) {
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j][k-1][m]) % 1000000007;
                            }
                            if(m>0) {
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j][k][m-1]) % 1000000007;
                            }
                            if(j > 0 && k > 0){
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j-1][k-1][m]) % 1000000007;
                            }
                            if(j > 0 && m > 0){
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j-1][k][m-1]) % 1000000007;
                            }
                            if(m > 0 && k > 0){
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j][k-1][m-1]) % 1000000007;
                            }
                            if(j > 0 && k > 0 && m > 0){
                                dp[i][j][k][m] = (dp[i][j][k][m] + dp[i-1][j-1][k-1][m-1]) % 1000000007;
                            }
                        }
                    }
                }
            }
        }

        return dp[s][a][b][c];

    }
    public static void main(String[] args) {
        System.out.println(count(3, 3, 1, 1));
    }
}
