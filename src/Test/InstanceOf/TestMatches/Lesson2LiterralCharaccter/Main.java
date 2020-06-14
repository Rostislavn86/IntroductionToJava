package Test.InstanceOf.TestMatches.Lesson2LiterralCharaccter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
    //    example [0-9], [a-zA-Z], [0-9a-fA-F]
        Pattern p1 = Pattern.compile("[a-c]");
        Matcher m1 = p1.matcher("abcasdc");

        while (m1.find())
        {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }

        System.out.println();

        Pattern p2 = Pattern.compile("gr[ae]y");
        Matcher m2 = p2.matcher("gray");

        while (m2.find())
        {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }

        //специальные символы
        // ]\^

        System.out.println();

        Pattern p3 = Pattern.compile("[+]");
        Matcher m3 = p3.matcher("1 + 1 = 2");

        while (m3.find())
        {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }

        System.out.println();

        //спец символы
        Pattern p4 = Pattern.compile("q[^u]");
        Matcher m4 = p4.matcher("Iraq is a country");

        while (m4.find())
        {
            System.out.println(m4.start() + " " + m4.group() + " ");
        }

        System.out.println();

        //Отрицание

        Pattern p5 = Pattern.compile("[^xx]");
        Matcher m5 = p5.matcher("xx1");

        while (m5.find())
        {
            System.out.println(m5.start() + " " + m5.group() + " ");
        }

        System.out.println();

        Pattern p6 = Pattern.compile("[\\Q[-]\\E]");
        Matcher m6 = p6.matcher("[]-]");

        while (m6.find())
        {
            System.out.println(m6.start() + " " + m6.group() + " ");
        }

        System.out.println();



    }
}
