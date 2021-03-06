package Algoritmization.TwoDimensionalArraysTask;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class TwoDimensionalArraysTask1
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = createArray(stroki,stolbtsi);

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Все не чётные столбцы у которых первый элемент больше последнего :");
        System.out.println();

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                 if ((arr[0][i] > arr[stroki-1][i]))
                 {
                     if (i % 2 != 0) continue;
                     System.out.print(arr[j][i] + "\t");
                 }
            }
            System.out.println();
        }

    }

    public static int[][] createArray(int x, int y)
    {

        int a = 0;
        int b = 10;

        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] = a + (int) (Math.random() * b);
            }
        }
        return arr;
    }



}
