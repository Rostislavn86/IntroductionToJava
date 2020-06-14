package Test.InstanceOf.TestMatches.Lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.youtube.com/watch?v=4okF9jx42xc&list=PL786bPIlqEjQsE_WAcKpkZ-Q4T-A8j1D2&index=5

public class Main
{
    public static void main(String[] args)
    {
    //Границы слова (разделители слов)
    //"\\bis\\b" - поиск начало и конец слова is
        Pattern p = Pattern.compile("\\b.\\b");
        Matcher m = p.matcher("This island is beauteful ");

        while (m.find())
        {
            //System.out.println(m.start() + " " + m.group() + " ");
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
        System.out.println("");

    }
}
