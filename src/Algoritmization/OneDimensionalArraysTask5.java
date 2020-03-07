package Algoritmization;

public class OneDimensionalArraysTask5
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        for(int i =0; i < arr.length; i++)
        {
            if (arr[i] > i)
            System.out.println(arr[i]);
        }

    }
}
