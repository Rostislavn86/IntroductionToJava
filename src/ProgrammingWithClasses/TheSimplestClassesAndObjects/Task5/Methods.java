package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task5;

import java.util.Scanner;

//https://javarush.ru/groups/posts/1256-generacija-sluchaynogo-chisla-v-zadannom-diapazone

public class Methods
{
    DecimalCounter decimalCounterfinal = new DecimalCounter();

    public void createDefaultCounter()
    {
        DecimalCounter decimalCounter = new DecimalCounter();
        decimalCounterfinal = decimalCounter;
        System.out.println(decimalCounter.toString());
    }

    public void createRandomCounter()
    {
        int lowerRange = rndMin(-10);
        int upperRange = rndMax(10);
        int startCount = rndCount(lowerRange,upperRange);

        DecimalCounter decimalCounterRand = new DecimalCounter(startCount,lowerRange,upperRange);
        decimalCounterfinal = decimalCounterRand;
        System.out.println(decimalCounterRand.toString());
    }

    public void plusOneMinusOne()
    {
        System.out.println("Для увиличения счётчика введите '+'");
        System.out.println("Для уменьшения счётчика введите '-'");
        Scanner bukva = new Scanner(System.in);
        String ch = bukva.nextLine();

        int count = 0;

        if (ch.equals("+"))
        {
            count = decimalCounterfinal.getstartCount();
            count += 1;
            if ((count <= decimalCounterfinal.getUpperRange()))
            {
                decimalCounterfinal.setstartCount(count);
                System.out.println(decimalCounterfinal.toString());
                plusOneMinusOne();
            }
            else
            {
                System.out.println("Вы вышли за диапазон значений (либо ввели не допустимый символ), программа будет закрыта");
                System.out.println(decimalCounterfinal.toString());
            }
        }

        if (ch.equals("-"))
        {
            count = decimalCounterfinal.getstartCount();
            count -= 1;
            if ((count >= decimalCounterfinal.getLowerRange()))
            {
                decimalCounterfinal.setstartCount(count);
                System.out.println(decimalCounterfinal.toString());
                minusOne();
            }
            else
            {
                System.out.println("Вы вышли за диапазон значений (либо ввели не допустимый символ), программа будет закрыта");
                System.out.println(decimalCounterfinal.toString());
            }
        }

    }

    public void minusOne()
    {
        System.out.println("Для увиличения счётчика введите '+'");
        System.out.println("Для уменьшения счётчика введите '-'");
        Scanner bukva = new Scanner(System.in);
        String ch = bukva.nextLine();

        int count = 0;

        if (ch.equals("-"))
        {
            count = decimalCounterfinal.getstartCount();
            count -= 1;
            if ((count >= decimalCounterfinal.getLowerRange()))
            {
                decimalCounterfinal.setstartCount(count);
                System.out.println(decimalCounterfinal.toString());
                minusOne();
            }
            else
            {
                System.out.println("Вы вышли за диапазон значений (либо ввели не допустимый символ), программа будет закрыта");
                System.out.println(decimalCounterfinal.toString());
            }
        }

        if (ch.equals("+"))
        {
            count = decimalCounterfinal.getstartCount();
            count += 1;
            if ((count <= decimalCounterfinal.getUpperRange()))
            {
                decimalCounterfinal.setstartCount(count);
                System.out.println(decimalCounterfinal.toString());
                plusOneMinusOne();
            }
            else
            {
                System.out.println("Вы вышли за диапазон значений (либо ввели не допустимый символ), программа будет закрыта");
                System.out.println(decimalCounterfinal.toString());
            }
        }
    }

    public static int rndMin(int min)
    {
        return (int) (Math.random() * ++ min);
    }

    public static int rndMax(int max)
    {
        return (int) (Math.random() * ++ max);
    }

    public static int rndCount(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max ) + min;
    }
}
