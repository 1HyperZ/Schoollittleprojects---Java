import java.util.Scanner;

public class Assignments
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many assignments");
        int assignments = input.nextInt();
        System.out.println("enter how many submitted assignments");
        int submitted_assignments = input.nextInt();
        if (assignments == submitted_assignments)
        {
            System.out.println("Very good");
        }
        else if ((submitted_assignments > 0) && (submitted_assignments < assignments))
            {
                System.out.println("Good");
            }
        else if (submitted_assignments < 0)
        {
            System.out.println("Very Bad");
        }

    }
}
