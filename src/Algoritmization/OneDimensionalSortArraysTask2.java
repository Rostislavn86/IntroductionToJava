package Algoritmization;

import java.util.Arrays;

//2. Даны две последовательности
//a1  a2  an и b1  b2  bm
//. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать

public class OneDimensionalSortArraysTask2
{
    public static void main(String[] args)
    {
        //Количество элементов последовательности перваого массива
        int n = 50;

        //Количество элементов последовательности второго массива
        int m = 50;

        for (int i = 0; i < newArray(createArrayOne(n),createArrayTwo(m)).length; i++)
            System.out.println(newArray(createArrayOne(n),createArrayTwo(m))[i]);

    }

    public static int[] newArray(int[] one, int[] two)
    {
        if (one.length > two.length)
        {
            for (int i = 0; i < one.length; i++)
            {
                if (i >= two.length) break;
                one[i] = two[i];
            }
            Arrays.sort(one);
        }

        if (one.length < two.length)
        {
            for (int i = 0; i < two.length; i++)
            {
                if (i >= one.length) break;
                two[i] = one[i];
            }
            Arrays.sort(two);
        }

        if (one.length == two.length)
        {
            for (int i = 0; i < one.length; i++)
            {
                one[i] = two[i];
            }
            Arrays.sort(one);
        }

        if (one.length >= two.length)
        return one;
        else return two;
    }

    public static int[] createArrayOne(int x)
    {

        int arr[] = new int[x];

        int count = 0;

        for (int i = 0; i < x; i++)
        {
                count++;
                arr[i] = count;
        }
        return arr;
    }

    public static int[] createArrayTwo(int x)
    {

        int arr[] = new int[x];

        int count = 10;

        for (int i = 0; i < x; i++)
        {
            count++;
            arr[i] = count;
        }
        return arr;
    }
}
