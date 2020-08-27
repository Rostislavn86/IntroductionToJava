package Lessons.InstanceOf.TestMatches.Lesson3;

//https://www.youtube.com/watch?v=E0stQ86pPDA&list=PL786bPIlqEjQsE_WAcKpkZ-Q4T-A8j1D2&index=2

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");

        while (m.find())
        {
            System.out.println(m.start() + " " + m.group() + " ");
        }

        System.out.println();

        Pattern p2 = Pattern.compile("cat");
        Matcher m2 = p2.matcher("About cats and dogs");

        while (m2.find())
        {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }

        System.out.println();

        Pattern p3 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m3 = p3.matcher("1+1=2");

        while (m3.find())
        {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }

        System.out.println();

        Pattern p4 = Pattern.compile("cat");
        Matcher m4 = p4.matcher("He captured fish for his cat");

        while (m4.find())
        {
            System.out.println(m4.start() + " " + m4.group() + " ");
        }

        System.out.println();

    }
}
