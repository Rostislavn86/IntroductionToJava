package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task10;

public class Airplane
{

    String distanationAdress;
    int numberOfTheAirplane;
    String typeOfTheAirplane;
    Integer  departureTimeHour;
    Integer  departureTimeMin;
    String dayOfWeek;

    public Airplane(String distanationAdress, int numberOfTheAirplane, String typeOfTheAirplane, Integer departureTimeHour, Integer departureTimeMin, String dayOfWeek)
    {
        this.distanationAdress = distanationAdress;
        this.numberOfTheAirplane = numberOfTheAirplane;
        this.typeOfTheAirplane = typeOfTheAirplane;

        if (departureTimeHour > 24)
            this.departureTimeHour = departureTimeHour % 24;
        else
            this.departureTimeHour = departureTimeHour;

        if (departureTimeMin > 60)
            this.departureTimeMin = departureTimeMin % 60;
        else
            this.departureTimeMin = departureTimeMin;

        String[] dayOfWeeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i = 0; i <dayOfWeeks.length; i++)
            if (dayOfWeek.equals(dayOfWeeks[i])) this.dayOfWeek = "Error";
            else
                this.dayOfWeek = dayOfWeek;
    }

    public String getDistanationAdress() {
        return distanationAdress;
    }

    public void setDistanationAdress(String distanationAdress) {
        this.distanationAdress = distanationAdress;
    }

    public int getNumberOfTheAirplane() {
        return numberOfTheAirplane;
    }

    public void setNumberOfTheAirplane(int numberOfTheAirplane) {
        this.numberOfTheAirplane = numberOfTheAirplane;
    }

    public String getTypeOfTheAirplane() {
        return typeOfTheAirplane;
    }

    public void setTypeOfTheAirplane(String typeOfTheAirplane) {
        this.typeOfTheAirplane = typeOfTheAirplane;
    }

    public Integer getDepartureTimeHour() {
        return departureTimeHour;
    }

    public void setDepartureTimeHour(Integer departureTimeHour) {
        this.departureTimeHour = departureTimeHour;
    }

    public Integer getDepartureTimeMin() {
        return departureTimeMin;
    }

    public void setDepartureTimeMin(Integer departureTimeMin) {
        this.departureTimeMin = departureTimeMin;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek)
    {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return  "Пункт назначения : " + distanationAdress + '\'' +
                " номер самолёта : " + numberOfTheAirplane +
                " тип самолёта : " + typeOfTheAirplane + '\'' +
                " время вылета : " + departureTimeHour +
                ":" + departureTimeMin +
                " день недели : " + dayOfWeek;
    }
}
