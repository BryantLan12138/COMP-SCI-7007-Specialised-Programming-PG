public class BinarySearchable {
    public static int howMany(int[] sequence) {
        int result = 0;

//        for(int i = 0; i < sequence.length; i++) {
//            boolean check = true;
//            for(int j = 0; j < sequence.length; j++) {
//                if ((sequence[j] < sequence[i] && j > i) || (sequence[j] > sequence[i] && j < i)) {
//                    check = false;
//                    break;
//                }
//            }
//            if(check)
//                result++;
//        }
//        return result;

        // assume sequence[i] is the pivot
        for(int i = 0; i < sequence.length; i++) {
            boolean check = true;

            // check any element on pivot left side is smaller than pivot
            for(int j = 0; j < i; j++) {
                if(sequence[j] > sequence[i]) {
                    check = false;
                    break;
                }
            }
            if(check == true) {
                // check any element on pivot left side is bigger than pivot
                for(int k = i + 1; k < sequence.length; k++) {
                    if(sequence[k] < sequence[i]) {
                        check = false;
                        break;
                    }
                }
            }

            if(check) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 4, 5, 7, 6, 8};
        System.out.println(howMany(input));
    }
}
