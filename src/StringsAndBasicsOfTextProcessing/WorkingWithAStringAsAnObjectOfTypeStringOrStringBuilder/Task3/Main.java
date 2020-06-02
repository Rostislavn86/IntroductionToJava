package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task3;

//3. Проверить, является ли заданное слово палиндромом.

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("topot");

        if (str.equals(str.reverse())) System.out.println("Слово " + str + " является полиндромом");
        else System.out.println("Слово " + str + " не является полиндромом");
    }

}
