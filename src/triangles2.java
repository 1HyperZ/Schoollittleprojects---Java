import java.util.Scanner;

public class triangles2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter positive num1");
        int num1 = input.nextInt();
        System.out.println("enter positive num2");
        int num2 = input.nextInt();
        System.out.println("enter positive num3");
        int num3 = input.nextInt();
        if (num1 == num2 || num2 == num3 || num1 == num3)
        {
            if (num1 == num2 && num2 == num3)
            {
                System.out.println("all sides of the triangle are equal");
            }
            else
            {
                System.out.println("2 sides of the triangle are equal");
            }
        }
        else
        {
            System.out.println("none of the sides are equal");
        }




    }
}
