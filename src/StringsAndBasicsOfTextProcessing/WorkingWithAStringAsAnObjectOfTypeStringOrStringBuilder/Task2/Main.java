package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task2;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Main
{
    public static void main(String[] args)
    {
    String newString = new String("asdasd, wqeqwe, sadasdsa");
    System.out.println("Изначальная строка " + newString);
    System.out.println("Изменённая строка по условию задачи " + newString.replaceAll("a","ab"));
    }
}
