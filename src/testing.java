import java.util.Scanner;

public class testing
{
    static int Omer(int mof, int sasson)
    {
        Scanner input = new Scanner(System.in);
        int x,mof1=mof;
        int sumof = 0;
        while (mof1 != 0)
        {
            x = mof1 % 10; /*yehidot*/
            mof1 = mof1 / 10; /*zorkim yehidot*/
            sumof = sumof + x;
        }
        int x1,sasson1=sasson;
        int sumsasson = 0;
        while (sasson1 != 0)
        {
            x1 = sasson1 % 10; /*yehidot*/
            sasson1 = sasson1 / 10; /*zorkim yehidot*/
            sumsasson = sumsasson + x1;
        }
        if (sumof>sumsasson)
            return mof;
        else
            return sasson;


    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(Omer(1234,4567));
    }
}
