package ProgrammingWithClasses.AgregationAndComposition.AgregationTask5Version2;

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

   // typeOfTravel.getTransport();

    System.out.println(typeOfTravel.toString());

    Methods methods = new Methods();


    }
}
