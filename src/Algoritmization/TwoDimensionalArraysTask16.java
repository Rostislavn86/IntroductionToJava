package Algoritmization;

public class TwoDimensionalArraysTask16
{
    public static void main(String[] args)
    {
       // ClassWithAmethodsForATask16 classWithAmethodsForATask16 = new ClassWithAmethodsForATask16();

        int size = 3;

        int arr[][] = сreateArray(size, size);

        int count = 0;

        System.out.println("**************Изначальный массив******************");

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int z = 0; z < size; z++)
        {
            System.out.println("z = " + z);
            System.out.println("Сумма значений столбца " + "0 = " + summOfColums(size,count,arr,z));
            System.out.println("Сумма значений строк " + "0 = " + summOfStrings(size,count,arr,z));

            if ((   summOfColums(size,count,arr,z) == summOfStrings(size,count,arr,z))
                    && (summOfMainDiagonal(arr) == summSideDiagonal(arr))
                    && ((summOfColums(size,count,arr,z) == summOfMainDiagonal(arr)))
                    && (summOfStrings(size,count,arr,z)) == summSideDiagonal(arr)) System.out.println("1 Raz");
            else System.out.println("NO");
        }



        System.out.println(summOfMainDiagonal(arr));
        System.out.println(summSideDiagonal(arr));

    }

    public static int summSideDiagonal(int[][] arr)
    {

        int summ = 0;

        for (int i = arr.length - 1; i > -1; i--)
        {
            for (int j = arr.length - 1; j > -1; j--)
            {
                if (i == j)
                    summ += arr[j][i];
            }
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
            if (count == 3) break;
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
            if (count == 3) break;
            count = 0;
        }
        return summ;
    }

    public static int[][] сreateArray(int x, int y) {

        int arr[][] = new int[x][y];

        int count = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        return arr;
    }
}
