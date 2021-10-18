import java.util.Arrays;
public class exam4p2 {
    public static int exam4p2(int[] item) {
        int result = 0;
        int tmp = 0;
        int index_i = 0;
        int index_j = 0;
        boolean[] check = new boolean[item.length];

        for(int i = 0; i < item.length; i++) {
            if(check[i] != true) {
                if(i > 199) {
                    result++;
                    check[i] = true;
                }
            }

        }

        for(int i = 0; i < item.length; i++) {
            if(check[i] != true) {
                for(int j = i + 1; j < item.length; j++) {
                    if(check[j] != true) {
                        if(item[i] + item[j] == 300) {
                            result++;
                            check[i] = true;
                            check[j] = true;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < item.length; i++ ) {
            if(check[i] != true) {
                for(int j = item.length - 1; j > 0; j--) {
                    if(check[j] != true) {
                        if(item[j] + item[i] <= 299 ) {
                            result++;
                            check[j] = true;
                            check[i] = true;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < item.length; i++) {
            if(!check[i]) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] item = {101, 101, 101, 101, 101, 101, 101, 101, 101};
        System.out.println(exam4p2(item));
    }


}
