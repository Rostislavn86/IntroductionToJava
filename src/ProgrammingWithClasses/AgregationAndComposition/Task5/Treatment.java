package ProgrammingWithClasses.AgregationAndComposition.Task5;

public class Treatment
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
        return "Treatment{" +
                "transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", day=" + day +
                '}';
    }
}
