package ProgrammingWithClasses.AgregationAndComposition.Task2;

public class Car
{
    private String markOfTheCar;

    private Engine eng;
    private Wheel whl;

    Car(String nameOfTheCar, Engine eng, Wheel whl)
    {
        this.markOfTheCar = nameOfTheCar;
        this.eng = eng;
        this.whl = whl;
    }

    public void run()
    {
        System.out.println("Car " + markOfTheCar +  " rides");
    }

    public void refuel()
    {
        System.out.println("Car " + markOfTheCar + "  refuel");
    }

    public void changeWheel()
    {
        System.out.println("Wheel of the " + markOfTheCar + "  is changed");
    }

    public String getMarkOfTheCar()
    {
        return markOfTheCar;
    }
}
