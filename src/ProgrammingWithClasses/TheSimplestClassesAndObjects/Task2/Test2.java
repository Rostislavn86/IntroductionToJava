package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task2;

public class Test2
{
    private int x;
    private int y;

    public Test2()
    {
    }

    public Test2(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        System.out.println("get x = " + x);
        return x;
    }

    public int getY()
    {
        System.out.println("get y = " + y);
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

}
