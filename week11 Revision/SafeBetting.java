public class SafeBetting {
    public static int minRounds(int a, int b, int c) {
        int bet = 0;
        int result = 0;
        while(c >= b) {
            bet = b - a;
            b += bet;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minRounds(17, 30, 1000));
    }
}
