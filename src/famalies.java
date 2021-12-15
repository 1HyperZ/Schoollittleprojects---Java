import java.util.Scanner;

public class famalies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String fnames = "";
        int sum = 0;
        for (int x = 1 ; x <= 230 ; x++)
        {
            System.out.println("enter family name");
            String fname = input.next();
            System.out.println("enter adults number");
            int a = input.nextInt();
            System.out.println("enter kids number");
            int b = input.nextInt();
            sum = sum + a + b;
            if (b == 0)
            {
                fnames = fnames + " " + fname;
            }
            else
            {
                fnames = fnames;
            }
        }
        System.out.println("The number of kids and adults that are going out for trip = " + sum);
        System.out.println("The Family Names are - " + fnames);
    }

}
