package ProgrammingWithClasses.AgregationAndComposition.Task5;

//5. Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.

public class Main
{
    public static void main(String[] args)
    {
    TypeOfTravel typeOfTravel = new TypeOfTravel();

    Methods methods = new Methods();

    String answer;

    answer = methods.writeAnswer(typeOfTravel.toStringArrayVacation(), methods.chooseTr(typeOfTravel.getTransport()),
            methods.chooseFood(typeOfTravel.getFood()),methods.chooseDay(typeOfTravel.getDay()));

    System.out.println(answer);
    }
}
