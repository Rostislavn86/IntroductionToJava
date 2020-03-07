package BasicsOfSoftwareCodeDevelopmen.CyclesTask4;

public class Main
{
    public static void main(String[] args)
    {
        long summ = 1;

        for (double i = 1; i <201 ; i++)
        {
            summ *= Math.pow(i,2);
        }

        System.out.println(summ);

    }
}
