public class BritishCoins {
    public static int[] coins(int pence) {
        int pounds = 0;
        int shillings = 0;
        int pennies = 0;
        pounds = pence / 240;
        shillings = (pence - 240*pounds) / 12;
        pennies = pence - (pounds*240 + shillings*12);

        int[] result = new int[3];
        result[0] = pounds;
        result[1] = shillings;
        result[2] = pennies;

        return result;
    }

    public static void main(String[] args) {
        int[] result = coins(10000);
        for(int i: result) {
            System.out.print(i + " ");
        }
    }
}
