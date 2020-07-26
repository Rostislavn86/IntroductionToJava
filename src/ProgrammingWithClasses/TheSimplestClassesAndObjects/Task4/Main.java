package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task4;

//https://javarush.ru/groups/posts/1885-metod-compareto

//4. Создайте класс Train, содержащий поля: название пункта назначения,
// номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены
// по времени отправления.

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Train[] train = new Train[5];

        train[0] = new Train("Минск",123,14,43);
        train[1] = new Train("Минск",121,12,44);
        train[2] = new Train("Киев",129,1,45);
        train[3] = new Train("Борисов",136,15,59);
        train[4] = new Train("Витебск",135,22,0);

        int[] numberOfTheTrainArray = new int[train.length];

        //        Часть 1

        for(int i = 0; i < train.length; i++)
        {
            numberOfTheTrainArray[i] = train[i].getNumberOfTheTrain();
        }

        Arrays.sort(numberOfTheTrainArray);

        System.out.println("Отсортированный массив по номерам поездов ");

        for(int i = 0; i < train.length; i++)
        {
            for(int j = 0; j < numberOfTheTrainArray.length; j++)
            {
            if (train[i].getNumberOfTheTrain() == numberOfTheTrainArray[j])
                System.out.println(train[j].toString());
            }
        }

        //        Часть 2

        System.out.println();
        System.out.println("Вывод информации о поезде, номер которого введен пользователем. ");
        System.out.println("Введите номер поезда из списка : ");

        for(int i = 0; i < train.length; i++)
        {
            System.out.println(train[i].getNumberOfTheTrain());
        }

        Scanner scan = new Scanner(System.in);
        int numberOfTheTrain = scan.nextInt();

        for(int i = 0; i < train.length; i++)
        {
            if (numberOfTheTrain == train[i].getNumberOfTheTrain())
            {
                System.out.println(train[i].toString());
                break;
            }
        }

        //        Часть 3

        System.out.println();
        System.out.println("Отсортированный массив по пункту назначения, " +
                "причем поезда с одинаковыми пунктами назначения должны быть " +
                "упорядочены по времени отправления. ");

        System.out.println("-------до сортировки--------");
        for (Train u : train) {
            System.out.println(u.toString());
        }

        System.out.println("-------после сортировки-----");
        Arrays.sort(train);
        for (Train u : train) {
            System.out.println(u.toString());
        }
    }
}
