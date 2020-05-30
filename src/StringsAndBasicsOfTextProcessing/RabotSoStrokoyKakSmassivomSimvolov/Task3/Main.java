package StringsAndBasicsOfTextProcessing.RabotSoStrokoyKakSmassivomSimvolov.Task3;

public class Main
{
    public static void main(String[] args)
    {
        String str = "1321asdsadsagf123dgdf";
        String[] stringNumbers = "1234567890".split("");

        String[] strArray = str.split("");

        System.out.println(count(strArray,stringNumbers));

    }

    private static int count(String[] strArray, String[] stringsOfNumbers)
    {
        int count = 0;

        for(int i = 0; i < strArray.length; i++)
        {
            for(int j = 0; j < stringsOfNumbers.length; j++)
            {
                if (strArray[i].equals(stringsOfNumbers[j])) count++;
            }
        }
        return count;
    }
}