package Algoritmization;

import java.util.Arrays;

public class TwoDimensionalArraysTask13
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = сreateArray(stroki,stolbtsi);
        int[] temp = new int[arr.length];
        int[][] tempfinal = new int[arr.length][arr.length];

        int count = 0;

        System.out.println("**************Изначальный массив******************");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int z = 0; z < stroki; z++)
            сreateArraySortedPlus(stroki,stolbtsi,count,temp,arr,tempfinal,z);

        System.out.println();

        System.out.println("**********Отсортированные столбцы матрицы по возростанию **************");

        for (int z = 0; z < stroki; z++)
        {
            for (int g = 0; g < stolbtsi; g++)
            {
                System.out.print(tempfinal[z][g] + "\t");
            }
            System.out.println();
        }

        for(int z = 0; z < stroki; z++)
        сreateArraySortedMinus(stroki,stolbtsi,count,temp,arr,tempfinal,z);

        System.out.println();

        System.out.println("**********Отсортированные столбцы матрицы по убыванию **************");

        for (int z = 0; z < stroki; z++)
        {
            for (int g = 0; g < stolbtsi; g++)
            {
                System.out.print(tempfinal[z][g] + "\t");
            }
            System.out.println();
        }


    }

    public static int[] sortbyMin(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] < arr[k])
                {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;
    }

    public static void сreateArraySortedMinus(int stroki, int stolbtsi, int count, int[] temp, int[][] arr, int[][] tempfinal, int n)
    {
        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                count++;

                temp[j] = arr[j][n];

                if (count == arr.length)
                {
                    sortbyMin(temp);
                    for (int r = 0; r < stroki; r++)
                        tempfinal[r][n] = temp[r];
                }
            }
            count = 0;
        }
    }

    public static void сreateArraySortedPlus(int stroki, int stolbtsi, int count, int[] temp, int[][] arr, int[][] tempfinal, int n)
    {
        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                count++;

                temp[j] = arr[j][n];

                if (count == arr.length)
                {
                    Arrays.sort(temp);
                    for (int r = 0; r < stroki; r++)
                        tempfinal[r][n] = temp[r];
                }
            }
            count = 0;
        }
    }

    public static int[][] сreateArray(int x, int y)
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
