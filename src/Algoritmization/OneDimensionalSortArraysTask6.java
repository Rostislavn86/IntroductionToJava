package Algoritmization;

public class OneDimensionalSortArraysTask6
{
    public static void main(String[] args)
    {
        int[] array = {10, 2, 10, 3, -1, 2, 5};

        algorithmShellSort(array);

        for(int i = 0; i < array.length; i ++)
            System.out.println(array[i]);

    }

    public static void algorithmShellSort(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                int k = i;
                int z = i + 1;

                if (z >= 7) z = 0;

                if (arr[i] > arr[z]) {
                    while (k > 0 && arr[k - 1] > arr[k]) {
                        int tmp = arr[k - 1];
                        arr[k - 1] = arr[k];
                        arr[k] = tmp;
                        k -= 1;
                    }
                } else if (arr[i] <= arr[z]) k++;
            }

    }
}
