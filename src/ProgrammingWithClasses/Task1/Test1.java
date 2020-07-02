package ProgrammingWithClasses.Task1;

public class Test1
{
    int x = 3;
    int y = 7;

    public void writeVariables()
    {
        System.out.println("x = " + x + " y = " + y);
    }

    public void summVariables()
    {
        System.out.println("Сумма двух переменных равна = " + (x + y));
    }

    public void findMax()
    {
        if (x > y) System.out.println("x = max");
        if (x < y) System.out.println("y = max");
        if (x == y) System.out.println("x == y");
    }
}
