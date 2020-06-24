package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task2\\text.txt")));

        showOpenTegFromText(contents);

        System.out.println("------------------------------------");

        showCloseTegFromText(contents);

        System.out.println("------------------------------------");

        showContentOfTheTegs(contents);

        System.out.println("------------------------------------");

        showTegWithoutBody(contents);
    }

    private static void showTegWithoutBody(String text)
    {
        Pattern p4 = Pattern.compile(".+[/>]+?>");//закрывающий тег

        Matcher m4 = p4.matcher(text);

        System.out.println("Тэг без тела : ");

        while (m4.find())
        {
            System.out.println(m4.group() + " ");
        }
    }

    private static void showCloseTegFromText(String text)
    {
        Pattern p2 = Pattern.compile("<[/].+?>");//закрывающий тег
        Matcher m2 = p2.matcher(text);

        System.out.println("Закрывающий тэг :");

        while (m2.find()) {
            System.out.println(m2.group() + " ");
        }
    }

    private static void showOpenTegFromText(String text)
    {
        Pattern p1 = Pattern.compile("<\\b.+?>");//открывающий тег
        Matcher m1 = p1.matcher(text);

        System.out.println("Открывающий тэг : ");

        while (m1.find()) {
            System.out.println(m1.group() + " ");
        }
    }

    private static void showContentOfTheTegs(String text)
    {
        Pattern p3 = Pattern.compile("(<\\b.+?>)(.+)<[/](.+?>)");//Содержание тэга
        Matcher m3 = p3.matcher(text);

        System.out.println("Содержание тэга :");

        while (m3.find())
        {
            System.out.println(m3.group(2) + " ");
        }

        System.out.println("<note id = \"1\">");

        System.out.println("************************************");

        System.out.println("тэг <notes> (содержание)");

        final Pattern pattern = Pattern.compile("<notes>(.+?)</notes>", Pattern.DOTALL);
        final Matcher matcher = pattern.matcher(text);
        matcher.find();
        System.out.println(matcher.group());

        System.out.println("************************************");

        System.out.println("тег <note id = 1 сождержание");

        final Pattern pattern2 = Pattern.compile("<note id = \"1\">(.+?)</note>", Pattern.DOTALL);
        final Matcher matcher2 = pattern2.matcher(text);
        matcher2.find();
        System.out.println(matcher2.group());

        System.out.println("************************************");

        System.out.println("тег <note id = 2 сождержание");

        final Pattern pattern3 = Pattern.compile("<note id = \"2\">(.+?)</note>", Pattern.DOTALL);
        final Matcher matcher3 = pattern3.matcher(text);
        matcher3.find();
        System.out.println(matcher3.group());

    }
}
