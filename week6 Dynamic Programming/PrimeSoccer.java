public class PrimeSoccer {
    public static double getProbability(int skillOfTeamA, int skillOfTeamB) {
        double[][] a = new double[19][19];
        double[][] b = new double[19][19];
        double result = 0.0;
        double aResult, bResult = 0.0;

        double aProbability = (double)(skillOfTeamA / 100.0);
        double bProbability = (double)(skillOfTeamB / 100.0);

        a[0][0] = 1 - aProbability;
        a[0][1] = aProbability;
        b[0][0] = 1 - bProbability;
        b[0][1] = bProbability;

        for(int i = 1; i < 18; i++) {
            a[i][0] = a[i - 1][0] * a[0][0];
            b[i][0] = b[i - 1][0] * b[0][0];
            for(int j = 1; j <= 18; j++) {
                a[i][j] = a[i-1][j-1] * aProbability + a[i-1][j] * (1 - aProbability);
                b[i][j] = b[i-1][j-1] * bProbability + b[i-1][j] * (1 - bProbability);
            }
        }

        aResult = a[17][2] + a[17][3] + a[17][5] + a[17][7] + a[17][11] + a[17][13] + a[17][17];
        bResult = b[17][2] + b[17][3] + b[17][5] + b[17][7] + b[17][11] + b[17][13] + b[17][17];
        result = (aResult + bResult) - aResult*bResult;
        return result;

    }


    public static void main(String[] args) {
        System.out.println(getProbability(12,89));
    }


}
