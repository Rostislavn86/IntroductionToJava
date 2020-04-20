package Algoritmization;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class OneDimensionalArraysTask5
{
    public static void main(String[] args) {
        int[] arr = {-11,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        for(int i =0; i < arr.length; i++)
        {
            if (arr[i] > i)
            System.out.println(arr[i]);
        }

    }
}
