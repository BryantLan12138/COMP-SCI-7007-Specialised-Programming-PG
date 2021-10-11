import java.util.Arrays;
public class MiniatureDachshund {
    public static int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);
        int difference = 5000 - weight;
        int result = 0;
        int tmp = 0;
        for(int i = 0; i < mikan.length; i++) {
            tmp += mikan[i];
            if(difference >= tmp) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] mikan = {100, 100, 100, 100, 50};
        System.out.println(maxMikan(mikan, 4750));
    }
}
