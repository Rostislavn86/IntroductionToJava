package Lessons.MaxMin;

public class Main
{
    public static void main(String[] args)
    {
    int[] arr = {1,2,3,44,6,8};

    int max = 0;

    for(int x = 0; x < arr.length; x++)
    {
        if (arr[x] > max) max = arr[x];
    }

        System.out.println(max);

    }
}
