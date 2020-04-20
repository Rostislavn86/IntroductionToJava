package BasicsOfSoftwareCodeDevelopmen.BranchesTask3;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Main
{
    public static void main(String[] args)
    {
        //http://www.pm298.ru/reshenie/fha0327.php
        int tochka1x = 1;
        int toshka1y = 1;
        int tochka2x = 2;
        int tochka2y = 2;
        int tochka3x = 3;
        int tochka3y = 3;

        if (((tochka1x - tochka3x)*( tochka2y - tochka3y)) == ((tochka2x - tochka3x) * ( toshka1y - tochka3y)))
            System.out.println("Точки лежат на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой");
    }
}
