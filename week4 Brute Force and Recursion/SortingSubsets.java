import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/*

You are given a int[] a. The elements of a are not necessarily distinct.

You want to rearrange the elements of a into a non-decreasing order. What is the smallest possible number of elements you have to move?

Formally, the operation looks as follows:

You select some set of positions in a.
You permute the elements on the chosen positions arbitrarily.
Compute and return the smallest possible size of the set of selected positions.

*/

public class SortingSubsets {
    public int count = 0;
    public int getMinimalSize(int[] a) {

//        for(int i: a) {
//            System.out.println("a: " + i);
//        }

        //base case
        if( a.length <= 1) {
            return count;
        }

        //use ArrayList to remove element for the array
        List<Integer> original = new ArrayList<Integer>();
        List<Integer> sorted = new ArrayList<Integer>();
        for(int i: a) {
            original.add(i);
        }
//        System.out.println("original: " + original);

        for(int j: a) {
            sorted.add(j);
            Collections.sort(sorted);
        }
//        System.out.println("sorted: " + sorted);

        if(original.get(0) != sorted.get(0)) {
//            if(original.size() >= 2)
//            {
//                count += 2;
//            }
//            else
            count++;
//            System.out.println("count: " + count);
        }

        original.remove(0);
        sorted.remove(0);

//        System.out.println(original);
        Object[] tmp = original.toArray();
//        for(Object obj: tmp) {
//            System.out.println(obj);
//        }

        int[] updated_array = new int[tmp.length];

        for(int i = 0; i < tmp.length; i++) {
            updated_array[i] = (int)tmp[i];
        }

        return getMinimalSize(updated_array);

    }


    public static void main(String[] args) {
        int[] test = {11, 11, 49, 7, 11, 11, 7, 7, 11, 49, 11};
        int[] test1 = {3, 2, 1};
        int[] test2 = {4, 4, 4, 3, 3, 3};
        SortingSubsets a = new SortingSubsets();
        System.out.println(a.getMinimalSize(test));
        System.out.println(a.getMinimalSize(test1));
        System.out.println(a.getMinimalSize(test2));
    }
}
