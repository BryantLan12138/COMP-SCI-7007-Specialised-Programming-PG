public class MarriageAndTravelingChallenge {

    /*One of the challenges after marriage is traveling to have a great honeymoon. An inseparable part of such travel is hiking in the mountains.

    When you shout in the mountains, you can sometimes hear an echo. The echo will say the same thing but it will make it sound longer.

    In this problem, we will assume that the echo will repeat the i-th letter of your word i times. (Here we number the letters starting from 1 for the leftmost letter.)

    For example, if you say "salam", the echo will say "saalllaaaammmmm". */

    public static String solve(String S){
        String echo = "";

        //use two index for this question
        int i, j = 0;

        //for loop does not have to start from 0 by using scope variable
        for(i = 0, j = 1;i < S.length() - 1;){
            echo += S.charAt(i);
            i += j;
            j++;
        }
        return echo;

    }

    public static void main(String[] args){
        System.out.print(solve("aaa"));
    }
}
