public class LittleElephantAndPermutationDiv2 {

    static boolean permuation(int[]as) {
        int n = as.length;
        for (int i = n - 1; i > 0; i--) {
            if (as[i - 1] < as[i]) {
                int j = n;
                while (as[i - 1] >= as[--j]);
                swap(as, i - 1, j);
                reverse(as, i, n);
                return true;
            }
        }
        return false;
    }
    public static void swap(int[] is, int i, int j) {
        int t = is[i];
        is[i] = is[j];
        is[j] = t;
    }
    public static void reverse(int[] is, int s, int t) {
        while (s < --t) swap(is, s++, t);
    }
    public static long factorial(int i) {
        return i == 0 ? 1 : i * factorial(i - 1);
    }

    public static long getNumber(int N, int K) {
        int[] A = new int[N];
        int[] B = new int[N];
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            A[i] = i + 1;
            B[i] = i;
        }

        do {
            int k = 0;
            for(int i = 0; i < A.length; i++) {
                k += Math.max(A[i], A[B[i]]);
            }
            if(k >= K) {
                result++;
            }
        }while(permuation(B));

        return result*factorial(N);
    }

    public static void main(String[] args) {
        System.out.println(getNumber(10, 73));
    }
}
