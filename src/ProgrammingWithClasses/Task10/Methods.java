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

        System.out.println("Введите время отправления");

        System.out.println("Введите часы : ");
        String timeHour = scan.nextLine();
        int timeHourInt = Integer.parseInt(timeHour);

        if (timeHourInt > 24)
            timeHourInt = timeHourInt % 24;

        System.out.println("Введите минуты : ");
        String timeMin = scan.nextLine();
        int timeMinInt = Integer.parseInt(timeMin);

        if (timeMinInt > 60)
            timeMinInt = timeMinInt % 60;

        System.out.println("Cписок рейсов отбывающий в данный пункт назначения : ");

        for(int i = 0; i < airplane.length; i++)
        {
            if (day.equals(airplane[i].getDayOfWeek()))
            {
                if ((airplane[i].getDepartureTimeHour() > timeHourInt)
                        && (airplane[i].getDepartureTimeMin() > timeMinInt))
                System.out.println(airplane[i].toString());

                if ((airplane[i].getDepartureTimeHour() > timeHourInt)
                        && (airplane[i].getDepartureTimeMin() <= timeMinInt))
                    System.out.println(airplane[i].toString());
            }
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

        System.out.println("Введите название пункта назначения");

        String nameDestanation = scan.nextLine();

        System.out.println("Cписок рейсов заданного пункта назначения : ");

        for(int i = 0; i < airplane.length; i++)
        {
            if (nameDestanation.equals(airplane[i].getDistanationAdress()))
                System.out.println(airplane[i].toString());
        }
    }
}
