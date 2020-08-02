package Webinars.Web100420.Web20200707;

public class ProgrammerBook extends Book
{
    private String language;

    public ProgrammerBook()
    {
    super();
    }

    public ProgrammerBook(String title, int price, String language)
    {
        super();
        setTitle(title);
        setPrice(price);
        this.language = language;
    }

    public void m()
    {
        super.setPrice(2);
        setPrice(3);
    }
}
