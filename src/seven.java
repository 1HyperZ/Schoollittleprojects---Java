import java.util.Scanner;

public class seven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number with 2 digits: ");
        int num = input.nextInt();
        int digit1 = (num / 10);
        int digit2 = (num % 10);
        if ((digit1 == 7) || (digit2 == 7))
        {
            if (num % 7 == 0)
            {
                System.out.println("***");
            }
            else
            {
                System.out.println("*");
            }
        }
        else if (num % 7 == 0)
        {
            System.out.println("**");
        }
    }
}
