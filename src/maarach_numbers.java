import java.util.*;

public class maarach_numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int[]numbers = new int[10];
        for (int i = 0 ; i < numbers.length ; i++)
        {
            numbers[i] = rnd.nextInt(999-100+1)+100;
        }
        int min = 1000;
        int max = 100;
        int count = 1;
        String highest = "";
        for (int i = 0 ; i < numbers.length ; i++)
        {
            if (numbers[i] == min)
            {
                count ++;
            }
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        for (int i = 0 ; i < numbers.length ; i++)
        {
            if (numbers[i] == max)
            {
                highest = Integer.toString(i) + ",";
            }
            if (numbers[i] > max)
            {
                max = numbers[i];
                highest = Integer.toString(i);
            }
        }
        System.out.println("the lowest number was " + min + " and it showed " + count + " times and the highest number was " + max + " and it showed in the indexes " + highest);
        for (int i = 0 ; i < numbers.length ; i++)
        {
            System.out.print(numbers[i] + ",");
        }
    }
}        