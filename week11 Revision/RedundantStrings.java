public class RedundantStrings {
    /*
    * The key to this problem is given in the statement.
    * Every redundant string has a unique non-redundant root.
    * To count the number of redundant strings of a given length,
    * we only need to consider the possible roots.
    * Based on a divisibility argument, the length of a root must
    * divide the length of the string. Thus, to find all non-redundant roots,
    * we iterate over all possible divisors
    * */
    public static int howMany(int length) {
        int count = 0;
        int result = 0;

        if(length == 1) {
            return 0;
        }

        for(int i = 1; i < length; i++) {
            // we only care about the string length
            // if it is not a prime number
            if(length % i == 0) {
                count = howMany(i);
                count -= Math.pow(2, i);
                result += Math.abs(count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(howMany(17));
    }
}
