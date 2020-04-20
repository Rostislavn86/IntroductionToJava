package Algoritmization;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class DekompozitsiyaAndMethodsTask8 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int k = 3;
        int m = 14;

        if ((k % 2 == 0))
        {
            System.out.println("Сумма элементов по условию задачи =  " + collectMethodChet(k, m, arr));
        }
        else
        {
            System.out.println("Сумма элементов по условию задачи = " + collectMethodNeChet(k, m, arr));
        }
    }

    public static int collectMethodNeChet(int k, int m, int[] arr) {
        int summ = 0;
        for (int i = k; i < m; i++) {
            if (i % 2 != 1) continue;
            {
                int k1 = i;
                int k2 = i + 1;
                int k3 = i + 2;

                if (k2 >= arr.length) break;
                if (k3 >= arr.length) break;

                summ += arr[k1] + arr[k2] + arr[k3];
            }
        }
        return summ;
    }

    public static int collectMethodChet(int k, int m, int[] arr)
    {
        int summ = 0;
        for (int i = k; i < m; i++) {
            if (i % 2 == 1) continue;
            {
                int k1 = i;
                int k2 = i + 1;
                int k3 = i + 2;

                if (k2 >= arr.length) break;
                if (k3 >= arr.length) break;

                summ += arr[k1] + arr[k2] + arr[k3];
            }
        }
        return summ;
    }
}