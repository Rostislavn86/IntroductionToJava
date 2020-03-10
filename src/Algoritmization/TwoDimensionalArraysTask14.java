package Algoritmization;

import java.util.Arrays;

public class TwoDimensionalArraysTask14
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 11;

        int stroki =  a + (int) (Math.random() * b);
        int stolbtsi = a + (int) (Math.random() * b);

        int arr[][] = сreateArray(stroki,stolbtsi);

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



        System.out.println();

        System.out.println("**********Отсортированные столбцы матрицы по возростанию **************");

        for (int z = 0; z < stroki; z++)
        {
            for (int g = 0; g < stolbtsi; g++)
            {
                count++;
                if (count <= stolbtsi)
                {
                    for (int r = 0; r < stolbtsi; r++)
                    {
                        if (arr[z][g] == 1)
                        arr[z][g] = 5;


                    }
                }
                System.out.print(arr[z][g] + "\t");
            }
            System.out.println(count);

            count = 0;

            System.out.println();
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
                arr[i][j] = (int) Math.round( Math.random() );
            }
        }
        return arr;
    }


}
