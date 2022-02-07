import java.util.Scanner;

public class maarch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[]numbers = {1,5,6,75,34,34};
        System.out.println("enter num: ");
        int num = input.nextInt();
        int indexnum = numbers[num];
        System.out.println(indexnum);
        int secondindex=-1;
        for(int index = 0;index < numbers.length;index++)
        {
            if (indexnum == numbers[index])
            {
                if (index != num)
                {
                    secondindex =  index;
                }
            }
        }
        if (secondindex == -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("the number appear again in index " + secondindex);
        }

    }
}        