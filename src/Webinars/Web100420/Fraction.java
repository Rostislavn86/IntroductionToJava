package Webinars.Web100420;

public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.m("2");
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private void m(String x)
    {
        System.out.println(x);
    }

    public Fraction sokr()
    {
        int nod;
        if (numerator > denominator) nod = denominator;
        else
            {
                nod = numerator;
            }

        while (!(numerator % nod == 0) && (denominator % 0 == 0 ))
        {
            nod--;
        }

        numerator = numerator / nod;
        denominator = denominator / nod;

        return this;//возвращает адрес той же дроюби которую он сократил


    }
}
