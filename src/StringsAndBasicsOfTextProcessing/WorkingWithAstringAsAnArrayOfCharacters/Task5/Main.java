package StringsAndBasicsOfTextProcessing.WorkingWithAstringAsAnArrayOfCharacters.Task5;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//   Крайние пробелы в строке удалить.

public class Main
{
    public static void main(String[] args)
    {
        String str = "      11sad  32as     dasd45 6  8          ";
        System.out.println("Изначальная строка = " + str);
        System.out.println("Строка отредоктированная по условию задачи = " + changeString(str));
    }

    private static String changeString(String str)
    {
        String newStr = str.trim();

        String[] strArray = newStr.split("");

        String finalString = "";

        for(int i = 0; i < strArray.length; i++ )
        {
            if (strArray[i].equals(" ") && strArray[i+1].equals(" ")) continue;
            finalString += strArray[i];
        }

        return finalString;

    }
}
