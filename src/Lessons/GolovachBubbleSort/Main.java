package Lessons.GolovachBubbleSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,1,4,5,6};

        for(int j = arr.length; j >= 0; j --)
        {
            for (int i = 0; i < arr.length - 1; i++)
            {
                cicleSwap(arr, i);
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void cicleSwap(int[] arr, int i) {
        if (arr[i] > arr[i +1])
        {
            swap(arr, i);
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i +1];
        arr[i +1] = temp;
    }
}
