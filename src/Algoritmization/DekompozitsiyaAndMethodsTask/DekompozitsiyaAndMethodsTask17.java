package Algoritmization.DekompozitsiyaAndMethodsTask;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class DekompozitsiyaAndMethodsTask17
{
    public static void main(String[] args)
    {
        int chislo = 854;
        int count = 0;

        while (chislo != 0)
        {
            chislo -= findSummDigits(createArrayFromNumbers(chislo));
            count++;
        //    System.out.println("count " + count + " chislo " + chislo + " summ " + findSummDigits(createArrayFromNumbers(chislo)));
        }
        System.out.println("Количество действий необходимых для получения результата согласно условию задачи : " + (count - 1));
    }

    public static int findSummDigits(int[] arr)
    {
        int summ = 0;

        for(int i = 0; i < arr.length; i++ )
        {
            summ += arr[i];
        }
        return summ;
    }


    public static int[] createArrayFromNumbers(int n)
    {
        int j = 0;
        int len = findNumberOfCharacters(n);
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n % 10;
            n=n/10;
            j++;
        }
        return arr;
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
}


