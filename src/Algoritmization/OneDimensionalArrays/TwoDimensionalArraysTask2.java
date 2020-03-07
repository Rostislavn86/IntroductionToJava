package Algoritmization.OneDimensionalArrays;

public class TwoDimensionalArraysTask2
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = CreateMassiv(stroki,stolbtsi);

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Элементы квадратной матрицы стоящие по диагонали : ");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                if (arr[i] == arr[j])
                System.out.print(arr[i][j]);
            }
        }


    }

    public static int[][] CreateMassiv(int x, int y)
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
