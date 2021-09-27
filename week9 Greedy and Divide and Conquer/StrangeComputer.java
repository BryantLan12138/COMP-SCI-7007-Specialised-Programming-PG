public class StrangeComputer {
    public static int setMemory(String mem) {
        int result = 0;
        char base = '0';
        for(int i = 0; i < mem.length(); i++) {
            if(mem.charAt(i) != base) {
                result++;
                base = mem.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(setMemory("0110011100101001101001000001011000011001010110110"));
    }
}
