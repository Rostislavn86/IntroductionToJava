package Algoritmization;

//https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D1%82%D1%83%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%BE

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class DekompozitsiyaAndMethodsTask12
{
    public static void main(String[] args)
    {

        int k = 30;
        int n = 5;

        int arrTempComplete[] = createArrTemp(n,k);

        System.out.println("Сумма цифра массива по условию задачи равна = " + k);
        System.out.println("Элементы массива по условию задачи не больше " + n);

        int summArrayElem = 0;

        System.out.println("Искомый массив : ");
        for(int i = 0; i < arrTempComplete.length; i ++)
        {
            summArrayElem += arrTempComplete[i];

            System.out.println("arr[" + i + "]" + " = " + arrTempComplete[i] + " ");

            if (i == (arrTempComplete.length - 1))
            {
                System.out.println("Сумма элементов массива = " + summArrayElem);
            }
        }

    }

    public static int[] createArrTemp(int k, int n)
    {
        int[] arrTemp = new int[k*n];

        int summ = 0;

        for(int i = 0; i < arrTemp.length;i++)
        {
            arrTemp[i] = rnd(0,k);
            summ += arrTemp[i];
            if (summ > n)
            {
                summ = 0;
                i = 0;
                cleanarrTemp(arrTemp);
            }
            if (summ >= n) break;
        }

        int findSizeOfMass = 0;
        int count = 0;

        for(int i = 0; i < arrTemp.length; i ++)
        {
            count++;
            findSizeOfMass += arrTemp[i];
            if (findSizeOfMass == n) break;
        }

        int[] arrFinal = new int[count];

        for(int i = 0; i < arrFinal.length; i ++)
        {
            arrFinal[i] = arrTemp[i];
        }
        return arrFinal;
    }

    public static int[] cleanarrTemp(int[] arrTemp)
    {
        for(int i = 0; i < arrTemp.length; i ++)
        {
            arrTemp[i] = 0;
        }
        return arrTemp;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++ max) + min;
    }
}