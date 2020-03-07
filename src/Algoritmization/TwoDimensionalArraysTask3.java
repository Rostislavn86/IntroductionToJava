package Algoritmization;

public class TwoDimensionalArraysTask3 {
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = CreateArray(stroki,stolbtsi);

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int k = 3;//Строка k
        int p = 5;//Столбец p

        System.out.println();

        System.out.println("Вывели строку номер " + k);

        for (int i = 0; i < stroki; i++)
        {

            for (int j = 0; j < stolbtsi; j++)
            {
                if (i == k) System.out.print(arr[k][j] + " ");
            }

        }

        System.out.println();

        System.out.println("Вывели столбец номер " + p);

        for (int i = 0; i < stroki; i++)
        {

            for (int j = 0; j < stolbtsi; j++)
            {
                if (j == p) System.out.print(arr[i][p] + " " );
            }

        }

    }

    public static int[][] CreateArray(int x, int y)
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
