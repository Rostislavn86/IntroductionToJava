package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task1;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
// отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task1\\text.txt")));

        System.out.println("---------------------------------------");

        //https://www.javatpoint.com/java-pattern-split-method

        System.out.println(createParagraphArray(contents)[3]);

        countOfSentence(createParagraphArray(contents)[3]);

        System.out.println("------------------------------");

        System.out.println(countOfSentence(createParagraphArray(contents)[3]));

    }

    private static int countOfSentence(String str) {
        int count = 0;

        Pattern p1 = Pattern.compile("[.!?]");
        Matcher m1 = p1.matcher(str);

        while (m1.find())
        {
           count++;
        }
        return count;
    }

    private static String[] createParagraphArray(String text)
    {
        Pattern p = Pattern.compile("  ");

        String[] strPar = p.split(text);

        return strPar;
    }

}



//Read more: https://javarevisited.blogspot.com/2015/09/how-to-read-file-into-string-in-java-7.html#ixzz6OxQnNVns



