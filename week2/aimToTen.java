public class aimToTen {
    public static void main(String[] args)
    {
        int[] marks = {8, 9};
        System.out.println(need(marks));
    }

    public static int need(int[] marks)
    {
        float average;
        int sum = 0;
        int result = 0;

        for(int mark: marks)
        {
            sum += mark;
        }

        //get average
        average = (float)(sum/marks.length);

        //base case
        if(average >= 9.5)
        {
            return 0;
        }

        while(average < 9.5)
        {
            result++;
            average = (float)( sum + 10*result ) / (marks.length + result);

        }


        return result;
    }
}
