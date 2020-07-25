package ProgrammingWithClasses.AgregationAndComposition.AgregationTask5Version2;

//5. Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.

public class TypeOfTravel {

    //используем отношение has-a
    private Rest rest;
    private Shoping shoping;

    public TypeOfTravel()
    {
        this.rest = new Rest();
        this.shoping = new Shoping();
    }

    public void getTransport()
    {
        System.out.println(rest.getTransport());
        System.out.println(shoping.getTransport());
    }

    public void getFood()
    {
        System.out.println(rest.getFood());
        System.out.println(shoping.getFood());
    }

    public void getDay()
    {
        System.out.println(rest.getDay());
        System.out.println(shoping.getDay());
    }

    @Override
    public String toString() {
        return rest.toString() + "\n"
                + shoping.toString();
    }
}
