package ProgrammingWithClasses.AgregationAndComposition.AgregationTask5Version2;

import java.util.Scanner;

public class Methods
{
    public void chooseTr(String[] trArray)
    {
        String[] bufferTrArray = new String[trArray.length];

        System.out.println("Список доступного транспорта на выбор : ");
        for(int i = 0; i <trArray.length; i++)
        {
            bufferTrArray[i] = trArray[i];
            for(int j = 0; j <trArray.length; j++)
            {
                if (trArray[i].equals(bufferTrArray[j])) continue;
                System.out.println(trArray[i]);
            }

        }

        System.out.println("Пожалуйста введите название трансопорта : ");

        Scanner scan = new Scanner(System.in);
        String chooseTr = scan.nextLine();


    }
}
