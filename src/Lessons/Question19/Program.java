package Lessons.Question19;

public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();

        Object sam2 = new Employee("Sam", "Oracle");

// нисходящее преобразование от Object к типу Employee
        Employee emp = (Employee)sam2;
        emp.display();
        System.out.println(emp.getCompany());

        Object kate = new Client("Kate", "DeutscheBank", 2000);
        ((Person)kate).display();

        Object sam3 = new Employee("Sam", "Oracle");
        ((Employee)sam3).display();

    }
}
