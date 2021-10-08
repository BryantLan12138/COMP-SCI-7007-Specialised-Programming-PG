public class GreatFairyWar {
    public static int minHP(int[] dps, int[] hp) {
        int result = 0;
        for(int i = 0; i < hp.length; i++) {
            int tmp = 0;
            // index of j is the key of the solution, it changes based on i so that
            // the calculation avoid calculating the value of dps which has been calculated
            for(int j = i; j < hp.length; j++) {
                 tmp += dps[j];
            }
            result += hp[i] *tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] dps = {20,12,10,10,23,10};
        int[] hp = {5,7,7,5,7,7};
        System.out.println(minHP(dps, hp));
    }
}
