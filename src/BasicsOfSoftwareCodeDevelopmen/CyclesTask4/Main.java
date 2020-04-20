package BasicsOfSoftwareCodeDevelopmen.CyclesTask4;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Main
{
    public static void main(String[] args)
    {
        long summ = 1;

        for (double i = 1; i <201 ; i++)
        {
            summ *= Math.pow(i,2);
        }

        System.out.println("Произведение квадратов первых двухсот чисел = " + summ);

    }
}
