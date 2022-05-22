import java.util.Scanner;

public class Rect {
    private int width;
    private int height;

    public Rect(int witdh, int height) {
        this.width = witdh;
        this.height = height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
    public int calcPerimeter()
    {
        return (2 * (height + width));
    }
    public int calcArea()
    {
        return (height * width);
    }


} 
