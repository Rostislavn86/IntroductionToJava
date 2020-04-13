package Webinars.Web100420;

public class Main
{
    public static void main(String[] args)
    {
        Fraction fraction = new Fraction(4,16);

        System.out.println("Изначальное значение дроби " + fraction.getNumerator() + "/" + fraction.getDenominator());

        fraction.sokr();

        System.out.println("Сокращённая дробь " + fraction.getNumerator() + "/" + fraction.getDenominator());



    }





}
