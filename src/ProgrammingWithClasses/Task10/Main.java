package ProgrammingWithClasses.Task10;

// 10. Создать класс Airline, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
// Airline: пункт назначения, номер рейса, тип самолета, время вылета,
// дни недели.  Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

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

        System.out.println("a) список рейсов для заданного пункта назначения : ");
        methods.listOfFlightsOfAGivenDestination();

        System.out.println("b) список рейсов для заданного дня недели :");
        methods.listofFlightsOfAGivenDayOfTheWeek();

        System.out.println("c) список рейсов для заданного дня недели, время вылета для которых больше заданного :");
        methods.listofFlightsOfAGivenDayOfTheWeekAndTime();
    }
}
