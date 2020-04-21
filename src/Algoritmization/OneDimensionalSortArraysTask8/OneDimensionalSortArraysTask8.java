package Algoritmization.OneDimensionalSortArraysTask8;

//Задача 8. Раздел алгоритмизация, раздел сортировки.

//https://calc.by/math-calculators/nod-nok.html
//https://ru.onlinemschool.com/math/assistance/fraction/lcd/

import java.util.Arrays;

public class OneDimensionalSortArraysTask8
{
    public static void main(String[] args)
    {
        Algoritmization.OneDimensionalSortArraysTask8.Fraction fraction = new Algoritmization.OneDimensionalSortArraysTask8.Fraction();

        //Количество дробей
        int аmountОfNumbers = 4;

        int arrNum[] = new int[аmountОfNumbers];
        int arrDen[] = new int[аmountОfNumbers];

        int a = 1;
        int b = 9;

        System.out.println("Случайно сформированные дроби : ");
        for(int i = 0; i < arrNum.length; i++)
        {
            arrNum[i] = (a + (int) (Math.random() * b));
            arrDen[i] = (a + (int) (Math.random() * b));
            System.out.println(arrNum[i] + "/" + arrDen[i]);
        }

        // Находим НОК Деноминатора
        int[] nok = new int[аmountОfNumbers];

        for(int i = 0; i < arrDen.length; i++)
        {
            for(int j = 0; j < arrDen.length; j++)
            {
                if (i == j) continue;
                nok[i] = fraction.getNok(arrDen[i],arrDen[j]);
            }
        }

        for(int i = 0; i < nok.length; i++)
        {
            for(int j = 0; j < nok.length; j++)
            {
                if (i == j) continue;
                nok[i] = fraction.getNok(nok[i],nok[j]);
            }
        }

        System.out.println("=========================================");
        System.out.println("Наименьшее общее кратное равно = " + nok[0]);
        System.out.println("=========================================");
        System.out.println("Дроби приведённые к общему знаменателю и упорядочинные в порядке возрастания : ");
        copleteTask(arrNum,arrDen,findDopMnog(arrNum,arrDen,nok[0]));

    }

    public static void copleteTask(int[] num, int[] den, int[] findDopMnog)
    {
        int[] completeArray = new int[num.length];

        for(int i = 0; i < num.length; i++)
        {
            completeArray[i] = num[i] * findDopMnog[i];
        }

        Arrays.sort(completeArray);

        for(int i = 0; i < num.length; i++)
        {
            System.out.println(completeArray[i] + "/" +((den[i])*findDopMnog[i]));
        }
    }

    //Находим дополнительный множитель
    public static int[] findDopMnog(int[] num, int[] den, int nok)
    {
        int[] dopMnog = new int[num.length];

        for(int i = 0; i < dopMnog.length; i++)
        {
            dopMnog[i] = nok/den[i];
        }
        return dopMnog;
    }
}
