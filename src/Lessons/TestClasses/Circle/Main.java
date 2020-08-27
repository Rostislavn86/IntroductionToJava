package Lessons.TestClasses.Circle;

public class Main
{
    public static void main(String[] args)
    {
    Circle circle = new Circle();
    Circle circle2 = new Circle(12,55);
    Circle circle3 = new Circle(12,3,55);

    System.out.println(circle.GetSquare());
    System.out.println(circle2.GetSquare());
    System.out.println(circle3.GetSquare());

    }
}
