import java.util.Scanner;

public class mathtest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int test_score = 0;
        String name;
        for (int x = 1 ; x <= 3; x++)
        {
            System.out.println("Enter name: ");
            name = input.next();
            System.out.println("Enter student score: ");
            test_score = input.nextInt();
            if(test_score >= 85)
            {
                System.out.println("going to 5 yah");
            }
            else if (test_score < 60)
            {
                System.out.println("going to 3 yah");
            }

        }
    }

}
