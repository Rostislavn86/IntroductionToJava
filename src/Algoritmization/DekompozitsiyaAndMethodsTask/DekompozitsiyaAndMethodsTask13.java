package Algoritmization.DekompozitsiyaAndMethodsTask;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше
// 2. Для решения задачи использовать декомпозицию.

public class DekompozitsiyaAndMethodsTask13
{
    public static void main(String[] args)
    {
        int n = 1000;

        System.out.println("Пары чисел близнецов на отреке от 2-ух до " + n + " : ");
        writeNumbersOfTwinsAndTwins(createArrayProst(n));
    }

    public static void writeNumbersOfTwinsAndTwins(int[] arr)
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0) continue;
            for(int j = 0; j < arr.length; j++)
            {
                if (arr[j] == 0) continue;
                if (i == j) continue;
                if (i - j == 2)
                {
                    System.out.println(arr[j] + " " + arr[i] );
                    count++;
                }
            }
        }
        System.out.println("Количество цифр близнецов = " + count );
    }

    public static int[] createArrayProst(int n)
    {
        int[] arr = new int[n];
        int[] arrProst = new int[arr.length];

        for(int i = 2; i < arr.length; i ++)
        {
            arr[i] = i;

            if (findprostchislo(arr[i]) == true)
            {
                arrProst[i] = arr[i];
            }
            else continue;
        }
        return arrProst;
    }

    public static boolean findprostchislo(int n)
    {
        int kolvo=0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++)
        {
            if ( n%i == 0)
            {
                if (i == Math.sqrt(n) )
                    kolvo++;
                else kolvo += 2;
            }
        }
        if (kolvo == 2) return true;//если число простое
        else return false;//если число составное
    }
}