package ProgrammingWithClasses.Task4;

import TestComporator.User;

import javax.swing.*;

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

    public void sortByPlaceAndTime(String[] place)
    {
        for(int  i = 0; i < place.length; i++)
        {

        }
    }

//    @Override
////реализуем метод compareTo интерфейса Comparable
//    public int compareTo(User o)
//    {
//
////используем метод compareTo из класса String для сравнения имен
//        int result = this.nameOfThDistanation.compareTo(o.nameOfThDistanation);
//
////если имена одинаковые -  сравниваем возраст,
//        //       используя метод compareTo из класса Integer
//
//        if (result == 0)
//        {
//            result = this.departureTimeHour.compareTo(o.departureTimeHour);
//        }
//        return result;
//    }

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
        return "{" +
                "nameOfThDistanation='" + nameOfThDistanation + '\'' +
                ", departureTimeHour=" + departureTimeHour +
                ", departureTimeMin='" + departureTimeMin + '\'' +
                '}';
    }
}
