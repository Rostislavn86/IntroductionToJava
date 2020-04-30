package Algoritmization.OneDimensionalArraysTask;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class OneDimensionalArraysTask6
{
    public static void main(String[] args)
    {
        double[] arr = {1,2.34,3,4,5,6,7,-8,9,99,77,66,66,0,345,44,-298,3.14};

        int summ = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if (isprime(arr[i]) == true)
                summ+=arr[i];
        }

        System.out.println("Cумма чисел = " + summ);

    }

    //https://habr.com/ru/post/133037/
    public static boolean isprime(double n){
        if(n==1) // 1 - не простое число
            return false;
        // перебираем возможные делители от 2 до sqrt(n)
        for(int d=2; d*d<=n; d++){
            // если разделилось нацело, то составное
            if(n%d==0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }

}
