package TestClasses;

//https://ru.wikipedia.org/wiki/%D0%9F%D0%B5%D1%80%D0%B5%D0%BE%D0%BF%D1%80%D0%B5%D0%B4%D0%B5%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5_%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D0%B0#Java

public class TestClasses
{
    public static void main(String[] args)
    {
        Thought t1 = null;

        t1 = new Thought();
        t1.message();  // Выводит "Я себя чувствую как стрекоза, попавшая в параллельную вселенную."

        t1 = new Advice();  // Полиморфизм
        t1.message();  // Выводит "Внимание: Даты в календаре ближе, чем кажутся."
    }
}
