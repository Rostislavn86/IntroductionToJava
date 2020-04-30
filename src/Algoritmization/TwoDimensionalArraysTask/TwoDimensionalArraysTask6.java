package Algoritmization.TwoDimensionalArraysTask;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class TwoDimensionalArraysTask6
{
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

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] = 1;
            }

        }

        for (int i = 0; i < arr.length / 2 + 1 ; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;
            }
        }

        for (int i=arr.length-1 ; i>=arr.length/2 ; i--)
        {
            for (int j=0 ; j<arr[i].length ; j++)
            {
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;}
        }

        return arr;
    }

}
