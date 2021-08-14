import java.util.Arrays;

public class SudokuTypo {
    public static int fix(int[] digits){

    int[] count = new int[10];

    //update count elements according to the digits appearance
    for(int i = 0; i < digits.length; i++) {
        count[digits[i]]++;
    }

    //index start from 1
    for(int i = 1; i < count.length; i++) {
        if(count[i] < 9){
            return i;
        }
    }
        //return 0 stands for no typo in the given Sudoku
        return 0;
    }



    public static void main(String[] args){
        int[] test =
                {5, 3, 4, 6, 7, 8, 9, 1, 2, 6, 7, 2, 1, 9, 5, 3, 4, 8, 1, 9, 8, 3, 4, 2, 5, 6, 7, 8, 5, 9, 7, 6, 1, 4, 2, 3, 4, 2, 6, 8, 5, 3, 7, 9, 1, 7, 1, 3, 9, 2, 4, 8, 5, 6, 9, 6, 1, 5, 3, 7, 2, 8, 4, 2, 8, 7, 4, 1, 9, 1, 3, 5, 3, 4, 5, 2, 8, 6, 1, 7, 9};
        System.out.println(fix(test));
    }
}
