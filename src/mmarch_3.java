import java.util.Scanner;

public class mmarch_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0 ; i < numbers.length ; i++)
        {
            System.out.println("enter a number");
            numbers[i] = input.nextInt();
        }
        for (int i = 0 ; i < numbers.length ; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        int first_pair = numbers[0] + numbers[4];
        int second_pair = numbers[1] + numbers[3];
        System.out.println("first pair = " + first_pair + ", second pair = " + second_pair);
    }
}        