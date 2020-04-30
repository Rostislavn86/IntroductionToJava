package Algoritmization.DekompozitsiyaAndMethodsTask;

//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class DekompozitsiyaAndMethodsTask15
{
    public static void main(String[] args)
    {
        int numberOfDigits = 100000000;

        int[] arr = new int[numberOfDigits];

        int numberOfSigns = 8;
        
        System.out.println("Все натуральные " + numberOfSigns + " - значные числа образующие строго возрастающую последовательность"
                + ", например, 1234, 5789.");
        
        //Создадим массив обрабатываемых значний
        for(int i = 0; i < numberOfDigits; i++ )
        {
            arr[i] = i;
        }

        for(int i = 0; i < numberOfDigits; i++ )
        {
            if (numberOfSigns == findNumberOfCharacters(arr[i]))
            {
                if (checkVosvr(createArray(findNumberOfCharacters(arr[i]), arr[i])))
                {
                writeArray(createArray(findNumberOfCharacters(arr[i]),arr[i]));
                }
            }
            if (numberOfSigns < findNumberOfCharacters(arr[i])) break;
        }
    }

    public static boolean checkVosvr(int[] arr)
    {
        boolean b = false;

        for(int i = 0; i < arr.length;)
        {
            if (i + 1 == arr.length) break;

            if (arr[i] < arr[i + 1])
            {
                i++;
                b = true;
            }
            else
            {
                b = false;
                break;
            }
        }
        return b;
    }

    public static int[] createArray(int decriment, int x)
    {
        int[] arr = new int[decriment];

        int decriment2 = decriment;

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

        int[] invertedArray;

        invertedArray = invertArray(arr);

        return invertedArray;
    }

    public static void writeArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int[] invertArray(int[] x)
    {
        int[] arraySort = new int[x.length];

        for (int i = x.length -1; i >= 0; i--)
        {
            arraySort[(x.length - 1) - i] = x[i];
        }

        for (int a = 0; a < x.length; a++)
        {
            x[a] = arraySort[a];
        }
        return x;
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