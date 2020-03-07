package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask4;

public class Main
{
    public static void main(String[] args)
    {
        double r = 123.456;

        System.out.printf("%.3f" ,reversMethod(r));
    }

    public static double reversMethod(double x)
    {
        double drobnChast;

        drobnChast = x;

        drobnChast = drobnChast % 100;

        drobnChast = drobnChast % 10;

        drobnChast = drobnChast % 1;

        drobnChast = drobnChast * 1000;

        return drobnChast + x/1000;
    }
}
