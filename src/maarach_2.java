import java.util.Scanner;

public class maarach_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1};
        int[] numbers1 = {1};
        boolean answer = true;
        for (int i = 0 ; i < numbers.length ; i++)
        {
            if (numbers1[i] != numbers[i]);
            {
                answer = false;
            }
        }
        System.out.println(answer);

    }
}        