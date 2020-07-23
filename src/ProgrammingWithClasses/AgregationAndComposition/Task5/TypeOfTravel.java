package ProgrammingWithClasses.AgregationAndComposition.Task5;

public class TypeOfTravel
{
    Rest rest;
    Excursions excursions;
    Treatment treatment;
    Shoping shoping;
    Cruise cruise;

    TypeOfTravel(Rest rest)
    {
    this.rest = rest;
    }

    TypeOfTravel(Cruise cruise)
    {
        this.cruise = cruise;
    }

    TypeOfTravel(Excursions excursions)
    {
        this.excursions = excursions;
    }

    TypeOfTravel(Shoping shoping)
    {
        this.shoping = shoping;
    }

    TypeOfTravel(Treatment treatment)
    {
        this.treatment = treatment;
    }


    public Rest getRest() {
        return rest;
    }

    public Excursions getExcursions() {
        return excursions;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public Shoping getShoping() {
        return shoping;
    }

    public Cruise getCruise() {
        return cruise;
    }

    @Override
    public String toString()
    {
        return "TypeOfTravel{" +
                "rest=" + rest +
                ", excursions=" + excursions +
                ", treatment=" + treatment +
                ", shoping=" + shoping +
                ", cruise=" + cruise +
                '}';
    }
}
