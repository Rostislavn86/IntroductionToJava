package Algoritmization;

//https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D1%82%D1%83%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%BE

public class DekompozitsiyaAndMethodsTask12
{
    public static void main(String[] args)
    {
        int k = 10;
        int n = 15;

        createArray(k,n);
    }

    public static int[] createArray(int k, int n)
    {
        int[] arr = new int[100];

        int summ = 0;

        for(int i = 0; i < arr.length;i++)
        {
            arr[0] = 1;
            arr[i] = rnd(0,k);
            summ += arr[i];
            System.out.println(arr[i]);
            //if (summ >= n) break;
            if (summ > n)
            {
                summ = 0;i = 0;
                System.out.println("======================");
            }
            if (summ >= n) break;
            System.out.println(" i" + i);
        }

        System.out.println("Сумма = " + summ);

        return arr;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++ max) + min;
    }
}