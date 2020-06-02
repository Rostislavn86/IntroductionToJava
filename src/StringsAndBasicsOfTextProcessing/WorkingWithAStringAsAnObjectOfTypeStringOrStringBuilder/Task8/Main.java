package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task8;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Main
{
    public static void main(String[] args)
    {
        String str = "a456bc c456789de defd";

        String[] strArrayWord = str.split(" ");

        int countMax = 0;

        for(int i = 0; i < strArrayWord.length; i++)
        {
        if (strArrayWord[i].length() > countMax) countMax = strArrayWord[i].length();
        }

        System.out.println("Изначальная строка " + str);

        for(int i = 0; i < strArrayWord.length; i++)
        {
            if (countMax == strArrayWord[i].length())
            {
                System.out.println("Самое длиное слово это : " + strArrayWord[i]);
                break;
            }
        }
    }
}
