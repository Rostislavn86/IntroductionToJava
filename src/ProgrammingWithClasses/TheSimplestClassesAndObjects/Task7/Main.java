package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task7;

//7. Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

//http://mathhelpplanet.com/static.php?p=onlain-reshit-treugolnik

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        createTriangle();
    }

    static void createTriangle()
    {
        System.out.println("Добрый день, если вы хотите получить значенияготового треугольника,\n "
        + "введите 'r'" + " для того что бы создать новый треугольник введите 'g'");

        Scanner scan = new Scanner(System.in);

        String choice = scan.nextLine();

        if (choice.equals("r"))
        {
            Triangle triangle = new Triangle(3,0,0,4,0,0);
        }
        else
        if (choice.equals("g"))
        {
            Triangle triangle1 = new Triangle();
        }
        else
        {
            System.out.println("Вы ввели недопустимы символ - прогрмамма будет закрыта ...");
        }

    }

}
