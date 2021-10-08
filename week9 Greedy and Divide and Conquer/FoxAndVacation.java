import java.util.Arrays;

public class FoxAndVacation {
    public static int maxCities(int total, int[] d) {
        Arrays.sort(d);
        int tmp = 0;
//        for(int i: d) {
//            System.out.print(i + ", ");
//        }

        for(int i = 0; i < d.length; i++) {
            tmp += d[i];
            if(tmp > total) {
                return i;
            }
        }

        if(tmp < total) {
            return d.length;
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] d =
        {11, 4, 28, 20, 30, 3, 3, 1, 27, 1, 14, 14, 27, 27, 22, 2, 21, 18, 30, 23, 31, 3, 26, 15, 20, 28, 6, 11, 17, 11, 13, 23, 10, 7};
        System.out.println(maxCities(22, d));
    }
}
