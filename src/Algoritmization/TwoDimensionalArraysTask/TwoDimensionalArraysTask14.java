package Algoritmization.TwoDimensionalArraysTask;

import java.util.Arrays;
import java.util.Random;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца

public class TwoDimensionalArraysTask14
{
    public static void main(String[] args)
    {
        final int min = 1; // Минимальное число для диапазона
        final int max = 15; // Максимальное число для диапазона
        final int rnd = rnd(min, max);

        int stroki = rnd;
        int stolbtsi = rnd;

        int arr[][] = сreateArray(stroki,stolbtsi);
        int[] temp = new int[arr.length];
        int[][] tempfinal = new int[arr.length][arr.length];

        int count = 0;

        for (int z = 0; z < stroki; z++)
            сreateArraySortedByCondition(stroki,stolbtsi,count,temp,arr,tempfinal,z);

        System.out.println("*******Случайная матрица m*n состоящая из нулей и единиц в которой число едениц равно номеру столбца*********");

        for (int z = 0; z < stroki; z++)
        {
            for (int g = 0; g < stolbtsi; g++)
            {
                System.out.print(tempfinal[z][g] + "\t");
            }
            System.out.println();
        }

        }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int[][] сreateArray(int x, int y)
    {

        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] = 0;
            }
        }
        return arr;
    }

    public static void сreateArraySortedByCondition(int stroki, int stolbtsi, int count, int[] temp, int[][] arr, int[][] tempfinal, int n)
    {
        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                count++;

                temp[j] = arr[j][n];

                if (count == arr.length)
                {
                    sortArrayByCondition(temp,n);
                    for (int r = 0; r < stroki; r++)
                        tempfinal[r][n] = temp[r];
                }
            }
            count = 0;
        }
    }


    public static void sortArrayByCondition(int[] arr, int count)
    {
        for (int i = 0; i < count + 1; i++)
        {
            arr[i] = 1;
        }

        //https://ru.wikipedia.org/wiki/%D0%A2%D0%B0%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5_%D0%A4%D0%B8%D1%88%D0%B5%D1%80%D0%B0_%E2%80%94_%D0%99%D0%B5%D1%82%D1%81%D0%B0

        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int index = rand.nextInt(i + 1);
            int swap = arr[index];
            arr[index] = arr[i];
            arr[i] = swap;
        }
    }
}
