import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter population now");
	    int population_old = input.nextInt();
        double population_new = population_old;
        for (int i = 1 ; i < 21 ; i++)
        {
            population_new =  (population_new * 1.05);
        }

        System.out.println("The population in 20 years will be: " + (int)population_new);
    }
}
