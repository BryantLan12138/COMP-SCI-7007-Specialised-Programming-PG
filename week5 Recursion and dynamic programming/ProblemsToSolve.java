import java.util.*;
/*
*
Your teacher has given you some problems to solve.
* You must first solve problem 0. After solving each problem i,
* you must either move on to problem i+1 or skip ahead to problem i+2.
* You are not allowed to skip more than one problem.
* For example, {0, 2, 3, 5} is a valid order, but {0, 2, 4, 7}
* is not because the skip from 4 to 7 is too long.

You are given a int[] pleasantness, where pleasantness[i]
* indicates how much you like problem i.
* The teacher will let you stop solving problems once the
* range of pleasantness you've encountered reaches a certain threshold.
* Specifically, you may stop once the difference between the maximum and
* minimum pleasantness of the problems you've solved is greater than or
* equal to the int variety. If this never happens, you must solve all the problems.
* Return the minimum number of problems you must solve to satisfy the teacher's requirements.*/

public class ProblemsToSolve {
    static int variety = 0;
    public static int[] pleasantness;
    public static int minNumber(int[] pleasantness, int differ) {
        ProblemsToSolve.variety = differ;
        ProblemsToSolve.pleasantness = pleasantness;

        return p(0, pleasantness[0], pleasantness[0], 1);
    }

//    public static int findMax(int[] pleasantness) {
//        // find max value of the array
//        int MaxPleasant = 0;
//        for(int i = 0 ; i < pleasantness.length; i++) {
//            if(MaxPleasant < pleasantness[i]) {
//                MaxPleasant = pleasantness[i];
//            }
//
//        }
//
//        return MaxPleasant;
//    }
//
//    public static int findMin(int[] pleasantness) {
//        // find max value of the array
//        int MinPleasant = pleasantness[0];
//        for(int i = 1 ; i < pleasantness.length; i++) {
//            if(MinPleasant > pleasantness[i]) {
//                MinPleasant = pleasantness[i];
//            }
//        }
//
//        return MinPleasant;
//    }

    // recursive function
    public static int p(int index, int MinPleasant, int MaxPleasant, int problemSolved) {
        // index of problem have just been solved
        int justSolved = 0;


        // base cases
        if(MaxPleasant - MinPleasant >= variety) {
            return problemSolved;
        }

        if (index >= pleasantness.length - 2)
        {
            return problemSolved + 1;
        }

        // if reaches to the end of pleasantness
        if(MaxPleasant - MinPleasant < variety && pleasantness[justSolved] == pleasantness[pleasantness.length - 1]) {
            return pleasantness.length;
        }

        if(pleasantness.length == 1) {
            return 1;
        }

        return Math.min(p(index+1, Math.min(MinPleasant, pleasantness[index+1]), Math.max(MaxPleasant, pleasantness[index+1]), problemSolved+1),
                p(index+2, Math.min(MinPleasant, pleasantness[index+2]), Math.max(MaxPleasant, pleasantness[index+2]), problemSolved+1));
    }

    public static void main(String[] args) {
        int[] test = {10, 1, 12, 101};
        System.out.println(minNumber(test, 100));
    }
}
