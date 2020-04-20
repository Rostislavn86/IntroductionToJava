package Algoritmization;

import java.util.Random;

//16. Задание 16. Построить магический квадрат.

public class TwoDimensionalArraysTask16
{
    public static void main(String[] args)
    {
        int size = 3;

        int count = 0;

        System.out.println("Сформированный магичесий Квадрат :");

        for(;;)
        {
            if (findMagicArray(size,count) == size) break;
        }
    }

    public static int summOfArray(int[][] arr)
    {
        int b;

        b = ((arr.length*(arr.length*arr.length+1)))/2;

        return b;
    }



    public static int findMagicArray(int size, int count)
    {
       int arr[][] = сreateArray(size, size);

       int countRepeat = 0;

        for (int z = 0; z < size; z++)
        {

            if ((summOfColums(size, count, arr, z) == summOfStrings(size, count, arr, z))
                    && (summOfMainDiagonal(arr) == summSideDiagonal(arr))
                    && ((summOfColums(size, count, arr, z) == summOfMainDiagonal(arr)))
                    && (summOfStrings(size, count, arr, z)) == summSideDiagonal(arr)
                    && (summOfColums(size, count, arr, z) == summSideDiagonal(arr))
                    && (summOfStrings(size, count, arr, z)) == summOfMainDiagonal(arr)
                    && (summOfArray(arr) == summOfMainDiagonal(arr))
                    && (summOfArray(arr) == summSideDiagonal(arr))
            )
            {
                countRepeat++;
            }
            else
            {
                countRepeat = 0;
            }
        }

            if (countRepeat == size)
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }

        if (countRepeat == size) System.out.println("=========");

        return countRepeat;
    }

    public static int summSideDiagonal(int[][] arr)
    {

        int summ = 0;

        for(int i = 0; i < arr.length; i++)

            for(int j = 0; j < arr.length; j++)

            {
                if (i + j == arr.length - 1) summ += arr[i][j];
            }

        return summ;
    }

    public static int summOfMainDiagonal(int[][] arr)
    {
        int razm = arr.length;

        int summ = 0;

        for (int i = 0; i < razm; i++)
        {
            for (int j = 0; j < razm; j++)
            {
                if (i == j)
                    summ += arr[j][i];
            }
        }
        return summ;
    }

    public static int summOfColums(int razm, int count, int[][] arr, int n)
    {
        int summ = 0;

        for (int i = 0; i < razm; i++)
        {
            for (int j = 0; j < razm; j++)
            {
                count++;
                summ += arr[j][n];
            }
            if (count == arr.length) break;
            count = 0;
        }
        return summ;
    }

    public static int summOfStrings(int razm, int count, int[][] arr, int n)
    {
        int summ = 0;

        for (int i = 0; i < razm; i++)
        {
            for (int j = 0; j < razm; j++)
            {
                count++;

                summ += arr[n][j];
            }
            if (count == arr.length) break;
            count = 0;
        }
        return summ;
    }

    public static int[][] сreateArray(int x, int y)
    {
        int count = 1;

        int znachMassiva[] = new int[x*y];
        for (int i = 0; i < x*y; i++ )
        {
            znachMassiva[i] = count++;
        }

        Random rand = new Random();

        for (int i = 0; i < x*y; i++ )
        {
            int index = rand.nextInt(i + 1);
            int swap = znachMassiva[index];
            znachMassiva[index] = znachMassiva[i];
            znachMassiva[i] = swap;
        }

        int arr[][] = new int[x][y];

        int count2 = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = znachMassiva[count2];
                count2++;
            }
        }
        return arr;
    }
}