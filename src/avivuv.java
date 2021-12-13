import java.util.Scanner;

public class avivuv
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number 1-9");
        int max = 0;
        int count = 1;
        for (int i = 1 ; i <= 3 ; i++)
        {
            System.out.println("Enter a number 1-9");
            int num1 = input.nextInt();
            if (num1 > max)
            {
                max = num1;
                count = 0;
            }

            if (num1 == max)
            {
                count++;
            }
        }
        System.out.println("The max number is: " + max + " The max appeared: " + count);
    }
}
