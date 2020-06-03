package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task9;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("topot TOPOT");

        String[] strArray = str.toString().split("");

        String strLetterSmall = "qwertyuiopasdfghjklzxcvbnm";

        String[] strLetterSmallArray = strLetterSmall.split("");

        String strLetterBig = strLetterSmall.toUpperCase();

        String[] strLetterBigArray = strLetterBig.split("");

        int count = 0;

        for(int i = 0 ; i < strArray.length; i ++)
        {
            for(int j = 0 ; j < strLetterSmallArray.length; j ++)
            {
                if (strArray[i].equals(strLetterSmallArray[j])) count++;
                if (strArray[i].equals(strLetterBigArray[j])) count++;
            }
        }

        System.out.println("Изначальная строка : " + str);
        System.out.println("Количество строчных (маленьких) и прописных (больших) букв в введенной строке = " + count);

    }
}
