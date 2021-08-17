public class KerimJavati {
    public static int howLong(String text)
    {
        int keystrokes = 0;
        for(int i = 0; i < text.length(); i++)
        {
            keystrokes += 2*((int)text.charAt(i) - 'a');
            keystrokes++;
        }
        return keystrokes;
    }

    public static void main(String[] args)
    {
        String example = "hajikerim";
        System.out.println(howLong(example));
    }

}
