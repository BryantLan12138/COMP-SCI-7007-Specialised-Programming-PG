public class FunnyFence {
    /*
    * A sequence of characters is called a fence if it consists of alternating '|' and '-' characters,
    * like "|-|-|-|" or "-|-|" (quotes for clarity only). Notice that "|-||-|" or "--" are not fences,
    * because each contains two equal characters adjacent to each other. Given a string s,
    * find the longest consecutive substring of it that is a fence, and return its length.
    * */
    public static void main(String[] args)
    {
        String s = "|||-||--|--|---|-||-|-|-|--||---||-||-||-|--||";
        System.out.println(getLength(s));
    }

    public static int getLength(String s)
    {
        int length = 1;
        int tmp = 1;
        for(int i = 0 ; i < s.length() - 1; i++)
        {
            if(s.charAt(i) != s.charAt(i+1)){
                length++;
            }
            //if consecutive numbers are identical
            //store the current length
            else {
                //only update when bigger length is detected
                if(tmp < length)
                {
                    tmp = length;
                }
                length = 1;

            }
        }
        return tmp > length? tmp: length;
    }
}
