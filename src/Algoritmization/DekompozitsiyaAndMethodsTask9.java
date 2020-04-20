package Algoritmization;

public class DekompozitsiyaAndMethodsTask9
{
    public static void main(String[] args)
    {
        double x = 5;
        double y = 5;
        double z = 6;
        double t = 8;

        System.out.println("S четырёхугольника = " + (findSXY(x,y) + findSZTFindDiag(z,t,findDiag(x,y))));
    }

    public static double findDiag(double x, double y)
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public static double findSXY(double x, double y)
    {
        return 0.5*(x*y);
    }

    public static double findSZTFindDiag(double z, double t, double findDiag)
    {
        //http://ru.solverbook.com/spravochnik/formuly-po-geometrii/formuly-ploshhadi/ploshhad-treugolnika-po-trem-storonam/

        double p;

        p = (z + t + findDiag)*0.5;

        return Math.sqrt(p * (p - z) * (p - t) * (p - findDiag));
    }
}