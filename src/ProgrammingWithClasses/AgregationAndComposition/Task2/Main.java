package ProgrammingWithClasses.AgregationAndComposition.Task2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

//Agregation
public class Main
{
    public static void main(String[] args)
    {
    Engine engine = new Engine("BeigsAndStration");
    Wheel wheel = new Wheel(32);
    Engine engine2 = new Engine("BMW");
    Wheel wheel2 = new Wheel(28);
    Engine engine3 = new Engine("Bugatti");
    Wheel wheel3 = new Wheel(30);

    Car car1 = new Car("Mercedes",engine,wheel);
    Car car2 = new Car("BMW",engine2,wheel2);
    Car car3 = new Car("Bugatti",engine3,wheel3);

    car1.run();
    car2.run();
    car3.run();

    car1.refuel();
    car2.refuel();
    car3.refuel();

    car1.changeWheel();
    car2.changeWheel();
    car3.changeWheel();

    System.out.println(car1.getMarkOfTheCar());
    System.out.println(car2.getMarkOfTheCar());
    System.out.println(car3.getMarkOfTheCar());
    }
}
