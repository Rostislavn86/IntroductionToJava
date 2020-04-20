package Algoritmization;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class TwoDimensionalArraysTask15 {
    public static void main(String[] args)
    {
        int stroki = 11;
        int stolbtsi = 11;

        int arr[][] = сreateArray(stroki, stolbtsi);
        int maxElem = 0;

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                maxElem = findMaxElement(arr[i]);
            }
        }

        System.out.println("Наибольший элемент матрицы = " + maxElem);

        System.out.println("**************Искомая матрица******************");

        int count = 0;

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                count++;
                if ((count % 2) != 0) arr[i][j] = maxElem;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int findMaxElement(int[] arr)
    {
        int max = 0;
        for(int i = 0; i < arr.length; i ++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static int[][] сreateArray(int x, int y) {
        int a = 0;
        int b = 41;

        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = a + (int) (Math.random() * b);
            }
        }
        return arr;
    }
}