public class Exam2p3 {
    public static int countWays(String s) {
        if(s == "") {
            return 1;
        }

        int index = 0;
        int result = 1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                index++;
            }
            if(s.charAt(i) == ')') {
                result = result * index;
                index--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countWays("(((())))"));
    }
}
