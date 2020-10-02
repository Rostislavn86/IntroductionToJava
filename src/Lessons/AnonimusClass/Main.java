package Lessons.AnonimusClass;

//https://www.youtube.com/watch?v=zxcXDVotj_4

public class Main
{
    public static void main(String[] args)
    {
    Popcorn popcorn = new Popcorn()
    {
        void doSomth()
        {
            System.out.println("!!!!!!!");
        }
    };

    popcorn.doSomth();

    }
}
