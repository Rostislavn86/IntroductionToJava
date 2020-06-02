package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task6;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Main
{
    public static void main(String[] args)
    {
        String str = "1234567890";

        String[] strArray = str.split("");

        String strfinal = "";

        for(int i = 0;  i < strArray.length; i++)
        {
            strArray[i] = strArray[i].replace(strArray[i],strArray[i] + strArray[i]);
            strfinal += strArray[i];
        }

        System.out.println("Изначальная строка " + str);
        System.out.println("Изменённая строка по условию задачи " + strfinal);
    }
}
