package ProgrammingWithClasses.AgregationAndComposition.Task5;

public class Excursions
{
    String transport = "Автобус";
    String food = "Обед";
    int day = 2;

    Excursions()
    {

    }

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
        return "Excursions{" +
                "transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", day=" + day +
                '}';
    }
}
