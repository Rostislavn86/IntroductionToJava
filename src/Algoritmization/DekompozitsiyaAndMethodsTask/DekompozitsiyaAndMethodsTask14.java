package Algoritmization.DekompozitsiyaAndMethodsTask;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class DekompozitsiyaAndMethodsTask14
{
    public static void main(String[] args)
    {
        int k = 100000;
        int[] arr = new int[k];

        for(int i = 1; i < arr.length; i++)
        {
            arr[i] = i;
        }

        System.out.println("Числа Армсотронга от 1 до " + k);
        for(int i = 1; i < arr.length; i++)
        {
            if (provArmstrongZnac(createArray(findNumberOfCharacters(arr[i]),arr[i]),arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean provArmstrongZnac(int[] arr, int x)
    {
        int deegree = arr.length;

        int summ = 0;

        for(int i = 0; i < arr.length; i++)
        {
            summ += Math.pow(arr[i],deegree);
        }

        if (x == summ) return true;
        else return false;
    }

    public static int findNumberOfCharacters(int x)
    {
        int rez = 0;
        int decriment = 1;
        for(;;)
        {
            if (x/decriment == 0) break;
            rez += 1;
            decriment *= 10;
        }
        return rez;
    }

    public static int[] createArray(int decriment, int x)
    {
        int[] arr = new int[decriment];

        int sighnOfArrays = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sighnOfArrays = (x % ((int)Math.pow(10,i + 1)));
            arr[i] = sighnOfArrays;
        }

        for(int i = arr.length - 1 ; i >= 0; i--)
        {
            arr[i] = arr[i]/(int)Math.pow(10,i);
        }
        return arr;
    }
}