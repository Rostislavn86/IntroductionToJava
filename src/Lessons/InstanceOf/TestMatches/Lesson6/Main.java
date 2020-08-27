package Lessons.InstanceOf.TestMatches.Lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        // Начало строки с символом а - поиск
        Pattern p = Pattern.compile("^a"); // - символ начала строки ^
        //Pattern p = Pattern.compile("s$"); // - сивол конца строки $
        //Pattern p = Pattern.compile("^\\d+$"); // - провера от начал и до конца строки и это должны бть только символы
        Matcher m = p.matcher("aaavv");

        while (m.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("ne$", Pattern.MULTILINE);// несколько вхождений ne в строчке
        Matcher m2 = p2.matcher("first line\"nsecond line");

        while (m2.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m2.start() + " " + m2.end() + " " + m2.group());
        }
        System.out.println("");

    }



}
