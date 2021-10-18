import java.util.Arrays;
public class ReconstructPermutation {
    public static int[] reconstruct(int N, int[] partial) {
        int[] ans = new int[N];
        boolean[] del = new boolean[N];
        Arrays.fill(del, true);
        for(int i = 0; i < partial.length; i++) {
            del[partial[i]] = false;
        }
        int wpos = 0;
        int iter = 0;
        for (int x : partial) {
            while (iter < x) {
                if (del[iter]) {
                    ans[wpos++] = iter;
                }
                iter++;
            }
            ans[wpos++] = x;
        }
        while (iter < N) {
            if (del[iter]) {
                ans[wpos++] = iter;
            }
            iter++;
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
