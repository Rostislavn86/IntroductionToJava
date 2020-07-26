package ProgrammingWithClasses.AgregationAndComposition.Task5;

//5. Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.

public class TypeOfTravel {

    //используем отношение has-a
    private Rest rest;
    private Shoping shoping;
    private Cruise cruise;
    private Excursions excursions;

    public TypeOfTravel()
    {
        this.rest = new Rest();
        this.shoping = new Shoping();
        this.cruise = new Cruise();
        this.excursions = new Excursions();
    }

    public String[] getTransport()
    {
        String tr = rest.getTransport() + "!" + shoping.getTransport()
                + "!" + cruise.getTransport()
                + "!" + excursions.getTransport();
        String[] trArray = tr.split("!");
        return trArray;
    }

    public String[] getFood()
    {
        String tr = rest.getFood() + "!" + shoping.getFood()
                + "!" + cruise.getFood()
                + "!" + excursions.getFood();
        String[] trArray = tr.split("!");
        return trArray;
    }

    public String[] getDay()
    {
        String tr = rest.getDay() + "!" + shoping.getDay()
                + "!" + cruise.getDay()
                + "!" + excursions.getDay();
        String[] trArray = tr.split("!");
        return trArray;
    }

    public String[] toStringArrayVacation()
    {
        String travelString = rest.toString()
        + "!" + shoping.toString()
        + "!" + cruise.toString()
        + "!" + excursions.toString();

        String[] travelStringArray = travelString.split("!");
        return  travelStringArray;
    }

}
