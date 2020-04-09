package Algoritmization;

public class DekompozitsiyaAndMethodsTask1
{
    public static void main(String[] args)
    {
        int a = 24;
        int b = 333;

        System.out.println("Наибольший общий делитель = " + getNod(a,b));
        System.out.println("Наибольшее общее кратное  = " + getNok(a,b));

    }

    private static int getNod(int a, int b)
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

    private static int getNok(int a, int b)
    {

        return (a*b)/(getNod(a,b));
    }
}
