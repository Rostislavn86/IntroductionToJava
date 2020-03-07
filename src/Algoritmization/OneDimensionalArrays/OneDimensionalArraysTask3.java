package Algoritmization.OneDimensionalArrays;

import java.util.Random;

public class OneDimensionalArraysTask3 {
    public static void main(String[] args) {

        int min = 10;
        int max = 2000;
        int razmer = max - min;
        Random random = new Random();
        int n = random.nextInt(razmer + 1);

        Random generator = new Random();

        int[] arr = new int[n];

        int countPlus = 0;
        int countZero = 0;
        int countMinus = 0;

        for(int i = 0; i < arr.length; i++)
        {
        arr[i] = 100 - generator.nextInt(201);

        if (arr[i] > 0) countPlus += 1;
        if (arr[i] == 0) countZero += 1;
        if (arr[i] < 0) countMinus += 1;
        }

        System.out.println("Размерность массива равна = " + n);
        System.out.println("Количество положительных элементов в данном массиве = " + countPlus);
        System.out.println("Количество элементов равных нулю = " + countZero);
        System.out.println("Количество отрицательных элементов в данном массиве = " + countMinus);
    }
}
