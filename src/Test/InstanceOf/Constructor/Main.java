package Test.InstanceOf.Constructor;

public class Main {
    public static void main(String[] args)
    {
    Car car = new Car(3,4);
    Car car2 = new Car();

        System.out.println(car.x);
        System.out.println(car2.x);
    }
}
