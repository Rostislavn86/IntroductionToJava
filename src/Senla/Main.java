package Senla;

//https://cloud.senla.eu/s/2rTmR9opqXixfDg

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        menu(entNumber(), entSighn(), entNumber());
    }

    static void menu(int nOne,String entString, int nTwo)
    {
        int numberOne;
        int numberTwo;
        String sighn;
        int rezult = 0;

        numberOne = nOne;
        sighn = entString;
        numberTwo = nTwo;

        switch (sighn)
        {
            case "+":
                rezult = (numberOne + numberTwo);
                System.out.println("Результат = " + rezult);
                break;

            case "-":
                rezult = (numberOne - numberTwo);
                System.out.println("Результат = " + rezult);
                break;

            case "*":
                rezult = (numberOne * numberTwo);
                System.out.println("Результат = " + rezult);
                break;

            case "/":
                rezult = (numberOne / numberTwo);
                System.out.println("Результат = " + rezult);
                break;

            case "%":
                rezult = (numberOne % numberTwo);
                System.out.println("Результат = " + rezult);
                break;
        }

        System.out.println("Введите число или команду или символ ");
        Scanner scannerRepeat = new Scanner(System.in);

        if (scannerRepeat.hasNextInt())
        {
            System.out.println("Вы ввели число, - программа будет загружена заново");
            menu(entNumber(), entSighn(), entNumber());
        }
        else
        {
            System.out.println("Вы ввели знак, - программа будет производить действие с предыдущем результатом, пожалуйста повторите ввод дейстивия : ");
            String provCeOff = entSighn();
            menu(rezult,provCeOff,entNumber());
        }
    }

    static String entSighn()
    {
        System.out.println("Введите интересующую операцию");
        System.out.println("+ - * / %");

        Scanner numberScanner = new Scanner(System.in);

        String sighn = numberScanner.nextLine();

        String[] arrSigns = {"+","-","*","/","%"};

        boolean b = false;

        for(int i = 0; i < arrSigns.length; i++)
        {
            if (sighn.equals(arrSigns[i]))
            {
                b = true;
                break;
            }
        }

        offAndCeCaommands(sighn);

        if (b == false)
            {
                System.out.println("Вы вели недопустимый символ, - пожалуйста повторите ввод : ");
                entSighn();
            }
        return sighn;
    }

    static int entNumber()
    {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Введите число или команду ");
        System.out.println(" 'off'  - выход из программы");
        System.out.println(" 'СЕ' - перезагрузка программы");

        String numberString = numberScanner.nextLine();

        offAndCeCaommands(numberString);

        return Integer.parseInt(numberString);
    }

    static void offAndCeCaommands(String command)
    {
        if (command.equals("off"))
        {
            System.out.println("Выход из программы");
            System.exit(0);
        }

        if (command.equals("CE"))
        {
            System.out.println("Программа загружена заново : ");
            menu(entNumber(), entSighn(), entNumber());
        }
    }
}
