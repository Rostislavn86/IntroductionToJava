package Algoritmization;

import java.util.Random;

public class TwoDimensionalArraysTask16
{
    public static void main(String[] args)
    {
       // ClassWithAmethodsForATask16 classWithAmethodsForATask16 = new ClassWithAmethodsForATask16();

        int size = 3;

 //       int arr[][] = сreateArray(size, size);
//        int arr[][] = { { 6, 1, 8 },
//                        { 7, 5, 3  },
//                        { 2, 9 ,4  }
//        };

        int count = 0;

//        System.out.println("**************Изначальный массив******************");
//
//        for (int i = 0; i < size; i++)
//        {
//            for (int j = 0; j < size; j++)
//            {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println("пров равно = " + provMassiv(arr,size,count));
//        provMassiv(arr,size,count);

        System.out.println("метод " + provMassiv(size,count));

        if (provMassiv(size,count) == 3) System.out.println("Ura");

        do {

            provMassiv(size,count);
        } while (provMassiv(size,count) != 3);

//        for (int i = 0; i < size; i++)
//        {
//            for (int j = 0; j < size; j++)
//            {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

      //  provMassiv(arr,size,count);


//        for(;;)
//        {
//            int countRepeat = 0;
//
//            for (int z = 0; z < size; z++) {
//                System.out.println("z = " + z);
//                System.out.println("Сумма значений столбца " + "0 = " + summOfColums(size, count, arr, z));
//                System.out.println("Сумма значений строк " + "0 = " + summOfStrings(size, count, arr, z));
//
//                if ((summOfColums(size, count, arr, z) == summOfStrings(size, count, arr, z))
//                        && (summOfMainDiagonal(arr) == summSideDiagonal(arr))
//                        && ((summOfColums(size, count, arr, z) == summOfMainDiagonal(arr)))
//                        && (summOfStrings(size, count, arr, z)) == summSideDiagonal(arr)
//                        && (summOfColums(size, count, arr, z) == summSideDiagonal(arr))
//                        && (summOfStrings(size, count, arr, z)) == summOfMainDiagonal(arr)) {
//                    countRepeat++;
//                    System.out.println("1 Raz");
//
//                }
//
//
//            }
//            if (countRepeat < 3)
//            {
//                break;
//            }
//            if (countRepeat == 3)  break;
//
//            System.out.println("Repeat " + countRepeat);
//        }

//        for (int i = 0; i < size; i++)
//        {
//            for (int j = 0; j < size; j++)
//            {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        System.out.println(summOfMainDiagonal(arr));
//        System.out.println(summSideDiagonal(arr));

    }

    public static int provMassiv(int size, int count)
    {
        int arr[][] = сreateArray(size, size);

        int countRepeat = 0;

        for (int z = 0; z < size; z++) {
            System.out.println("z = " + z);
            System.out.println("Сумма значений столбца " + z + " = " + summOfColums(size, count, arr, z));
            System.out.println("Сумма значений строк " + z + " = " + summOfStrings(size, count, arr, z));
            System.out.println("Сумма значений основной диагонали " + z + " = " + summOfMainDiagonal(arr));
            System.out.println("Сумма значений побочноый диагонали " + z + " = " + summSideDiagonal(arr));
            // Сделать правильный расчт суммы матрицы по побочной диагонали

            //Uslovie 1
            if ((summOfColums(size, count, arr, z) == summOfStrings(size, count, arr, z))
                    && (summOfMainDiagonal(arr) == summSideDiagonal(arr))
                    && ((summOfColums(size, count, arr, z) == summOfMainDiagonal(arr)))
                    && (summOfStrings(size, count, arr, z)) == summSideDiagonal(arr)
                    && (summOfColums(size, count, arr, z) == summSideDiagonal(arr))
                    && (summOfStrings(size, count, arr, z)) == summOfMainDiagonal(arr))

            {
                countRepeat++;
                System.out.println("1 Raz");
            //    return countRepeat;
            }
            else
            {
                //countRepeat--;
                //return countRepeat;
               // System.out.println("NO");
            }

                    for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        }

        return countRepeat;
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

    public static int[][] сreateArray(int x, int y)
    {
        System.out.println(x*y);

        int count = 1;

        int znachMassiva[] = new int[x*y];
        for (int i = 0; i < x*y; i++ )
        {
            znachMassiva[i] = count++;
    //        System.out.println("znach massiva " + znachMassiva[i]);
        }

     //   System.out.println(znachMassiva.length);

        //System.out.println(z);

        Random rand = new Random();
        //for (int i = 9; i > 0; i--)
        for (int i = 0; i < x*y; i++ )
        {
            int index = rand.nextInt(i + 1);
            int swap = znachMassiva[index];
            znachMassiva[index] = znachMassiva[i];
            znachMassiva[i] = swap;
        }

//        for (int i = 0; i < 9; i++)
//        System.out.println("znach Massiva Rand" + znachMassiva[i]);

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
