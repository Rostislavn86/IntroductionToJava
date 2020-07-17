package ProgrammingWithClasses.Task10;

public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();

        methods.airplane[0] = new Airplane("Ванкувер",1234,"Грузовой",21,55,"Monday");
        methods.airplane[1] = new Airplane("Минск",1111,"Пассажирский",15,105,"Friday");
        methods.airplane[2] = new Airplane("Торонто",4589,"Грузовой",3,0,"Saturday");
        methods.airplane[3] = new Airplane("Минск",4787,"Пассажирский",13,47,"Wednesday");
        methods.airplane[4] = new Airplane("Вильнюс",4444,"Грузовой",35,88,"Monday");

        //methods.listOfFlightsOfAGivenDestination();

        methods.listofFlightsOfAGivenDayOfTheWeek();
    }
}
