package ProgrammingWithClasses.Task10;

import java.util.Scanner;

public class Methods
{
    Airplane[] airplane = new Airplane[5];

    public void listofFlightsOfAGivenDayOfTheWeekAndTime()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите день недели : ");

        String day = scan.nextLine();

        System.out.println("Cписок рейсов отбывающий в данный пункт назначения : ");

        for(int i = 0; i < airplane.length; i++)
        {
            if (day.equals(airplane[i].getDayOfWeek()))
                System.out.println(airplane[i].toString());
            // Доделать ...
        }
    }

    public void listofFlightsOfAGivenDayOfTheWeek()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите день недели : ");

        String day = scan.nextLine();

        System.out.println("Cписок рейсов отбывающий в данный пункт назначения : ");

        for(int i = 0; i < airplane.length; i++)
        {
            if (day.equals(airplane[i].getDayOfWeek()))
                System.out.println(airplane[i].toString());
        }
    }

    public void listOfFlightsOfAGivenDestination()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите название назначения");

        String nameDestanation = scan.nextLine();

        System.out.println("Cписок рейсов заданного пункта назначения : ");

        for(int i = 0; i < airplane.length; i++)
        {
            if (nameDestanation.equals(airplane[i].getDistanationAdress()))
                System.out.println(airplane[i].toString());
        }
    }
}
