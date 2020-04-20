package BasicsOfSoftwareCodeDevelopmen.BranchesTask1;

//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Main
{
    public static void main(String[] args) {
        int ugol1 = 30;
        int ugol2 = 60;

        provPriamougolniitreugolnik(ugol1,ugol2,trueOrFalseTreangle(ugol1,ugol2));
    }

    public static boolean trueOrFalseTreangle(int ug1, int ug2)
    {
        if (ug1 + ug2 >= 180) return false; else
        return true;
    }

    public static void provPriamougolniitreugolnik(int ug1, int ug2, boolean b)
    {
        if (b == false)
        {
            System.out.println("Треугольник не существует");
        }
            else {
            if ((b == true) && (ug1 + ug2 == 90)) System.out.println("Треульгольник равнобедренный");
            else System.out.println("Треульгольник не равнобедренный");
        }
    }
}
