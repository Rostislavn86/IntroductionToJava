package Algoritmization;

public class TwoDimensionalArraysTask11
{
    public static void main(String[] args)
    {
        int stroki = 10;
        int stolbtsi = 20;

        int arr[][] = CreateArray(stroki,stolbtsi);

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                arr[0][1] = 5;
                arr[0][2] = 5;
                arr[0][3] = 5;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("*********************************************");

        //int[] countUslovie = new int[stolbtsi];

        int nomerStroki = 0;
        int countFive = 0;

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {

                    for (int k = 0; k < stroki; k++) {
                        if (arr[k][j] == 5) {
                            System.out.println("K " + k + "contfive" + countFive);
                            countFive += 1;
                          //  System.out.println("nomer stroki " + k + " kolich petiorok " + countFive);
                            if (countFive >= 3) {
                                nomerStroki = k;
                                System.out.println("Номер строки " + nomerStroki);
                                continue;
                            }
                        }
                    }


                    countFive = 0;
                       // arr[k][j] = 66;
                //countFive = 0;

            }
            //System.out.println();
        }

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static int[][] CreateArray(int x, int y)
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
