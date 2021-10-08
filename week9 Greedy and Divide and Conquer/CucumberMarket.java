import java.util.Arrays;

public class CucumberMarket {
    public static void main(String[] args) {
        int[] price = {918, 405, 744, 396, 750, 408, 937, 303};
        System.out.println(check(price, 3768, 6));
    }

    public static String check(int[] price, int budget, int k) {
        Arrays.sort(price);
        int sum = 0;
        for(int i = price.length - 1; i > price.length - 1 - k; i--) {
            sum += price[i];
        }
        System.out.println(sum);

        return budget >= sum ? "YES" : "NO";
    }
}
