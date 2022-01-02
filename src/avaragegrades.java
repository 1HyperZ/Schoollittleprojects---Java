import java.util.Scanner;

public class avaragegrades
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int grade = 0, numofgrades = 0, sum = 0;
        while (grade <= 100)
        {
            sum = sum +grade;
            numofgrades ++;
            System.out.println("enter grade");
            grade = input.nextInt();
        }
        numofgrades = numofgrades - 1;
        System.out.println("num of grades entered = " + numofgrades);
        System.out.println("the average is: " + (sum/numofgrades));
    }
}        