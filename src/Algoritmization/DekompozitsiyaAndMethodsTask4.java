package Algoritmization;

public class DekompozitsiyaAndMethodsTask4
{
    public static void main(String[] args)
    {
        final int min = -15; // Минимальное число для диапазона значений
        final int max = 15; // Максимальное число для диапазона значений

        int n = rnd(2,100); // количество точек от двух до ста

        int massivX[];
        int massivY[];

        massivX = createXdots(n,max,min);
        massivY = createYdots(n,max,min);

        writeXYdots(massivX,massivY,n);

        System.out.println("-----------------------------------");

        int count = 0;

        double[] maxZnach = new double[n*n];

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j ++)
            {
                maxZnach[count] = calculateDistanceBetweenPoints(massivX[i], massivY[i], massivX[j], massivY[j]);
                count++;
            }
        }

        double maxZnachCifra = findMax(maxZnach);

        System.out.println("Максимальное значение между думя точками = " + maxZnachCifra);

        count = 0;

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j ++)
            {
                if (maxZnach[count] == maxZnachCifra)
                {
                    System.out.println("Максимальное расстояие между точками ");
                    System.out.println((i + 1) + " и " + (j + 1));
                    break;
                }
                count++;
            }
            if (maxZnach[count] == maxZnachCifra) break;
        }
    }

    public static double findMax(double[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void writeXYdots(int[] massivX, int[] massivY, int n)
    {
        System.out.println("Искомые точки по условию задачи : ");

        int massivXY[][] = new int[n][2];

        System.out.println("x  " + " y");

        for(int i = 0; i < n; i ++)
        {
            System.out.println("Точка " + (i + 1));
            for(int j = 0; j < 2; j ++)
            {
                massivXY[i][j] = massivX[i];
                if (j > 0) massivXY[i][j] = massivY[i];
                System.out.print(massivXY[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] createXdots(int n, int max, int min)
    {
        int massivX[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            massivX[i] = rnd(min, max);
        }
        return massivX;
    }

    public static int[] createYdots(int n, int max, int min)
    {
        int massivY[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            massivY[i] = rnd(min, max);
        }
        return massivY;
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

}