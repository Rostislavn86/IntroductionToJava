package ProgrammingWithClasses.AgregationAndComposition.AgregationTask5Version2;

public class Shoping
{
    String transport = "Городская маршрутка";
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
        return "Shoping{" +
                "transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", day=" + day +
                '}';
    }
}
