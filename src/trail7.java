import java.util.Scanner;

public class trail7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum2 = 0;
        for (int i = 1 ; i <= 3 ; i++)
        {
            System.out.println("enter child name");
            String name = input.next();
            System.out.println("Enter sum1 of money");
            int sum1 = input.nextInt();
            if (sum1 > 500)
            {
                System.out.println(name + " Excellent");
            }
            else if (sum1 >= 300 && sum1 < 500)
            {
                System.out.println(name + " Very good");
            }
            else
            {
                System.out.println(name + " Thanks");
            }
            sum2 = sum2 + sum1;
        }
        System.out.println("The sum is " + sum2);
    }

} 
