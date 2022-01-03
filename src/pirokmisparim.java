import java.util.Scanner;

public class pirokmisparim
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num, num2, x;
        num = input.nextInt();
        int rev = 0;
        while (num != 0)
        {
            x = num % 10; /*yehidot*/
            num = num / 10; /*zorkim yehidot*/
            rev = (rev * 10) + x;
        }
        System.out.println(rev);

    }
}        