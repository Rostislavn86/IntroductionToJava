package ProgrammingWithClasses.Task4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Train[] train = new Train[5];

        train[0] = new Train("Минск",123,58,43);
        train[1] = new Train("Москва",121,21,44);
        train[2] = new Train("Киев",129,1,45);
        train[3] = new Train("Борисов",136,15,59);
        train[4] = new Train("Витебск",135,22,0);

        System.out.println(train[0].getDepartureTimeHour());

        int[] numberOfTheTrainArray = new int[train.length];

        for(int i = 0; i < train.length; i++)
        {
            numberOfTheTrainArray[i] = train[i].getNumberOfTheTrain();
        }

        Arrays.sort(numberOfTheTrainArray);

        System.out.println(Arrays.toString(numberOfTheTrainArray));

        for(int i = 0; i < train.length; i++)
        {
            for(int j = 0; j < numberOfTheTrainArray.length; j++)
            {
            if (train[i].getNumberOfTheTrain() == numberOfTheTrainArray[j]) System.out.println(train[j].getNumberOfTheTrain());
            }
        }

//        Часть 2
//
//        System.out.println("Введите номер поезда из списка : ");
//
//        for(int i = 0; i < train.length; i++)
//        {
//            System.out.println(train[0].getNumberOfTheTrain());
//        }
//
//        Scanner scan = new Scanner(System.in);
//        int numberOfTheTrain = scan.nextInt();
//
//        for(int i = 0; i < train.length; i++)
//        {
//            if (numberOfTheTrain == train[i].getNumberOfTheTrain()) train[i].getAllInfarmation();
//        }


        String[] nameOfTheTrainArray = new String[train.length];

        for(int i = 0; i < train.length; i++)
        {
            nameOfTheTrainArray[i] = train[i].getNameOfThDistanation();
        }

        Arrays.sort(nameOfTheTrainArray);

        System.out.println(Arrays.toString(nameOfTheTrainArray));





    }
}
