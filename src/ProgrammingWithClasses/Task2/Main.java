package ProgrammingWithClasses.Task2;

//2. Создйте класс Test2 двумя переменными.
// Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Main
{
    public static void main(String[] args)
    {
        Test2 test2 = new Test2();
        Test2 test2_var = new Test2(2,5);

        test2.getX();
        test2.getY();

        test2_var.getX();
        test2_var.getY();

        test2.setX(3);
        test2_var.setX(6);

        test2.getX();
        test2_var.getX();
    }
}
