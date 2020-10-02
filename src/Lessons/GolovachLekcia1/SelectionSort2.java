package GolovachLekcia1;

//https://habr.com/ru/post/422085/

import java.util.Arrays;

public class SelectionSort2
{
    public static void main(String[] args)
    {

        int[] arr = {1,2,6,8,6,4,3,0,4,2,1};

        int max = 0;
        int index = 0;

        for(int j = arr.length - 1; j > 0; j--)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                    index = i;
                }
            }
            swap(arr,j,max);
        }



        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr,int last, int max) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
}
