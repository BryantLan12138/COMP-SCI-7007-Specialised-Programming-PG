/*
* You are playing Slay the Spire, an excellent deck-builder strategic game. You are currently taking a turn in a combat.

You have N cards in your hand. All the cards in your hand are attack cards. Each of them has a cost (some number of actions
*
* you have to spend on using the card) and an effect (the amount of damage it deals to the opponent).

You are given the description of the cards: the int[]s actions and damage. Each of these arrays has exactly N elements.
*
* For each valid index i, you have a card that costs actions[i] actions and deals damage[i] damage.
*
* You can only play each card once.



You can spend up to three actions on playing your cards this turn.

Calculate and return the maximum total amount of damage you can deal.
* */

public class SpireAttack {
    /* brute force solution */
    public static int dealMostDamage(int N, int[] actions, int[] damage) {
        int result = 0;
        for(int i = 0; i < N; i++) {
            if(damage[i] > result) {
                result = damage[i];
            }
            for(int j = i + 1; j < N; j++) {
                if(damage[j] > result) {
                    result = damage[j];
                }
                if((actions[i] + actions[j] <= 3) && (damage[i] + damage[j] > result))  {
                    result = damage[i] + damage[j];
                }
                for(int k = j + 1; k < N; k++) {
                    if(damage[k] > result) {
                        result = damage[k];
                    }
                    if((actions[i] + actions[j] + actions[k] <= 3) && (damage[i] + damage[j] + damage[k] > result)) {
                        result = damage[i] + damage[j] + damage[k];
                    }
                    if((actions[j] + actions[k] <= 3) && (damage[j] + damage[k] > result)) {
                        result = damage[j] + damage[k];
                    }
                    if((actions[i] + actions[k] <= 3) && (damage[i] + damage[k] > result)) {
                        result = damage[i] + damage[k];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] actions = {2, 3, 2, 3, 2, 2, 3, 2, 2, 3, 1, 2, 3, 1, 1, 1, 2, 2, 3, 3, 1, 2, 3, 2, 1, 1, 3, 3, 2, 2, 1, 1, 3, 2, 3, 3};
        int[] damage = {77, 44, 72, 74, 98, 26, 31, 94, 5, 17, 43, 13, 47, 75, 50, 66, 70, 33, 13, 84, 30, 90, 43, 28, 61, 96, 15, 99, 54, 78, 46, 87, 37, 99, 31, 72};
        int N = 36;
        System.out.println(dealMostDamage(N, actions, damage));
    }
}
