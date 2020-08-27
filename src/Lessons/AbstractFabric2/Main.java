package Lessons.AbstractFabric2;

//https://habr.com/ru/post/465835/

public class Main
{
    public static void main(String[] args)
    {
        CarsFactory factory;

        factory = new ToyotaFactory();

        factory.createSedan();
        factory.createCoupe();
    }
}
