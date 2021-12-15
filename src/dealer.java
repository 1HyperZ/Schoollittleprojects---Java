import java.util.Scanner;

public class dealer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of packages: ");
        int packages_number = input.nextInt();
        System.out.println("enter number of sold packages: ");
        int sold_packages = input.nextInt();
        if (packages_number * 5 > sold_packages * 10)
        {
            System.out.println("the dealer lost money");
        }
        else if (packages_number * 5 < sold_packages * 10)
        {
            System.out.println("the dealer gained money");
        }
    }
}
