import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int max = 0;
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("enter number: ");
            num = input.nextInt();
            if (num > max)
            {
                max = num;
            }
        }
        System.out.println("The max is: " + max);
    }
} 
