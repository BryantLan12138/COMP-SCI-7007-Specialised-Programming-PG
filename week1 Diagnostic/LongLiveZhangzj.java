public class LongLiveZhangzj {
    public static void main(String[] args)
    {
        String[] speech = {"je", "le", "ai", "deja", "vu", "et", "je", "le", "veux", "encore"};
        String[] words = {"i", "am", "having", "deja", "vu", "please", "stop", "the", "encore"};
        System.out.println(donate(speech, words));
    }

    public static int donate(String[] speech, String[] words)
    {
        int result = 0;
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < speech.length; j++)
            {
                if(speech[j] == words[i])
                {
                    result++;
                }
            }
        }
        return result;
    }
}
