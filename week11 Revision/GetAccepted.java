public class GetAccepted {
    public static String answer(String question) {
        int count = 0;
        String[] splited = question.split("\\s+");
        for(String i: splited) {
            if(i.equals("not")) {
                count++;
            }
        }

        if(count % 2 == 0) {
            return "True";
        }

        return "False";
    }

    public static void main(String[] args) {
        System.out.println(answer("Do you not want to not get not not not accepted?"));
    }
}
