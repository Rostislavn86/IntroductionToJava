package Algoritmization.TwoDimensionalArraysTask;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class TwoDimensionalArraysTask9
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = createArray(stroki,stolbtsi);

        System.out.println("Искомая матрица :");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        workMethod(arr);
    }

    public static int[][] createArray(int x, int y)
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

    public static void workMethod(int[][] arr) {

        int[] maxMass = new int[arr.length];

        int[][] mas = arr;
        int s = 0;
        for (int i = 0; i < arr[0].length; i++)
        {
            s = 0;
            System.out.println("Сумма элементов " + i + " столбца");
            for (int j = 0; j < arr.length; j++)
            {
                s = s + mas [j][i];
                if (j == arr[i].length - 1) maxMass[i] = s;
            }
            System.out.println(s);
        }

        int maxChislo = findMax(maxMass);;

        System.out.println("Максимальную сумму содерит столбец под номером :");
        System.out.println(findIndex(maxMass,maxChislo));
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findIndex(int[] arr, int maxElem) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxElem) {
                count = i;
            }
        }
        return count;
    }
}
