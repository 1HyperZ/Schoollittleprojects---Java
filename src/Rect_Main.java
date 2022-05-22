import java.util.Scanner;

public class Rect_Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Rect giladkindofsquare = new Rect(20,30);
        giladkindofsquare.setWidth(10);
        giladkindofsquare.setHeight(80);
        int giladperimieter = giladkindofsquare.calcPerimeter();
        int giladarea = giladkindofsquare.calcArea();
        System.out.println(giladperimieter);
    }
} 
