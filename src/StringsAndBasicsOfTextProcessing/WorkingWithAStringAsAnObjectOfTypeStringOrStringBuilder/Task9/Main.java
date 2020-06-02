package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task9;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

public class Main
{
    public static void main(String[] args)
    {
        String str = "a456bc c456789de defdAAA";

        String[] strArrayWord = str.split(" ");

        String strLetterSmall = "qwertyuiopasdfghjklzxcvbnm";

        String[] strLetterSmallArray = strLetterSmall.split("");

        String strLetterBig = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String[] strLetterBigArray = strLetterBig.split("");

        int count = 0;

        for(int i = 0; i < strArrayWord.length; i ++)
        {
            for(int j = 0; j < strLetterSmallArray.length; j ++)
            {
                if (strArrayWord[i].equals(strLetterSmallArray[j])) count++;
                if (strArrayWord[i].equals(strLetterBigArray[j])) count++;
            }
        }

        System.out.println(count);


    }
}
