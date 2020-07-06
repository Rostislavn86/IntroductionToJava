package ProgrammingWithClasses.Task4;

public class Train
{
    private String nameOfThDistanation;
    int numberOfTheTrain;
    int  departureTimeHour;
    int  departureTimeMin;

    Train(String nameOfThDistanation,int numberOfTheTrain, int departureTimeHour, int departureTimeMin)
    {

    this.nameOfThDistanation = nameOfThDistanation;
    this.numberOfTheTrain = numberOfTheTrain;

    if (departureTimeHour > 24)
        this.departureTimeHour = departureTimeHour % 24;
    else
        this.departureTimeHour = departureTimeHour;

    if (departureTimeMin > 60)
        this.departureTimeMin = departureTimeMin % 60;
    else
        this.departureTimeMin = departureTimeMin;
    }

    public int getDepartureTimeHour()
    {
        return departureTimeHour;
    }

    public int getNumberOfTheTrain()
    {
        return numberOfTheTrain;
    }

}
