package Algoritmization;

import java.util.Scanner;

public class Test2

{

    public static void main(String[] args)

    {

//        Scanner con = new Scanner(System.in);
//
//        int n = con.nextInt();

        int m[] = {1,2,3,4,5,6,7,8};

        System.out.println(checkVosvrAndcheckVozvrByOne(m));

    }

    public static boolean checkVosvrAndcheckVozvrByOne(int[] arr)
    {
        boolean b = false;

        for(int i = 0; i < arr.length;)
        {
            if (i + 1 == arr.length) break;

            if ((arr[i] < arr[i + 1]) && (arr[i+1] - arr[i] == 1))
            {
                i++;
                b = true;
            }
            else
            {
                b = false;
                break;
            }
        }
        return b;
    }


}