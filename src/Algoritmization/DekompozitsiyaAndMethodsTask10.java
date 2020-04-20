package Algoritmization;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class DekompozitsiyaAndMethodsTask10
{
    public static void main(String[] args)
    {
        int x = 12345678;

        System.out.println("Натуральное число N = " + x);
        System.out.println("Массив созданный программой по условию задачи : ");
        createArray(findNumberOfCharacters(x),x);

    }

    public static int findNumberOfCharacters(int x)
    {
        int rez = 0;
        int decriment = 1;
        for(int i = 0;;i++ )
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
            System.out.print("arr[" + i + "]" + " = " + arr[i] + " ");
        }
        return arr;
    }

}