package ProgrammingWithClasses.AgregationAndComposition.Task4;

public class Clients
{
    String nameClient;
    Accaunts accaunts;

    Clients(String nameClient,Accaunts accaunts)
    {
    this.nameClient = nameClient;
    this.accaunts = accaunts;
    }

    public void findNumberOfTheAccauntByTheNameOfTheClient(String name)
    {
        if (name.equals(this.nameClient)) System.out.println("Номер счёта = " + accaunts.getNumberOfTheAccaunt());

    }
}
