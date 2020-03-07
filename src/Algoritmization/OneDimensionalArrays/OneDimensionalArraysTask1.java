package Algoritmization.OneDimensionalArrays;

public class OneDimensionalArraysTask1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        int k = 11;

        int summ = 0;

        for(int i = 0; i < arr.length; i++)
        {
        if (arr[i] % k == 0) summ+= arr[i];
        }

        System.out.println("Cумма элементов которые кратны числу " + k + " равно : " + summ);
    }
}
