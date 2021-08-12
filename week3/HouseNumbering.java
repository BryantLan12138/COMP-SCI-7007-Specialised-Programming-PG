/*
* You have gotten a new job: your task is to put house numbers onto a range of houses. All these houses are on one side of a long road. The first of these houses (the one with the smallest number) has the number firstHouse. There are numberOfHouses houses in the range of houses you should number.

As is customary, the street uses odd house numbers for one side of the street and even house numbers for the other side. As the houses you should number are on the same side, their numbers all have the same parity.

Before you go to the street, you need to purchase the material you need. The hardware store only sells individual digits. Calculate how many copies of each digit you'll need. Return a int[] with exactly 10 elements, element x being the number of times the digit x occurs in your collection of house numbers.*/
public class HouseNumbering {
    public static void main(String[] args){

        int[] result = prepareDigits(2, 6);
        for(int element: result){
            System.out.println(element);
        }
    }

    public static int[] prepareDigits(int firstHouse, int numberOfHouse){
        int[] needed_number = new int[numberOfHouse];
        int[] result = new int[10];
        int i,j = 0;
        int current = 0;

        //get the needed_number respectively and store in the 'needed_number'
        for(i = 0; j < numberOfHouse ;){
            needed_number[i] += firstHouse;
            current = firstHouse;
            while (current > 0){
                result[current % 10]++;
                current /= 10;
            }
            firstHouse += 2;
            i++;
            j++;
        }



        return result;
    }
}
