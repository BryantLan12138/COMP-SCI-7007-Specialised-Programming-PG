import java.util.Arrays;
public class Quorum {
    public static int count(int[] arr, int k) {
        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i < k; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {50,2,9,49,38};
        System.out.println(count(arr, 3));
    }
}
