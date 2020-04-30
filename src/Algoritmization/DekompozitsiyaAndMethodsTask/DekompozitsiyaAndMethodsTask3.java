package Algoritmization.DekompozitsiyaAndMethodsTask;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника

public class DekompozitsiyaAndMethodsTask3
{
    public static void main(String[] args)
    {

        double a = 5 ; // длина стороны шестиугольника

        System.out.println("Площадь правильного шестиугольника = " + findAreaOfTriangle(a)*6);

    }

    private static double findAreaOfTriangle(double a)
    {
        double rez;

        rez = (Math.sqrt(3)/4)*Math.pow(a,2);

        return rez;
    }
}
