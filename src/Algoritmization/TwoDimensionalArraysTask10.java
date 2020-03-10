package Algoritmization;

public class TwoDimensionalArraysTask10
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

        int arrTemp[] = new int[arr.length];

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                if (arr[i] == arr[j]) arrTemp[i] = arr[i][j];
            }
        }

        System.out.println("Положительные элементы главной диагонали квадратной матрицы :");

        for (int i = 0; i < stroki; i++)
        {
            if (arrTemp[i] > 0) System.out.println(arrTemp[i]);
        }

    }

    public static int[][] createArray(int x, int y)
    {
        int min = -10; // Минимальное число для диапазона
        int max = 100; // Максимальное число для диапазона

        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] =min + (int) (Math.random() * max);
            }
        }
        return arr;
    }
}
