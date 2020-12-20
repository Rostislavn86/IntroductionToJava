package Lessons.InterfaceExample;

public class Program{

    public static void main(String[] args) {

        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
        b1.prov();
    }
}
interface Printable{



    int n = 5;

    default void prov()
    {
        System.out.println("sdasd");
    }


    void print();
}
class Book implements Printable{

    String name;
    String author;

    Book(String name, String author){

        this.name = name;
        this.author = author;
    }


    public void print() {

        int x = n;
        System.out.printf("%s (%s) \n", name, author + " " + x);
    }
}
