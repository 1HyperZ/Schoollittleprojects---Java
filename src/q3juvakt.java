import java.util.Scanner;

import static java.lang.Math.pow;

public class q3juvakt
{
    static int Count(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num = num/10;
            count++;
        }
        return count;
    }
    static int rotate_right(int num)
    {
           int right_num = num%10;
           int rotated_num = (int) ((num/10) + (right_num * pow(10, Count(num)-1)));
           return rotated_num;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = input.nextInt();
        for (int i=0 ; i<Count(num) ; i++)
        {
            num = rotate_right(num);
        }
        System.out.println("the full rotated num = " + num);

    }
} 
