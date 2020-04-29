package Algoritmization;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class DekompozitsiyaAndMethodsTask16
{
    public static void main(String[] args)
    {
        int numberOfDigits = 1000000;

        int[] arr = new int[numberOfDigits];

        int numberOfSigns = 5;

        for(int i = 0; i < numberOfDigits; i++ )
        {
            arr[i] = i;
        }

        int sum = 0;

        for(int i = 0; i < numberOfDigits; i++ )
        {
            if ((numberOfSigns == findNumberOfCharacters(arr[i])))
            {
                if (chekOddNumbersInArray(createArrayNumbers(arr[i])) == true)
                {
                sum += arr[i];
                //System.out.println("arr[i] " + arr[i] + " summ = " + sum);
                }
                else continue;
            }
            if (numberOfSigns < findNumberOfCharacters(arr[i])) break;
        }

        System.out.println("=================================");
        System.out.println("Сумма цифр согласно условию задачи = " + sum);
        System.out.println("Чётных цифр в найденной сумме = " + findCountOddDigitsInSumm(createArrayNumbers(sum)));
    }

    public static int findCountOddDigitsInSumm(int[] arr)
    {
        int summ = 0;

        for(int i = 0; i < arr.length; i++ )
        {
            if ((arr[i] % 2 == 1) || (arr[i] == 0))
            {
                continue;
            }
            else summ += 1;
        }
        return summ;
    }

    public static boolean chekOddNumbersInArray(int[] arr)
    {
        boolean flag = true;

        for(int i = 0; i < arr.length; i++ )
        {
            if ((arr[i] % 2 == 1) || (arr[i] == 0))
            {
                flag = false;
                break;
            }
            else flag = true;
        }
        return flag;
    }

    public static int[] createArrayNumbers(int n)
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