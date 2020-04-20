package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask6;

//6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(provXy(4,4));
    }

    public static boolean provXy(int x, int y)
    {
        boolean b = true;

        if (x > 5) b = false;
        if (x < - 5) b = false;

        if (y > 4) b = false;
        if (y < - 3) b = false;

        if ((x > 2) && ((y < 4 ) || ( y > -3))) b = false;
        if ((x < - 2) && ((y > - 4 ) || ( y < - 3))) b = false;

        return b;
    }
}


