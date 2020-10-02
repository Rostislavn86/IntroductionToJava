package Lessons.ExceptionsLesson;

public class ErrorExample
{
    private ABC abc;

    public void foo()
    {
        try
        {
            abc.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException e)
        {
            e.printStackTrace();
            //System.out.println("Error");
            //e.printStackTrace();
        }

    }

}
