public class Chopsticks {
    public static int getmax(int[] length) {
        int pair = 0;
        int count = 1;
        for(int i = 0; i < length.length; i ++) {
            if(count % 2 != 0) {
                count -= 1;
            }
            pair += count / 2;
//            System.out.println("pair " + pair);
            count = 1;
            for(int j = i + 1; j < length.length; j++) {
                if(length[i] < 0) {
                    break;
                }
                if(length[j] == length[i]) {
                    count++;
                    length[j] = -1;
                }
//                System.out.println("count " + count);
            }
        }
        return pair;

    }

    public static void main(String[] args) {
        int[] test = {1,2,3,2,1,2,3,2,1};

        System.out.println(getmax(test));
    }

}
