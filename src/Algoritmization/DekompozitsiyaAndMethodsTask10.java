package Algoritmization;

import java.util.Arrays;

public class DekompozitsiyaAndMethodsTask10
{
    public static void main(String[] args)
    {
        int x = 12345678;

        createArray(findNumberOfCharacters(x),x);

    }

    public static int findNumberOfCharacters(int x)
    {
        int rez = 0;
        int decriment = 1;
        for(int i = 0;;i++ )
        {

            if (x/decriment == 0) break;
            rez += 1;
            decriment *= 10;
        }
        // System.out.println(rez);
        return rez;
    }

    public static int[] createArray(int decriment, int x)
    {
        //System.out.println("Декримент " + decriment);

        int[] arr = new int[decriment];

        int decriment2 = decriment;

        int sighnOfArrays = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sighnOfArrays = (x % ((int)Math.pow(10,i + 1)));
            arr[i] = sighnOfArrays;
        }

//        for(int i = 0; i < arr.length; i++)
//        {
//            arr[i] = arr[i]/(int)Math.pow(10,i);
//            System.out.print("arr[" + i + "]" + " = " + arr[i] + " ");
//        }

        //  System.out.println();

        for(int i = arr.length - 1 ; i >= 0; i--)
        {
            arr[i] = arr[i]/(int)Math.pow(10,i);
            System.out.print("arr[" + i + "]" + " = " + arr[i] + " ");
        }
        return arr;
    }

}