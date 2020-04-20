package Algoritmization;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class DekompozitsiyaAndMethodsTask2
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 88;

        System.out.println("Наибольший общий делитель = " + getNodFinal(getNodAB(a,b), getNodCD(c,d)));
        System.out.println("Наибольшее общее кратное  = " + getNokFinal(getNokAB(a,b),getNokCD(c,d)));

    }

    private static int getNodAB(int a, int b)
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
            return getNodAB(a%b,b);
        }
        return getNodAB(a,b%a);
    }

    private static int getNodCD(int a, int b)
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
            return getNodCD(a%b,b);
        }
        return getNodCD(a,b%a);
    }

    private static int getNodFinal(int a, int b)
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
            return getNodFinal(a%b,b);
        }
        return getNodFinal(a,b%a);
    }

    private static int getNokAB(int a, int b)
    {

        return (a*b)/(getNodAB(a,b));
    }

    private static int getNokCD(int c, int d)
    {

        return (c*d)/(getNodAB(c,d));
    }

    private static int getNokFinal(int c, int d)
    {

        return (c*d)/(getNodAB(c,d));
    }

}
