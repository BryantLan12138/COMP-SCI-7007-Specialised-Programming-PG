/*
*
Given a sequence of K elements, we can calculate its difference sequence by taking the difference between each pair of adjacent elements. For instance, the difference sequence of {5,6,3,9,-1} is {6-5,3-6,9-3,-1-9} = {1,-3,6,-10}. Formally, the difference sequence of the sequence a1, a2, ... , ak is b1, b2, ... , bk-1, where bi = ai+1 - ai.

The derivative sequence of order N of a sequence A is the result of iteratively applying the above process N times. For example, if A = {5,6,3,9,-1}, the derivative sequence of order 2 is: {5,6,3,9,-1} -> {1,-3,6,-10} -> {-3-1,6-(-3),-10-6} = {-4,9,-16}.

You will be given a sequence a as a int[] and the order n. Return a int[] representing the derivative sequence of order n of a.
* */
public class DerivativeSequence {
    public static int[] derSeq(int[] a, int n) {
        //base case
        if (n == 0) {
            return a;
        }

        int[] new_array = new int[a.length - 1];
        for(int i = 0; i < a.length - 1; i++) {
            new_array[i] = a[i+1] - a[i];
        }
        n--;
        return derSeq(new_array, n);
    }

    public static void main(String[] args) {
        int[] test = {-100, 100};
        int[] result = derSeq(test, 0);
        for(int i: result) {
            System.out.println(i);
        }
    }
}
