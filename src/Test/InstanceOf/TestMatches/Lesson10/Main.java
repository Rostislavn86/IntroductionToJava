package Test.InstanceOf.TestMatches.Lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("Set(Value)?");// ? означает что группа value может как присутсвовать так и отсутсвовать
        Matcher m = p.matcher("Set or SetValue");

        while (m.find())
        {
            System.out.println(m.start() + " " + m.group() + " " + " ");
        }
        System.out.println();

    }
}
