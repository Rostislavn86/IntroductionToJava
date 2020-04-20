package Algoritmization;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class OneDimensionalArraysTask9 {
    public static void main(String[] args) {

        int[] arr = {1,3,4,6,6,8,-8,8,99,77,66,66,0,345,44,-298};

        int[] arrCopy = new int[arr.length];

        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrCopy.length; j++) {
                if (arr[i] == arr[j]) count[i] += 1;
            }
        }

        int countpovt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count[i] > 1) countpovt += 1;
        }

        int[] massPovtZnach = new int[countpovt];

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count[i] > 1) {
                massPovtZnach[k] = arr[i];
                k++;
                if (k > massPovtZnach.length) break;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(massPovtZnach);

        int countfinal = 1;

        for (int i = 0; i < arr.length; i++) {
            countfinal = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j]) countfinal++;

                if (countfinal == findMax(count))
                {
                    System.out.println("Наимньшее число повторяющееся наибольшее число раз = " + arr[i]);
                    break;
                }
            }
            if (countfinal == findMax(count)) break;
        }
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    }













