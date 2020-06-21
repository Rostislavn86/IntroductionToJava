package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task2\\text.txt")));

        Pattern p1 = Pattern.compile("<\\b.+?>");//открывающий тег
        Matcher m1 = p1.matcher(contents);

        System.out.println("Открывающий тэг : ");

        while (m1.find()) {
            System.out.println(m1.group() + " ");
        }

        Pattern p2 = Pattern.compile("<[/].+?>");//закрывающий тег
        Matcher m2 = p2.matcher(contents);

        System.out.println("Закрывающий тэг :");

        while (m2.find()) {
            System.out.println(m2.group() + " ");
        }

        Pattern p3 = Pattern.compile("<\\b.+?>(.+)<[/].+?>");//Содержание тэга
        Matcher m3 = p3.matcher(contents);

        System.out.println("Содержание тэга :");

        while (m3.find())
        {
            System.out.println(m3.group() + " ");
        }

//        Pattern p4 = Pattern.compile("<notes>(\\S+)</notes>");//Открывающий тег
//        Matcher m4 = p4.matcher(contents);

        //https://issue.life/questions/6560672/

        System.out.println("Notes тег :");

        final Pattern pattern = Pattern.compile("<notes>(.+?)</notes>", Pattern.DOTALL);
        final Matcher matcher = pattern.matcher(contents);
        matcher.find();
        System.out.println(matcher.group(1)); // Prints String I want to extract

        System.out.println("note 1");

        final Pattern pattern2 = Pattern.compile("<note id = \"1\">(.+?)</note>", Pattern.DOTALL);
        final Matcher matcher2 = pattern2.matcher(contents);
        matcher2.find();
        System.out.println(matcher2.group(1)); // Prints String I want to extract

        System.out.println("note 2");

        final Pattern pattern3 = Pattern.compile("<note id = \"2\">(.+?)</note>", Pattern.DOTALL);
        final Matcher matcher3 = pattern3.matcher(contents);
        matcher3.find();
        System.out.println(matcher3.group(1)); // Prints String I want to extract


    }


}
