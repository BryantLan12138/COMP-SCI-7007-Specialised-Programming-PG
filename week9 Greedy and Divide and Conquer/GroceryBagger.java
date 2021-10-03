import java.util.Arrays;
import java.util.Hashtable;

public class GroceryBagger {
    public static int minimumBags(int strength, String[] itemType) {
        int types = 1;
        int count = 0;
        int result = 0;
        Arrays.sort(itemType);
        String tmp = itemType[0];
        String end = itemType[itemType.length - 1];
        for(String i: itemType) {
            System.out.println(i);
        }

//        Hashtable<String, Integer> hashtable = new Hashtable<>();
//        for(int i = 0; i < itemType.length; i++) {
//            if(hashtable.contains(itemType[i])) {
//                int count = hashtable.get(itemType[i]) + 1;
//                System.out.println("count" + count);
//                hashtable.put(itemType[i], count);
//            }
//            else {
//                hashtable.put(itemType[i], 1);
//            }
//        }

//        System.out.println(hashtable);
        for(int i = 0; i < itemType.length; i++) {
            if(i == itemType.length - 1) {
//                if(count < strength) {
//                    System.out.println("1");
//                    result += 1;
//                }
//                else if((count > strength) && (count % strength == 0)) {
//                    System.out.println("2");
//
//                    result += count / strength;
//                }
//                else{
//                    System.out.println("3");
//
//                    result += 1;
//                }
                count++;
                System.out.println(count);
                result += (count / strength);
                System.out.println("here " + result );
                if(count % strength > 0) {
                    result++;
                }
                System.out.println("here2 " + result );

            }
            else if(itemType[i] == tmp) {
                count++;
                System.out.println("count: " + count);
            }
            else {
//                if(count < strength) {
//                    result += 1;
//                }
//                else if((count > strength) && (count % strength ==0)) {
//                    result += count / strength;
//                }
//                else{
//                    result += (count / strength) + 1;
//                }
                result += (count / strength);
                if(count % strength > 0) {
                    result++;
                }
//                System.out.println("count in else: " + count);
//                System.out.println("result:" + result);
                tmp = itemType[i];
                count = 1;
                types++;
            }
        }

//        System.out.println("types:" + types);
        return result;
    }

    public static void main(String[] args) {
        String[] itemType =
                {"DAIRY",
                        "DAIRY",
                        "PRODUCE",
                        "PRODUCE",
                        "PRODUCE",
                        "MEAT"}
                ;
        System.out.println(minimumBags(2, itemType));
    }

}
