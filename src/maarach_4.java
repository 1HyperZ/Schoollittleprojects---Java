import java.util.Scanner;

public class maarach_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        for (int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print("enter num1");
            arr1[i] = input.nextInt();
        }
        int[] arr2 = new int[3];
        for (int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print("enter num2");
            arr2[i] = input.nextInt();
        }
        String number1 = "";
        String number2 = "";
        for (int i = 0 ; i < arr1.length ; i++)
        {
            number1 = number1 + Integer.toString(arr1[i]);
        }

        int number1_int = Integer.parseInt(number1);


        for (int i = 0 ; i < arr2.length ; i++)
        {
            number2 = number2 + Integer.toString(arr2[i]);
        }
        int number2_int = Integer.parseInt(number2);
        int sum_of_arrs = number1_int + number2_int;
        System.out.println("the sum of the arrays = " + sum_of_arrs);

    }
}        