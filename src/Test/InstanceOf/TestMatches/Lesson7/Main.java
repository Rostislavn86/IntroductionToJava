package Test.InstanceOf.TestMatches.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("cat|dog");
        Matcher m = p.matcher("This is a cat");

        while (m.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
        System.out.println("");
    }
}
