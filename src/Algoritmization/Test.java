package Algoritmization;

public class Test {
    public static void main(String[] args) {
                int arr[][] = { { 6, 1, 8 },
                        { 7, 5, 3  },
                        { 2, 9 ,4  }
        };

        System.out.println(summSideDiagonal(arr));
        System.out.println("chislo " + summOfArray(arr));
    }

    public static int summSideDiagonal(int[][] arr)
    {

        int summ = 0;

        for (int i = arr.length - 1; i > -1; i--)
        {
            for (int j = arr.length - 1; j > -1; j--)
            {
                if (i == j)
                    summ += arr[j][i];
            }
        }
        return summ;
    }

    public static int summOfArray(int[][] arr)
    {
        int b;

        System.out.println(arr.length);
        b = ((arr.length*(arr.length*arr.length+1)))/2;
        System.out.println(b);

        return b;
    }



}
