import java.util.Scanner;

public class numofchild
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int countdraw = 0;
        for (int fotg = 1 ; fotg <= 3 ; fotg++)
        {
            System.out.println("Enter Team a name");
            String team_a = input.next();
            System.out.println("Enter " + team_a + " goals number");
            int goals_a = input.nextInt();
            System.out.println("Enter Team b name");
            String team_b = input.next();
            System.out.println("Enter " + team_b + " goals number");
            int goals_b = input.nextInt();
            if (goals_a > goals_b)
            {
                System.out.println("Team " + team_a + " won");
            }
            else if (goals_b > goals_a)
            {
                System.out.println("Team " + team_b + " won");
            }
            else if (goals_a == goals_b)
            {
                System.out.println("Thats a drew");
                countdraw++;
            }
        }
        System.out.println("the num of drew matches: " + countdraw);






    }
} 
