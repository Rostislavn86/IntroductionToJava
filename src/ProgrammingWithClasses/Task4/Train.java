package ProgrammingWithClasses.Task4;

import javax.swing.*;

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

    public String getNameOfThDistanation() {return nameOfThDistanation;}

    public int getDepartureTimeHour()
    {
        return departureTimeHour;
    }

    public int getNumberOfTheTrain()
    {
        return numberOfTheTrain;
    }

    public void getAllInfarmation()
    {
        System.out.println("Пункт назначения " + nameOfThDistanation
                + " номер поезда "
                + numberOfTheTrain
                + " время приезда "
                + departureTimeHour
                + " часов "
                + departureTimeMin
                + " мунут ");
    }

}
