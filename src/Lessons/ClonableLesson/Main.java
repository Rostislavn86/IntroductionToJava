package Lessons.ClonableLesson;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
    Book b = new Book("Java",200);

    b.clone();

        System.out.println("Clone");
    }
}
