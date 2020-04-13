package Algoritmization;

public class DekompozitsiyaAndMethodsTask4
{

    //https://www.codeflow.site/ru/article/java-distance-between-two-points

    public static void main(String[] args)
    {
        final int min = -15; // Минимальное число для диапазона оси обсциисс
        final int max = 15; // Максимальное число для диапазона оси ординат
       // int rnd = rnd(min, max);


//        int x = rnd;
//        int y = rnd;

        int n = rnd(1,10); // количество точек от одного до десяти

        int massivX[] = new int[n];

        System.out.println("-------------------------");

        for(int i = 0; i < n; i ++)
        {
            massivX[i] = rnd(min, max);
            System.out.println(massivX[i]);
        }

        System.out.println("-------------------------");

        int massivY[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            massivY[i] = rnd(min, max);
            System.out.println(massivY[i]);
        }

        System.out.println("-------------------------");

        int massivXY[][] = new int[n][2];

        System.out.println("x  " + " y");

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < 2; j ++)
            {
                massivXY[i][j] = massivX[i];
                if (j > 0) massivXY[i][j] = massivY[i];
                System.out.print(massivXY[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println("-------------------------");

        System.out.println("точка 1" + " x ="  + massivXY[0][0] + " y=" + massivXY[0][1]);
        System.out.println("точка 2" + " x ="  + massivXY[1][0] + " y=" + massivXY[1][1]);

        System.out.println(calculateDistanceBetweenPoints(massivXY[0][0],massivXY[0][1],massivXY[1][0],massivXY[1][1]));

                System.out.println(n);




    }

    public static double calculateDistanceBetweenPoints(
            double x1,
            double y1,
            double x2,
            double y2)
    {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++ max) + min;
    }

    public static int[] сreateArrayX(int n, int x)
    {

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {

        }
        return arr;
    }
}
