package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task4;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Main
{
    public static void main(String[] args)
    {
    String infStr = "Информатика";

    String createWord = "";

    createWord += infStr.substring(7,8) + infStr.substring(3,5) + infStr.substring(7,8);

    System.out.println("Cлово сотавленное по условию задачи : " + createWord);
    }
}
