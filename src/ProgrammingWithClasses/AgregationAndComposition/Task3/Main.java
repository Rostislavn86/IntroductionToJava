package ProgrammingWithClasses.AgregationAndComposition.Task3;

//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class Main
{
    public static void main(String[] args)
    {
    String nameOfTheState = "Republic of Belarus";
    String[] region = {"Minsk State","Gomel State","Grodno State","Mogiliov State","Brest State", "Vitebsk State"};
    int[] distrSquare = {1230,2000,1500,1200,4100,3600};
    String[] town = {"Minsk","Gomel","Grodno","Mogiliov","Brest","Vitebsk"};

    Region nameRegMinsk = new Region(region[0]);
    District districtMinsk = new District(distrSquare[0]);
    Towm towmMinsk = new Towm(town[0]);

    Region nameRegGomel = new Region(region[1]);
    District districtGomel = new District(distrSquare[1]);
    Towm towmGomel = new Towm(town[1]);

    Region nameRegGrodno = new Region(region[2]);
    District districtGrodno = new District(distrSquare[2]);
    Towm towmGrodno = new Towm(town[2]);

    Region nameRegMogiliov = new Region(region[3]);
    District districtMogiliov = new District(distrSquare[3]);
    Towm towmMogiliov = new Towm(town[3]);

    Region nameRegBrest = new Region(region[4]);
    District districtBrest = new District(distrSquare[4]);
    Towm towmBrest = new Towm(town[4]);

    Region nameRegVitebsk = new Region(region[5]);
    District districtVitebsk = new District(distrSquare[5]);
    Towm towmVitebsk = new Towm(town[5]);

    State stateMinsk = new State(nameOfTheState,nameRegMinsk,districtMinsk,towmMinsk);
    State stateGomel = new State(nameOfTheState,nameRegGomel,districtGomel,towmGomel);
    State stateGrodno = new State(nameOfTheState,nameRegGrodno,districtGrodno,towmGrodno);
    State stateMogiliov = new State(nameOfTheState,nameRegMogiliov,districtMogiliov,towmMogiliov);
    State stateBrest = new State(nameOfTheState,nameRegBrest,districtBrest,towmBrest);
    State stateVitebsk = new State(nameOfTheState,nameRegVitebsk,districtVitebsk,towmVitebsk);

    System.out.println("Столица региона это " + stateMinsk.getCity().getNameTowm());

    stateMinsk.getNumberOfTheRegion();
    stateMinsk.getTotalSquareOfTheRegion();
    System.out.println("Областные центры : ");
    System.out.println(stateGomel.getCity().getNameTowm());
    System.out.println(stateGrodno.getCity().getNameTowm());
    System.out.println(stateMogiliov.getCity().getNameTowm());
    System.out.println(stateBrest.getCity().getNameTowm());
    System.out.println(stateVitebsk.getCity().getNameTowm());
    }
}
