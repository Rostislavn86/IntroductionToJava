package Test.InstanceOf.TestMatches.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m = p.matcher("02/12/03");

        while (m.find())
        {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("\".*\"");
        Matcher m2 = p2.matcher("Put a \"string\" between double");

        while (m2.find())
        {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
    }
}
