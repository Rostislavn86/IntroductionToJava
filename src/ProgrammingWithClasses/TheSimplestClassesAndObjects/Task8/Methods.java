package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Methods
{
    Customer[] customer = new Customer[5];

    public void sortBySurname()
    {
        System.out.println("Отсортированные список покупателей по Фамилиям : ");

        String[] castumerSurnameArray = new String[customer.length];

        for(int i = 0; i < castumerSurnameArray.length; i++)
        {
            castumerSurnameArray[i] = customer[i].getSurname();
        }

        Arrays.sort(castumerSurnameArray);

        for(int i = 0; i < castumerSurnameArray.length; i++)
        {
            for(int j = 0; j < customer.length; j++)
            {
                if (castumerSurnameArray[i].equals(customer[j].getSurname()))
                    System.out.println(customer[j].toString());
            }
        }
    }

    public void listOfBuersInTheRange()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("введите начальное значение диапазона : ");

        int startRange = scan.nextInt();

        System.out.println("введите конечное значение диапазона : ");

        int finishRange = scan.nextInt();

        for(int i = 0; i < customer.length; i++)
        {
            if ((Long.parseLong(customer[i].numberOfCreditCard) <= finishRange)
                    && (Long.parseLong(customer[i].numberOfCreditCard) >= startRange))
                System.out.println(customer[i].toString());
        }

    }
}
