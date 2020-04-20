package BasicsOfSoftwareCodeDevelopmen.CyclesTask2;

//2. Вычислить значения функции на отрезке [а,b] c шагом h

public class Main
{
    public static void main(String[] args)
    {
        int a = -11;
        int b = 18;
        int h = 3;

        System.out.println("Значение функции (смотри условие) на отрезке " + "от a = " + a);
        System.out.println("до " + " b = " + b + " c шагом h = " + h);

        while (a<=b)
        {
            a += h;
            if (a>2) System.out.println(a);
            if (a<=2) System.out.println(-a);
        }

    }
}
