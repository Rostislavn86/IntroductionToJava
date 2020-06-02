package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task5;

////5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Main
{
    public static void main(String[] args)
    {
    String str = "sadasdsadasdkl;kl";

    String[] strArray = str.split("");

    int count = 0;

    for(int i = 0;  i < strArray.length; i++)
    {
        if (strArray[i].equals("a")) count++;
    }

    System.out.println("символ 'а' повторяется в строке " + str + " " + count + " раз(а)");

    }
}
