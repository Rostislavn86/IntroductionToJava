package BasicsOfSoftwareCodeDevelopmen.BranchesTask4;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//        отверстие.

public class Main
{
    public static void main(String[] args)
    {
     int a = 5;
     int b = 6;

     int x = 5;
     int y= 6;
     int z= 10;

     if ((a == x || a == y || a == z) && (b == x || b == y || b == z))
         System.out.println("Кирпич пройдёт через отверстие");
     else System.out.println("Кирпич не пройдёт через отверстие");

    }
}
