package ProgrammingWithClasses.AgregationAndComposition.Task5;

//5. Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.

//Сделать как композицию
import java.util.Scanner;

//Попробовать доделать через сравнение строк, через toString

public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();
        //Сформируем путёвки по каждому типу отдаха

        TypeOfTravel typeOfTravelRest = new TypeOfTravel(new Rest());
        TypeOfTravel typeOfTravelCruise = new TypeOfTravel(new Cruise());
        TypeOfTravel typeOfTravelExcursions = new TypeOfTravel(new Excursions());
        TypeOfTravel typeOfTravelShoping = new TypeOfTravel(new Shoping());
        TypeOfTravel typeOfTravelTreatment = new TypeOfTravel(new Treatment());

        methods.allVauchers[0] = typeOfTravelRest;
        methods.allVauchers[1] = typeOfTravelRest;
        methods.allVauchers[2] = typeOfTravelRest;
        methods.allVauchers[3] = typeOfTravelRest;
        methods.allVauchers[4] = typeOfTravelRest;

        methods.chooseTr(methods.allVauchers);
//
//        System.out.println(typeOfTravelRest.rest.getTransport());
//        System.out.println(typeOfTravelCruise.cruise.getTransport());
//        System.out.println(typeOfTravelExcursions.excursions.getTransport());
//        System.out.println(typeOfTravelShoping.shoping.getTransport());
//        System.out.println(typeOfTravelTreatment.treatment.getTransport());



        System.out.println(typeOfTravelRest.toString());

        //
        //

        //Сформируем список доступного тарнспорта для отдыха для всех путёвок



       // chooseTr(trArray);











    }



    public static String chooseFood(String[] food)
    {
        System.out.println("Список доступного транспорта на выбор : ");
        for(int i = 0; i <food.length; i++)
        {
            System.out.println(food[i]);
        }

        System.out.println("Пожалуйста введите название трансопорта : ");

        Scanner scan = new Scanner(System.in);
        String chooseTr = scan.nextLine();

        return chooseTr;
    }

    public static String chooseTr(String[] trArray)
    {
        System.out.println("Список доступного транспорта на выбор : ");
        for(int i = 0; i < trArray.length; i++)
        {
            System.out.println(trArray[i]);
        }

        System.out.println("Пожалуйста введите название трансопорта : ");

        Scanner scan = new Scanner(System.in);
        String chooseTr = scan.nextLine();

       return chooseTr;
    }

}
