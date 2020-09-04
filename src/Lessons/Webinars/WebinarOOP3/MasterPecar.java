package Lessons.Webinars.WebinarOOP3;

public class MasterPecar extends Pecar
{

    public Pirog pechPirog()
    {

    System.out.println("Super Perog");

    return new SuperPirog();
    }
}
