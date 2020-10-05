package Lessons.BoobleSortExample;


import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
     int[] intArray = {9,8,9,8,7,4,6,2,1};

     int count = 0;

        for(int i = 1; i < intArray.length; i++)
        {
            for(int j = i; (j >= 1) && (intArray[j] < intArray[j - 1]); j--)
            //ПОКА (intArray[j] меньше intArray[j-1]) И (в массиве еще есть элементы (j >= 0))
            {
                int a = intArray[j];
                intArray[j] = intArray[j-1];
                intArray[j-1] = a;
            }
        }

        System.out.println(count);
//        intArrayays.sort(intintArrayay);
//
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] bubbleSort(int[] intintArrayay)
    {


        return intintArrayay;
    }
}
