package Lessons.ClonableLesson;

public class Book implements Cloneable
{
    private String title;
    private int price;

    public Book()
    {

    }

    public Book(String title,int price)
    {
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Book b ;

        b = (Book)super.clone();

        return b;
    }

}
