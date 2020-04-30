package Algoritmization.OneDimensionalSortArraysTask;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

public class OneDimensionalSortArraysTask1
{
    public static void main(String[] args)
    {
        int k = 3;

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int[]  arr2 = {100,100,100,100,100};

        insertMethod(arr,arr2,k);
    }

    public static void insertMethod(int[] arr1, int[] arr2, int k)
    {
        int coutn = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if (coutn >= arr2.length) break;;
                if (k >= arr1.length) break;
                arr1[k] = arr2[j];
                coutn++;
                k++;
            }
        }

        for(int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);
    }
}
