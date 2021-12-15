import java.util.Scanner;

public class triangles
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("enter num1");
         num1 = input.nextInt();
        System.out.println("enter num2");
        num2 = input.nextInt();
        System.out.println("enter num3");
        num3 = input.nextInt();
        if ((num1 + num2 < num3) || (num1 + num3 < num2) || (num2 + num3 < num1))
        {
            System.out.println("this 3 numbers cannot be sides of a triangle");
        }
        else
        {
            System.out.println("this 3 numbers can be sides of a triangle");
        }
    }
}
