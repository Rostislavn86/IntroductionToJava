package StringsAndBasicsOfTextProcessing.RabotSoStrokoyKakSmassivomSimvolov.Task2;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class Main
{
    public static void main(String[] args)
    {
        String[] stringArray = {"word", "word", "notword"};

        System.out.println("Изначальные значения : ");
        for(int i = 0; i <stringArray.length; i++)
        {
            System.out.println(stringArray[i]);
        }

        System.out.println("Изменённые значения : ");
        changeArray(stringArray);
    }

    private static String[] changeArray(String[] stringArray)
    {
        String[] newArray = new String[stringArray.length];

        for(int i = 0; i < stringArray.length; i++)
        {
            if (stringArray[i].equals("word"))
            {
                newArray[i] = stringArray[i].replaceAll("word","letter");
            }
            else
                newArray[i] = stringArray[i];

            System.out.println(newArray[i]);
        }
        return newArray;
    }
}