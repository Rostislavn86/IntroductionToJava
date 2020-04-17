package Algoritmization;

public class DekompozitsiyaAndMethodsTask5
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        int[] tempArray;

        tempArray = arr;

        for (int i = 0; i < tempArray.length; i++)
        {
            if (tempArray[i] == findMax(arr)) tempArray[i] = findMin(arr);
        }

        if (provUsl(tempArray,findMax(tempArray)) == true)
        System.out.println("Число запрашиваемое вами по условию задачи = " + findMax(tempArray));
        else System.out.println("Чисел, которох меньше максимального элемента массива, но больше всех других элементов "
        + "в данном массиве несколько, и это число = " + findMax(tempArray));
    }

    public static boolean provUsl(int[] arr, int max)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == max) count++;
        }

        if (count > 1) return false;
        else
        return true;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
