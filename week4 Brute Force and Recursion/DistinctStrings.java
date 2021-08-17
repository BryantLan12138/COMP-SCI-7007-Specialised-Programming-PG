import java.util.Arrays;

/*
*
Help Donna pick a password!

Her password should have exactly L characters. The letters the password may contain are given in the String letters.

Generate N mutually distinct possible passwords for Donna, so that she can pick one that appeals to her. Return the generated passwords in a String[]*/
public class DistinctStrings {

    public static String[] generate(int L, String letters, int N) {
        String[] result = new String[N];
        int i = 0;
        int j = 1;
        int count = 0;

        while( j != letters.length()) {
            while( i != letters.length()) {
                if( i + L < letters.length()) {
                    result[i] = letters.substring(i, i+L);
                    i++;
                    count++;
                    if(count == N) {
                        break;
                    }
                }
                else {
                    i = j;
                    j++;
                    break;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        String[] test = generate(5,"qwertyuiopasdfghjklzxcvbnm",30);
        System.out.println(Arrays.toString(test));
    }
}
