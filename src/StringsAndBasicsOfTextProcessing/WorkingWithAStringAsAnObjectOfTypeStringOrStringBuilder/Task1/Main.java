package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task1;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Main
{
    public static void main(String[] args)
    {
        String strBld1 = new String("sadsd   sdasdsa dsdas  dddddddddd фывфыв          фывыф");
        System.out.println("Исходная сторка = " + strBld1);
        System.out.println("Максимальное число пробелов в исходной строке = " + findMaxSpace(strBld1));
    }

    private static int findMaxSpace(String str)
    {
        String[] strArray = str.split("");

        int[] intArray = new int[strArray.length];

        int[] countArray = new int[intArray.length];

        int count = 0;

        for(int i = 0; i < strArray.length; i++ )
        {
            if (strArray[i].indexOf(' ') != -1)
            {
               count++;
               countArray[i] = count;
            }
            if (strArray[i].indexOf(' ') == -1) count = 0;
        }

        int max = 0;

        for(int i = 0; i < countArray.length; i++ )
        {
            if (countArray[i] > max) max = countArray[i];
        }

        return max;
    }
}
