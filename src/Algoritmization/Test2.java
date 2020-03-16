package Algoritmization;

import java.util.Scanner;

public class Test2

{

    public static void main(String[] args)

    {

//        Scanner con = new Scanner(System.in);
//
//        int n = con.nextInt();

        int m[][] = { { 6, 1, 8 },
                        { 7, 5, 3  },
                        { 2, 9 ,4  }
        };

      //  int m[][] = new int[n][n];







        int a = 0, b = 0;

        for(int i = 0; i < m.length; i++)

            for(int j = 0; j < m.length; j++)

            {

                if (i == j) a += m[i][j];

                if (i + j == m.length - 1) b += m[i][j];

            }



        System.out.println(a + " " + b);

       // con.close();

    }

}