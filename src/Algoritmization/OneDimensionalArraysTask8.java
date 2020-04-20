package Algoritmization;

// Задача 8. Одномерные массивы.

public class OneDimensionalArraysTask8
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,5,6,7,-8,9,99,77,66,66,0,345,44,-298};

        int min = 0;

        for(int i = 0; i < arr.length ; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }

        int[] arrNew = new int[arr.length-1];

        for(int i = 0; i < arrNew.length ; i++)
        {
            if (arr[i] == min) continue;
            else arrNew[i] = arr[i];
            System.out.println(arrNew[i]);
        }
    }
}
