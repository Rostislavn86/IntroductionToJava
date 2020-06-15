package Test.InstanceOf.TestMatches.Lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("<[A-Za-z][A-Za-z0-9]*");
        Matcher m = p.matcher("<h1>");

        while (m.find())
        {
            System.out.println(m.start() + " " + m.group() + " " + " ");
        }
        System.out.println();

        Pattern p2 = Pattern.compile("\\b[1-9][0-9]{3}\\b");
        Matcher m2 = p2.matcher("1000 1234 9999");

        while (m2.find())
        {
            System.out.println(m2.start() + " " + m2.group() + " " + " ");
        }
        System.out.println();

        Pattern p3 = Pattern.compile("<.+>");//greedy
        //Pattern p3 = Pattern.compile("<.+?>");//lazy
        Matcher m3 = p3.matcher("This is a first <EM>first</EM> test");

        while (m3.find())
        {
            System.out.println(m3.start() + " " + m3.group() + " " + " ");
        }
        System.out.println();

        Pattern p4 = Pattern.compile("<[^>]+>");
        //Pattern p3 = Pattern.compile("<.+?>");
        Matcher m4 = p4.matcher("This is a first <EM>first</EM> test");

        while (m4.find())
        {
            System.out.println(m4.start() + " " + m4.group() + " " + " ");
        }
        System.out.println();

        Pattern p5 = Pattern.compile("\\Q*\\d+*\\E+");
        Matcher m5 = p5.matcher("*\\d+**\\d+");//Найти значение выражения \d+

        while (m5.find())
        {
            System.out.println(m5.start() + " " + m5.group() + " " + " ");
        }
        System.out.println();

        Pattern p6 = Pattern.compile("\\Q*\\d+*\\E*+");
        Matcher m6 = p6.matcher("\\d+**\\d+");//Найти значение выражения \d+

        while (m6.find())
        {
            System.out.println(m6.start() + " " + m6.group() + " " + " ");
        }
        System.out.println();

    }
}
