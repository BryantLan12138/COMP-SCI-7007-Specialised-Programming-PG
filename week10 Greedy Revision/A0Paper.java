import java.lang.Math;
public class A0Paper {
    /*
    Letter: 8.5 inches wide, 11 inches length
    Legal: 8.5 inches wide, 14 inches length
    Tabloid:
    The longer side of the A(i + 1) paper is equal to the shorter side of the A(i) paper
     */
    public static String canBuild(int[] A) {
        double result = 0;
        for(int i = 0; i < A.length; i++) {
            result += (double)(A[i] / Math.pow(2, i));
//            System.out.println(result);
        }

        return result >= 1 ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        int[] A = {0,3};
        System.out.println(canBuild(A));
    }
}
