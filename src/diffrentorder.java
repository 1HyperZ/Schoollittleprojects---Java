import java.util.Scanner;

public class diffrentorder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int rev = 0, yehidot, num = input.nextInt();
        while (num != 0)
        {
            yehidot = num % 10;
            num = num / 10;
            rev = (rev * 10) + yehidot;
        }
        System.out.println("The rev of this number is: " + rev);
    }
} 
