package GolovachLekcia1;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
    int[] arr = {1,2,5,6,8,0,4,5,7,5};

    for(int i = 0; i < arr.length - 1; i ++)
    {
        int temp = arr[i];
      //  if (i + 1 == arr.length) break;
        int temp2 = arr[i + 1];

        arr[i + 1] = temp;
        arr[i] = temp2;
    }
        System.out.println(Arrays.toString(arr));

    }
}
