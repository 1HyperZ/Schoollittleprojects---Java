import java.util.Scanner;

public class pibonachi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt(), first = 0, second = 1, nextnum = 1;
        System.out.print(first);
        while (nextnum < num)
        {
            System.out.print("," + nextnum);
            nextnum = first + second;
            first = second;
            second = nextnum;
        }
    }
}