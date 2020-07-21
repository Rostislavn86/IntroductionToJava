package ProgrammingWithClasses.AgregationAndComposition.Task1;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main
{
    public static void main(String[] args)
    {
    Word word = new Word("Заголовок");
    TextAndMehods textAndMehods = new TextAndMehods(word);

    Word word1 = new Word("Слово2");
    Word word2 = new Word("Слово3");
    Word word3 = new Word("Слово4");

    Sentence sentence = new Sentence();
    sentence.addWord(word1);
    sentence.addWord(word2);
    sentence.addWord(word3);

    textAndMehods.addBody(sentence);

    System.out.println("Head " + textAndMehods.getZag());
    System.out.println("Body " + textAndMehods.getBody());

    }
}
