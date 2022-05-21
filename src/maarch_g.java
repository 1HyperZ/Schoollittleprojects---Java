import java.util.Scanner;

public class maarch_g
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[62];
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < 62 ; i++)
        {
            if (arr[i] > 99 && arr[i] < 1000)
            {
                sum = sum + arr[i];
                if (arr[i] > 248)
                    count++;
            }
        }
        System.out.println("the sum of 3 digit numbers is " + sum + "the number of 3 digit numbers that higher thank 248 is " + count);
    }
} 
