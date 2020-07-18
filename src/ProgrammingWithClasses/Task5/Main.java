package ProgrammingWithClasses.Task5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();

        System.out.println("Добрый день, пложалйста проинициализируете начальное значения счётчика");
        System.out.println("Введите 'd' для инициализации счётчика по умолчанию (либо любой инойнабор символов)");
        System.out.println("Введите 'r' для инициализации произвольными значениями");

        Scanner bukva = new Scanner(System.in);
        String ch = bukva.nextLine();

        Methods methodFinal = methods;

        if (ch.equals("d")) {
            System.out.println("Ваш Запрос :");
            methods.createDefaultCounter();
        }
        else
        if (ch.equals("r")) {
            System.out.println("Ваш Запрос :");
            methods.createRandomCounter();
        }
        else
        {
            System.out.println("Ваш Запрос :");
            methods.createDefaultCounter(); }

        System.out.println("Для увиличения или уменьшения счётчика введите 'с'");

        String ch2 = bukva.nextLine();

        if (ch2.equals("c"))
        {
            methodFinal.plusOneMinusOne();
        }
    }
}
