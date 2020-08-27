package BasicOfOOP.Task5;

//Задача 5. Создать консольное приложение, удовлетворяющее следующим требованиям:
// • Корректно спроектируйте и реализуйте предметную область задачи.
// • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
// • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
// • для проверки корректности переданных данных можно применить регулярные выражения.
// • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
// • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//
//Вариант A. Цветочная композиция. Реализовать приложение,
// позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию).
// Составляющими цветочной композиции являются цветы и упаковка.

import BasicOfOOP.Task5.Fabrics.FlowerFactory;
import BasicOfOOP.Task5.Fabrics.PackageFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println("Добрый день, добро пожаловать в приложение по состовлению букетов, " +
                "для того что бы добавить цветок в букет введите название из списка : ");
        menuFlowers();
        System.out.println("Для того что бы добавить упаковку ввеите её название : ");


    }

    public static void menuFlowers()
    {

        System.out.println("Списко досупных цветов : ");
        System.out.println("Крокус ,Георгин ,Тысячелистник ,Роза ,Подснежник");

        FlowerFactory fl = new FlowerFactory();

        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

        if (fl.createFlower(ch) == null)
        {
            System.out.println("Название цветка который вы ввели нет в списке, пожалуйста повторите ввод : ");
            menuFlowers();
        }
        else fl.createFlower(ch);

        System.out.println("Для того что бы добавить ещё один цветок введите 'y'");

        String y = sc.nextLine();

        if (y.equals("y"))
            menuFlowers();

        System.out.println(Arrays.toString(FlowerFactory.getAllFlowers()));
    }

    public static void menuPackage()
    {
        System.out.println("Списко досупных упаковок товара : ");
        System.out.println("Бумага, Подарочная упаковка");

        PackageFactory pk = new PackageFactory();

        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();


    }
}
