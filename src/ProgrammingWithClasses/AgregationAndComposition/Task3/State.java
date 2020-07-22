package ProgrammingWithClasses.AgregationAndComposition.Task3;

public class State
{
    private String nameState;
    private Region region;
    private District district;
    private Towm city;

    private static int count;
    private static int totalSquare;

    State(String name, Region region, District district, Towm city)
    {
    this.nameState = name;
    this.region = region;
    this.district = district;
    this.city = city;

    count++;
    totalSquare += district.getDistrSquare();
    }

    public Towm getCity()
    {
        return city;
    }

    public void getNumberOfTheRegion()
    {
        System.out.println("Килечество областей региона " + nameState + " = "+ count);
    }

    public void getTotalSquareOfTheRegion()
    {
        System.out.println("Общая площадь всего региона " + nameState + " = "+ totalSquare);
    }
}
