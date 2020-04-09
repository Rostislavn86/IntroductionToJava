package Algoritmization;

public class OneDimensionalSortArraysTask5
{
    public static void main(String[] args)
    {

        int[] array = {10, 2, 10, 3, -1, 2, 5};

        insertSort(array);

        for(int i = 0; i < array.length; i ++)
        System.out.println(array[i]);

    }

    public static void insertSort(int[] arr)
    {
    for(int i = 1; i < arr.length; i ++)
    {
    int k = i;
    while (k > 0  && arr[k-1] > arr[k])
    {
        int tmp = arr[k-1];
        arr[k-1] = arr[k];
        arr[k] = tmp;
        k -= 1;
    }
    }
    }

}
