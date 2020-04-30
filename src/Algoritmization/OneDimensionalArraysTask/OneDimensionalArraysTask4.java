package Algoritmization.OneDimensionalArraysTask;

import java.util.Arrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class OneDimensionalArraysTask4
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        int max = 0;
        int maxIndex = 0;

        int min = 0;
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Исходный массив " + Arrays.toString(arr));
        System.out.println("Минимальный элемент массива = " + arr[minIndex]);
        System.out.println("Максимальный элемент массива = " + arr[maxIndex]);

        int tmp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = tmp;

        System.out.println("-----------------------------------------");

        System.out.println("Массив после замены элементов");
        System.out.println("Исходный массив " + Arrays.toString(arr));
    }
}
