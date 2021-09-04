public class UnsealTheSafe {
    // N is a number between 2 and 30
    public static int steps_remaining = 30;
    public static int current_digit = 10;
    public static long countPasswords(int N) {
        long result = 0;
        long[][] pads = new long[steps_remaining][current_digit];
        // there's only one way to type 0 digit, is don't type
        if(N == 0) {
            return 1;
        }

        // another base case
        for(int i = 0; i < 10; i++) {
            pads[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            pads[i][0] = pads[i - 1][7];
            pads[i][1] = pads[i - 1][2] + pads[i - 1][4];
            pads[i][2] = pads[i - 1][1] + pads[i - 1][3] + pads[i - 1][5];
            pads[i][3] = pads[i - 1][2] + pads[i - 1][6];
            pads[i][4] = pads[i - 1][1] + pads[i - 1][5] + pads[i - 1][7];
            pads[i][5] = pads[i - 1][2] + pads[i - 1][4] + pads[i - 1][6] + pads[i - 1][8];
            pads[i][6] = pads[i - 1][3] + pads[i - 1][5] + pads[i - 1][9];
            pads[i][7] = pads[i - 1][4] + pads[i - 1][8] + pads[i - 1][0];
            pads[i][8] = pads[i - 1][5] + pads[i - 1][7] + pads[i - 1][9];
            pads[i][9] = pads[i - 1][6] + pads[i - 1][8];
        }

        for(int i = 0; i < 10; i++ ) {
            result += pads[N][i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPasswords(10));
    }
}
