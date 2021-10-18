import java.util.Arrays;
public class Pricing {
    public static int currentRevenue(int[] price, int a, int b, int c, int d) {
        int revenue = 0;
        for(int i = 0; i < price.length; i++) {
            if(price[i] >= d) {
                revenue += d;
            }
            else if(price[i] >= c) {
                revenue += c;
            }
            else if(price[i] >= b) {
                revenue += b;
            }
            else if(price[i] >= a) {
                revenue += a;
            }
        }
        return revenue;
    }
    public static int maxSales(int[] price) {
        int sum = 0;
        if(price.length <= 4) {
            for(int i: price) {
                sum += i;
            }
        }
        else {
            Arrays.sort(price);
            for(int i = 0; i < price.length; i++) {
                for(int j = i + 1; j < price.length; j++) {
                    for(int k = j + 1; k < price.length; k++) {
                        for(int m = k + 1; m < price.length; m++) {
                            int tmp = currentRevenue(price, price[i], price[j], price[k], price[m]);
                            sum = Math.max(tmp, sum);
                        }
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] price = {130, 110, 90, 13, 6, 5, 4, 3, 0, 130, 110, 90, 15, 15, 15, 13, 6, 5, 4, 3, 0, 130, 110, 90, 13, 6, 5, 4, 3, 0, 130, 110, 90, 13, 6, 5, 4, 3, 0};
        System.out.println(maxSales(price));
    }
}
