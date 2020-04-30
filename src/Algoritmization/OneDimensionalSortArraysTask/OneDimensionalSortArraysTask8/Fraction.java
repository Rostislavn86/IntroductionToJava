package Algoritmization.OneDimensionalSortArraysTask.OneDimensionalSortArraysTask8;

public class Fraction
{
    public int getNod(int a, int b)
    {
        if (a % b == 0)
        {
            return b;
        }
        if (b % a == 0)
        {
            return a;
        }
        if (a > b) {
            return getNod(a%b,b);
        }
        return getNod(a,b%a);
    }

    public int getNok(int a, int b)
    {

        return (a*b)/(getNod(a,b));
    }

}
