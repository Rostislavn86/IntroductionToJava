package BasicsOfSoftwareCodeDevelopmen.CyclesTask1;

import java.util.Scanner;

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
                System.out.println("Вы введи отрицательное число, программа будет закрыта");
                System.out.println("Cумма введённых вами положительных чисел равна = " + summ);
                break;
            }

            summ += cifra;
        }

    }
}
