import java.util.Random;
import java.util.Scanner;

public class random
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(1)+6;
        System.out.println(num);
    }
}        