package ProgrammingWithClasses.Task4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        Train[] train = new Train[5];

        train[0] = new Train("Минск",123,58,43);
        train[1] = new Train("Минск",121,21,44);
        train[2] = new Train("Киев",129,1,45);
        train[3] = new Train("Минск",130,15,59);
        train[4] = new Train("Минск",135,22,0);

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

    }



}
