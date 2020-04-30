package Algoritmization.TwoDimensionalArraysTask;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class TwoDimensionalArraysTask8
{
    public static void main(String[] args)
    {

        int stroki = 10;
        int stolbtsi = 10;

        int arr[][] = createArray(stroki,stolbtsi);

        System.out.println("Искомая матрица :");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        ChangeArray(arr);

        System.out.println("Матрица в которой стоблбца изменены (поменяны местами) : ");

        for (int i = 0; i < stroki; i++)
        {
            for (int j = 0; j < stolbtsi; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int x, int y)
    {
        int a = 0;
        int b = 10;

        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                arr[i][j] = a + (int) (Math.random() * b);
            }
        }
        return arr;
    }

    public static void ChangeArray(int[][] arr)
    {
        int arrayChanged[][] = arr;

        System.out.println("Введите номер столбца который вы хотели бы изменить : ");

        Scanner sc = new Scanner(System.in);

        int stolbetsIn = sc.nextInt();

        System.out.println("Введите номер столбца на который вы хотели бы изменить : ");

        int stolbetsOut = sc.nextInt();

        if (((stolbetsIn < 0) || (stolbetsIn > arr.length - 1)) || ((stolbetsOut < 0) || (stolbetsOut > arr.length - 1)))
        {
            System.out.println("Вы ввели число столбца за границей значений массива, пожалуйста повторите ввод ");
            ChangeArray(arr);
        }

        if (stolbetsIn == stolbetsOut)
        {
            System.out.println("Номера столбца для замены и заменяющего столбца совпадают, пожалуйста повторите ввод ");
            ChangeArray(arr);
        }

        int arrayStrokaIn[] = new int[arr.length];
        int arrayStrokaOut[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
            arrayStrokaIn[i] = arr[i][stolbetsIn];
            arrayStrokaOut[i] = arr[i][stolbetsOut];
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][stolbetsIn] = arrayStrokaOut[i];
                arr[i][stolbetsOut] = arrayStrokaIn[i];
            }
        }
    }
}
