package Algoritmization;

public class TwoDimensionalArraysTask7
{
    public static void main(String[] args)
    {

        int stroki = 10;
        int stolbtsi = 10;

        double arr[][] = createArray(stroki,stolbtsi);

        int countPlus = 0;

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                if (arr[i][j] > 0) countPlus+=1;
            }
        }

        System.out.println("Количество положительных элементов матрицы : " + countPlus);

    }

    public static double[][] createArray(int x, int y)
    {
        double arr[][] = new double[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] = Math.sin((i * i - j * j) / x);
            }
        }
        return arr;
    }
    }
