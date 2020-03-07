package Algoritmization.OneDimensionalArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TwoDimensionalArraysTask9
{
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

        etalonMatrix(arr);



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

    public static int etalonMatrix(int [][] convertToMatrix) {

        int[] maxMass = new int[convertToMatrix.length];

        int [][] mas = convertToMatrix;
        int s = 0;
        for (int i = 0; i < convertToMatrix[0].length; i++)
        {
            s = 0;

            for (int j = 0; j < convertToMatrix.length; j++)
            {
                s = s + mas [j][i];
                if (j == convertToMatrix[i].length - 1) maxMass[i] = s;
                System.out.println(s + " ");
            }

            System.out.println(" ");
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        int countColumn = 0;

        for (int i = 0; i < convertToMatrix.length; i++)
        {
                System.out.println(i + " " + maxMass[i]);
        }




//        System.out.println("col" + countColumn);
//
        Arrays.sort(maxMass);
//
        System.out.println(maxMass[convertToMatrix.length-1]);
// Доделать !!!

        System.out.println("!!!!!!!!!" + findIndex(maxMass,1 ));
        findIndex(maxMass,maxMass[convertToMatrix.length-1]);

        return maxMass[convertToMatrix.length-1];
    }

    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }






}
