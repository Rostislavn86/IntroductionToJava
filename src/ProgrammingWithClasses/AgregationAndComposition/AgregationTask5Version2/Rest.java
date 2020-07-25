package ProgrammingWithClasses.AgregationAndComposition.AgregationTask5Version2;

public class Rest
{

    String transport = "Автобус";
    String food = "Всё включено";
    int day = 20;

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
