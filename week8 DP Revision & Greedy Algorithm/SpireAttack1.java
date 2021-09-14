public class SpireAttack1 {
    public static int dealMostDamage(int N, int[] actions, int[] damage) {
        int current_damage = 0;
        for(int i = 0; i < N; i++) {
            if(actions[i] <= 3 && damage[i] > current_damage)  {
                current_damage = damage[i];
            }
            for(int j = i + 1; j < N; j++) {
                if(actions[j] <= 3 && damage[j] > current_damage) {
                    current_damage = damage[j];
                }
                if((actions[i] + actions[j] <= 3) && (damage[i] + damage[j] > current_damage)) {
                    System.out.println("cannot be you");
                    current_damage = damage[i] + damage[j];
                }
                for(int k = j + 1; k < N; k++) {
                    int d = actions[k] + actions[j] + actions[i];
                    if((actions[k] + actions[j] + actions[i] <= 3) && (damage[i] + damage[j] + damage[k] > current_damage)) {
                        System.out.println("?");

                        current_damage = damage[i] + damage[j] + damage[k];
                    }
                    if((actions[k] + actions[i] <= 3) && (damage[k] + damage[i] > current_damage)) {
                        System.out.println("its me");
                        current_damage = damage[i] + damage[k];
                    }
                    if((actions[k] + actions[j] <= 3) && (damage[k] + damage[j] > current_damage)) {
                        System.out.println("its me 2");
                        current_damage = damage[k] + damage[j];
                    }
                    if((actions[k] <= 3) && (damage[k] > current_damage)) {
                        System.out.println("its me 3");
                        current_damage = damage[k];
                    }
                }
            }
        }
        return current_damage;
    }

    public static void main(String[] args) {
        int[] actions = {1, 1, 1};
        int[] damage = {2, 4, 6};
        System.out.println(dealMostDamage(3, actions, damage));
    }
}
