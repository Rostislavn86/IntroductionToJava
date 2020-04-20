package Algoritmization;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class DekompozitsiyaAndMethodsTask7
{
    public static void main(String[] args)
    {
        int summ = 0;

        for(int i = 0; i < createArray().length + 1; i ++)
        {
            if (i == 0) continue;
            if (i % 2 == 0) continue;
            summ += findFact(i);
        }

        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 " + "\n" + summ);

    }

    public static int findFact(int x)
    {
        int fact = 1;
        for (int i = 1; i <= x ; i ++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static int[] createArray()
    {
        int[] array = new int[9];

        int chislo = 1;

        for(int i = 0; i < array.length; i ++)
        {
            array[i] = chislo;
            chislo++;
        }
        return array;
    }

}
