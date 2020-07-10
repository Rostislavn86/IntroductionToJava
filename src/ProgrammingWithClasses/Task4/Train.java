package ProgrammingWithClasses.Task4;

public class Train implements Comparable <Train>
{
    private String nameOfThDistanation;
    int numberOfTheTrain;
    Integer  departureTimeHour;
    Integer  departureTimeMin;

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

    public String getNameOfThDistanation() {return nameOfThDistanation;}

    public int getDepartureTimeHour()
    {
        return departureTimeHour;
    }

    public int getNumberOfTheTrain()
    {
        return numberOfTheTrain;
    }

    public void sortByPlaceAndTime(String[] place)
    {
        for(int  i = 0; i < place.length; i++)
        {

        }
    }

    @Override
    public int compareTo(Train o) {

        int result = this.nameOfThDistanation.compareTo(o.nameOfThDistanation);

        if (result == 0)
        {
            result = this.departureTimeHour.compareTo(o.departureTimeHour);
        }

        if (result == 0)
        {
            result = this.departureTimeMin.compareTo(o.departureTimeMin);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Станция назначения : " + nameOfThDistanation + '\''
                + " Номер поезда : " + numberOfTheTrain +
                " Время прибытия (часы) : " + departureTimeHour +
                ", Время прибытия (минуты) : " + departureTimeMin ;
    }
}
