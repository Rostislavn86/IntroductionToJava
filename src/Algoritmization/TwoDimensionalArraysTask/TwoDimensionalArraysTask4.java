package Algoritmization.TwoDimensionalArraysTask;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(

public class TwoDimensionalArraysTask4 {
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = createArray(stroki,stolbtsi);

        System.out.println("Сформированная матрица по заданному образцу :");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int x, int y)
    {
        int arr[][] = new int[x][y];

        int count = 1;

        //Формируем не чётные строки по условию задачи
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if (i % 2 != 0) continue;
                arr[i][j] = count;
                if (i>=0) {count++;}
            }
            count = 1;
        }

        count = x;

        //Формируем чётные строки по условию задачи
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if (i % 2 == 0) continue;
                arr[i][j] = count;
                if (i>=0) {count--;}
            }

            count = x;
        }

        return arr;
    }
}
