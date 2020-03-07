package Algoritmization;

public class OneDimensionalArraysTask7 {
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,5,6,7,-8,9,99,77,66,66,0,345,44,-298};

        int[] summ = new int[arr.length];

        int max = 0;

        for(int i = 0; i < arr.length ; i++)
        {
            if ((i + 1) % 2 != 0)
            {
                summ[i] = arr[i] + arr[i+1];
            }
            else
            {
                summ[i] = arr[i] + arr[i-1];
            }

        }

        for(int i = 0; i < arr.length; i++)
        {
            if (summ[i] > max)
                max = summ[i];
        }

        System.out.println(max);


    }

    }
