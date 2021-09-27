public class LinearPolyominoCovering {
    public static String findCovering(String region) {
        int count_X = 0;
        int tmp = 0;
        String tmp_string = "";
        String result = "";
        for(int i = 0; i < region.length(); i++) {
            if(region.charAt(i) == '.') {
                tmp = tmp_string.length() % 4;
                if(tmp != 2 && tmp != 0) {
                    return "impossible";
                }
                for(int j = 0; j < tmp_string.length() / 4; j++) {
                    result += "AAAA";
                }
                if(tmp == 2) {
                    result += "BB";
                }
                tmp_string = "";
                result += region.charAt(i);
            }
            // for string not detected a dot
            else {
                tmp_string += region.charAt(i);
            }
        }
        int check = tmp_string.length() % 4;
        if(check != 2 && check!= 0) {
            return "impossible";
        }

        for(int j = 0; j < tmp_string.length() / 4; j++) {
            result += "AAAA";
        }
        if(check == 2) {
            result += "BB";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findCovering("..........XXXXXX........XXXX........XX.........."));
    }
}
