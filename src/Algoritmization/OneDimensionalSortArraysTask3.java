package Algoritmization;

public class OneDimensionalSortArraysTask3
{
    public static void main(String[] args)
    {
        int[] array = {10, 2, 10, 3, -1, 2, 5};

        sort(array);

        for (int i = 0; i < array.length; i++  )
            System.out.println(array[i]);
    }

    public static void sort (int[] numbers){
        int min, temp;

        for (int index = 0; index < numbers.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < numbers.length; scan++)
            {
                if (numbers[scan] > numbers[min])
                    min = scan;
            }

            // Меняем элементы местами
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }

}
