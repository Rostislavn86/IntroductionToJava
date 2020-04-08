package Algoritmization;

public class OneDimensionalSortArraysTask4
{
    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, -1, 2, 5};

        System.out.println("Не отсортированный массив");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        int count;

        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }

        } while (count > 0);

        System.out.println("Отсортированный массив");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }


}
