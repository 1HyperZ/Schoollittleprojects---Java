import java.util.Scanner;

public class shopsum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num of groceries: ");
        int n = input.nextInt();
        System.out.println("Enter prices for the groceries: ");
        double sum = 0;
        for (int i = 1 ; i <= n ; i++)
        {
            double price = input.nextDouble();
            sum = sum + price;

        }
        System.out.println("the sum is: " + sum);
    }

}    