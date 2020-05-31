package StringsAndBasicsOfTextProcessing.WorkingWithAstringAsAnArrayOfCharacters.Task4;

//4. В строке найти количество чисел.

public class Main
{
    public static void main(String[] args)
    {
        String str = "11sad32asdasd456";

        System.out.println("Количество чисел в строке " + str + " = " + countDigit(str));
    }

    private static int countDigit(String str)
    {
        String[] strArray = str.split("");

        String strTemp = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (isDigit(strArray[i])) strTemp += strArray[i];
            if (!isDigit(strArray[i])) strTemp += " * ";
        }

        String[] finalArray = strTemp.split(" * ");

        int count = 0;

        for (int i = 0; i < finalArray.length; i++)
        {
        if (isDigit(finalArray[i])) count++;
        }

        return count;
    }

    private static boolean isDigit(String s) throws NumberFormatException
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
