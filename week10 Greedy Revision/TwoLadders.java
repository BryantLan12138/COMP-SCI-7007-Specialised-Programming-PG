import java.util.Arrays;
import java.lang.Math;
public class TwoLadders {
    public static long minSteps(int sx, int lx1, int lx2, int[] X, int[] Y) {
        boolean check = true;
        long result = 0l;
        int tmp = 0;
        for(int i : Y) {
            if(i != 0)
                check = false;
        }

        // if all element in Y is 0
        if(check == true) {
            Arrays.sort(X);
            result = X[0];
            result -= sx;
            for(int i = 1; i < X.length; i++) {
                result += X[i] - X[i-1];
            }
        }

        else {
            long sum = 0l;
            long average = 0l;
            for(int i: X) {
                sum += i;
            }
            average = sum / X.length;
            long distance_lx1 = Math.abs(average - lx1);
            long distance_lx2 = Math.abs(average - lx2);

            boolean[] mark = new boolean[X.length];

            // should use lx2 ladder
            if(distance_lx1 > distance_lx2) {
                // find the smallest y axis then pick the corresponding x axis as next destination
                int index = -1;
                int tmp_2 = Integer.MAX_VALUE;
                for(int i = 0; i < Y.length; i++) {
                    if(Y[i] < tmp_2) {
                        tmp_2 = Y[i];
                        index = i;
                    }
                }


                mark[index] = true;

            }

            // use lx1 ladder
            else {

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] X = {47, 42};
        int[] Y = {0, 0};
        System.out.println(minSteps(10, 0, 100, X, Y));
    }
}
