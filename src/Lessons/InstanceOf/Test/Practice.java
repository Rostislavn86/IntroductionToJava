package Lessons.InstanceOf.Test;

//http://www.quizful.net/interview/java/java-syntax

public class Practice {
    public static void main(String ... args)
    {
        Boolean b = new Boolean("/true");
        System.out.println(b);
    }

    public static void main(String args)
    {
        Boolean b = new Boolean("/false");
        System.out.println(b == false);
    }
}
