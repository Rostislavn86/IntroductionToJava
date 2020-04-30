package Algoritmization.OneDimensionalArraysTask;

// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class OneDimensionalArraysTask2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,99,77,66,66,77,345,44,23,65};

        int z = 5;

        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
        if (arr[i] > z)
        {
            arr[i] = z;
            count++;
        }
        }

        System.out.println("Изменённый массив :");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("номер ячейки : " + i + " значение " + arr[i]);
        }

        System.out.println("Количесмтво замен равно : " + count);

    }
}
