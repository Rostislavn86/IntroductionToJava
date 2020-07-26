package ProgrammingWithClasses.AgregationAndComposition.Task5;

public class Cruise
{
    String transport = "Лайнер";
    String food = "Всё включено";
    int day = 30;

    public String getTransport() {
        return transport;
    }

    public String getFood() {
        return food;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Cruise{" +
                "transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", day=" + day +
                '}';
    }
}
