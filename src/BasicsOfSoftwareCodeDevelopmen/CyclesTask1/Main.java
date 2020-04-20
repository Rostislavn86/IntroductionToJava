package BasicsOfSoftwareCodeDevelopmen.CyclesTask1;

import java.util.Scanner;

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Main
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int summ = 0;
        int cifra;

        System.out.println("Введите положительные числа, для выхода из цикла введите отрицательное число");

        for(;;)
        {
            cifra = c.nextInt();

            if (cifra < 0)
            {
                System.out.println("Вы ввели отрицательное число, программа будет закрыта");
                System.out.println("Cумма введённых вами положительных чисел равна = " + summ);
                break;
            }

            summ += cifra;
        }

    }
}
