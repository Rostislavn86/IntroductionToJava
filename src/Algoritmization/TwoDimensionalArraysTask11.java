package Algoritmization;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class TwoDimensionalArraysTask11
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 20;

        int arr[][] = createArray(stroki,stolbtsi);

        System.out.println("Cтр");

        for (int i = 0; i < stroki; i++)
        {
            System.out.print(i + " | ");
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("***********************************************************************************");

        int[] tempArrray = new int[stroki];

        for (int i = 0; i < stolbtsi; i++)
        {
            for (int j = 0; j < stroki; j++)
            if (arr[j][i] == 5) tempArrray[j] += 5;
        }

        for (int j = 0; j < stroki; j++)
        {
            if (tempArrray[j] / 5 >= 3)
                System.out.println("Номер строки в которой число 5 встречается 3 и более раза = "+ j);
        }

        }

    public static int[][] createArray(int x, int y)
    {
        int min = 0; // Минимальное число для диапазона
        int max = 15; // Максимальное число для диапазона

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
