import java.util.Scanner;

public class whileloops
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (number >= 0)
        {
            System.out.println("enter number");
            sum = sum + number;
            number = input.nextInt();
        }
        System.out.println("the sum is: " + sum);

    }
}        