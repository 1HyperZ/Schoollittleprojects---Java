import java.util.Scanner;

public class atzamim_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[62];
        int count = 0;
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < 62 ; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
    }
} 
