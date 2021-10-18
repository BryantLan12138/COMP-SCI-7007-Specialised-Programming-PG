public class UnsealTheSafe1 {
    public static final int length = 50;
    public static final int digits = 10;

    public static long countPasswords(int N) {
        long[][] track = new long[length][digits];
        long result = 0;
        //set the base case
        for(int i = 0; i < 10; i++) {
            track[1][i] = 1;
        }

        for(int i = 2; i < N + 1; i++) {
            track[i][0] = track[i - 1][7];
            track[i][9] = track[i - 1][8] + track[i - 1][6];
            track[i][8] = track[i - 1][9] + track[i - 1][7] + track[i - 1][5];
            track[i][7] = track[i - 1][8] + track[i - 1][4] + track[i - 1][0];
            track[i][6] = track[i - 1][3] + track[i - 1][5] + track[i - 1][9];
            track[i][5] = track[i - 1][2] + track[i - 1][4] + track[i - 1][8] + track[i - 1][6];
            track[i][4] = track[i - 1][1] + track[i - 1][5] + track[i - 1][7];
            track[i][3] = track[i - 1][2] + track[i - 1][6];
            track[i][2] = track[i - 1][1] + track[i - 1][3] + track[i - 1][5];
            track[i][1] = track[i - 1][2] + track[i - 1][4];
        }

        for(int i = 0; i < 10; i++) {
            result += track[N][i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPasswords(25));
    }
}
