public class NBAFinals {
    public static int dubsAgain(int[] scores, String team) {
        int warrior = 0;
        int raptor = 0;
        for(int i = 0; i < team.length(); i++) {
            if((team.charAt(i) == 'W') && (scores[i] != 0)) {
                warrior += scores[i];
            }
            if((team.charAt(i) == 'R') && (scores[i] != 0)) {
                raptor += scores[i];
            }
            if((team.charAt(i) == 'W') && (scores[i] == 0) ) {
                warrior += 4;
            }
            if((team.charAt(i) == 'R') && (scores[i] == 0) ) {
                raptor += 1;
            }
            if((team.charAt(i) == '?') && (scores[i] != 0)) {
                warrior += scores[i];
            }
            if((team.charAt(i) == '?') && (scores[i] == 0)) {
                warrior += 4;
            }

        }

        System.out.println("Warrior: " + warrior);
        System.out.println("Raptor: " + raptor);

        return warrior > raptor ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] scores = {2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2};
        String team = "?RR?WW???WRWRR??WRRW??RR??W?RRW?????????RRR?RR?RRRRW???R?RR?RRWWR?W?WRW????RR?RW?";
        System.out.println(dubsAgain(scores, team));
    }
}
