package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task7;

//7. Вводится строка.
// Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class Main
{
    public static void main(String[] args)
    {
        String str = "abc cde def";

        String[] strArray = str.split("");

        String strBuffer = " ";

        for(int i = 0;  i < strArray.length; i++)
        {
        if (strBuffer.contains(strArray[i])) continue;
            strBuffer += strArray[i];
        }

        System.out.println("Изначальная строка " + str);
        System.out.println("Изменённая строка по условию задачи " + strBuffer.trim());
    }
}
