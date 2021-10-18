public class Exam3p2 {
    public static int Max = Integer.MAX_VALUE;
    public static int exam3p2(int smiles) {
        // smiles are up to 1000, plus 0 smiles to consist 1001 numbers
        long[][] dp = new long[1001][1001];
        return (int) subFunction(smiles, 0, 1, dp);
    }

    private static long subFunction(int smiles, int num_clipboard, int emoji_on_chat, long[][] dp) {
        // job finish
        if(emoji_on_chat == smiles) {
            return 0;
        }

        if(emoji_on_chat > smiles) {
            return Max;
        }

        if(dp[num_clipboard][emoji_on_chat] != 0) {
            return dp[num_clipboard][emoji_on_chat];
        }

        long number_paste = 0L;
        long number_copy_paste = 0L;
        long operation = 0L;

        if(num_clipboard > 0) {
            // paste only for prime number
            number_paste = 1 + subFunction(smiles, num_clipboard, num_clipboard + emoji_on_chat, dp);
        }

        else {
            number_paste = Max;
        }

        number_copy_paste = 2 + subFunction(smiles, emoji_on_chat, emoji_on_chat * 2, dp);

        operation = Math.min(number_paste, number_copy_paste);

        dp[num_clipboard][emoji_on_chat] = operation;

        return operation;


    }
    public static void main(String[] args) {
        System.out.println(exam3p2(
                37));
    }
}
