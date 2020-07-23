package ProgrammingWithClasses.AgregationAndComposition.Task5;

import java.util.Scanner;

public class Methods
{
    public  TypeOfTravel[] allVauchers = new TypeOfTravel[5];

    public String chooseTr(TypeOfTravel[] trArray)
    {
        System.out.println("Список доступного транспорта на выбор : ");
        for(int i = 0; i < trArray.length; i++)
        {

        }

        System.out.println("Пожалуйста введите название трансопорта : ");

        Scanner scan = new Scanner(System.in);
        String chooseTr = scan.nextLine();

        return chooseTr;
    }
}
