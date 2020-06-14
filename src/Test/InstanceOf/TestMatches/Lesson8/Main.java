package Test.InstanceOf.TestMatches.Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Optional item

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("colou?r");
        Matcher m = p.matcher("color colour");

        while (m.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("Nov(ember)?");
        Matcher m2 = p2.matcher("November Nov");

        while (m2.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m2.start() + " " + m2.end() + " " + m2.group());
        }
        System.out.println("");

    }
}
