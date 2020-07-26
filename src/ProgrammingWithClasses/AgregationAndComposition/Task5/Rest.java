package ProgrammingWithClasses.AgregationAndComposition.Task5;

public class Rest
{
    String transport = "Автобус";
    String food = "За свой счёт";
    int day = 1;

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
        return "Rest{" +
                "transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", day=" + day +
                '}';
    }
}
