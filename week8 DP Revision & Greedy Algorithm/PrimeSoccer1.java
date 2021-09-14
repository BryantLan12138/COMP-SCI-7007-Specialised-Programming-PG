// revision version
public class PrimeSoccer1 {
    public static double getProbability(int skillOfTeamA, int skillOfTeamB) {
        // 18 intervals for the whole game, maximum goal is 18
        double[][] dp_a = new double[19][19];
        double[][] dp_b = new double[19][19];

        double a_probability = (double) (skillOfTeamA/100.0);
        double b_probability = (double) (skillOfTeamB/100.0);
        dp_a[0][0] = (double)(1 - a_probability);
        System.out.println(dp_a[0][0]);
        dp_a[0][1] = (double)(skillOfTeamA/100.0);
        System.out.println(dp_a[0][1]);


        dp_b[0][0] = (double)((100.0 - skillOfTeamB)/100.0);
        dp_b[0][1] = (double)(skillOfTeamB/100.0);

        for(int i = 1; i < 19; i++) {
            dp_a[i][0] = dp_a[i -1][0] * dp_a[0][0];
            dp_b[i][0] = dp_b[i -1][0] * dp_b[0][0];
            for(int j = 1; j < 19; j++) {
                dp_a[i][j] = dp_a[i - 1][j] * dp_a[0][0] + dp_a[i - 1][j - 1] * dp_a[0][1];
                dp_b[i][j] = dp_b[i - 1][j] * dp_b[0][0] + dp_b[i - 1][j - 1] * dp_b[0][1];
            }
        }

        double result_a, result_b, result = 0.0;
        result_a = dp_a[17][2] + dp_a[17][3] + dp_a[17][5] + dp_a[17][7] + dp_a[17][11] + dp_a[17][13] + dp_a[17][17];
        result_b = dp_b[17][2] + dp_b[17][3] + dp_b[17][5] + dp_b[17][7] + dp_b[17][11] + dp_b[17][13] + dp_b[17][17];

        result = result_a + result_b - result_a * result_b;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getProbability(50, 50));
    }
}
