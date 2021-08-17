import java.util.*;
import java.util.Iterator;

public class FriendlySequence {
    /*
    * We call two numbers friendly if they have the same digits, ignoring order or repetition.
    * For example 122213 and 312 are friendly while 145 and 2544411 are not.
    * A sequence is friendly if it contains at least two numbers,
    * and all possible pairs of numbers within it are friendly.
    * Two contiguous subsequences are different if they have a different start index,
    * end index or both.
    * */

    public static void main(String[] args)
    {
        int[] example = {112, 12, 21, 354, 534345, 345, 2221};
        System.out.println(count(example));
    }

    public static int count(int[] array)
    {
        int result = 0;

        //convert int to string, to easier iterate
        String[] tmp = new String[array.length];
        for(int i = 0; i < array.length; i++)
        {
            tmp[i] = Integer.toString(array[i]);
        }

        for(int i = 0; i < tmp.length; i++)
        {
            for(int j = i + 1; j < tmp.length; j++)
            {
                if(check(tmp[i], tmp[j]))
                {
                    result++;
                }
                else
                    break;
            }
        }

        return result;
    }

    public static boolean check(String a, String b)
    {
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(int i = 0; i < a.length(); i++)
        {
            set1.add(a.charAt(i));
        }
//        System.out.println("Set1");
//
//        Iterator<Character> iterator = set1.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.print(iterator.next());
//        }

        for(int i = 0; i < b.length(); i++)
        {
            set2.add(b.charAt(i));
        }

//        Iterator<Character> iterator2 = set2.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator2.next());
//        }

        return set1.equals(set2);
    }
}
