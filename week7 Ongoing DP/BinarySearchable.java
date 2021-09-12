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
        int[] input = {-9262, -9244, -8963, -8917, -8790, -8556, -8438, -8066, -7932, -7772, -7378, -6513, -5303, -4572, -4454, -4244, -3929, -3453, -3378, -3076, -2757, -2513, -1922, -1115, -596, -329, -174, 13, 1836, 3018, 3038, 4578, 4997, 5244, 5504, 5687, 6251, 6291, 6303, 6702, 6835, 7168, 7184, 7543, 8007, 9909};
        System.out.println(howMany(input));
    }
}
