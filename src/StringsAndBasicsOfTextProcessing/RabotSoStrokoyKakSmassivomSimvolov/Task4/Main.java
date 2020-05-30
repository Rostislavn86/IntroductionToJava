package StringsAndBasicsOfTextProcessing.RabotSoStrokoyKakSmassivomSimvolov.Task4;

public class Main
{
    public static void main(String[] args)
    {
        String str = "1321asdsadsagf123dgdf";
        String[] stringNumbers = "1234567890".split("");

        String[] strArray = str.split("");

        System.out.println(count(strArray,stringNumbers));

        isItNumber(stringNumbers);

    }

    private static int count(String[] strArray, String[] stringsOfNumbers)
    {
        int count = 0;

        String tempStringNumbers = "";

        for(int i = 0; i < strArray.length; i++)
        {
            for(int j = 0; j < stringsOfNumbers.length; j++)
            {
                //if (!strArray[i].equals(stringsOfNumbers[j])) tempStringNumbers += "_";
                if (strArray[i].equals(stringsOfNumbers[j])) tempStringNumbers += stringsOfNumbers[j];
            }
        }

        System.out.println("tempStringNumbers " + tempStringNumbers);

        return count;
    }

    private static boolean isItNumber(String[] arrayString)
    {
        String tempString = "";
        for(int i = 0; i < arrayString.length; i++)
        {
            tempString += arrayString[i];
            System.out.println(tempString);
        }

        return false;
    }
}