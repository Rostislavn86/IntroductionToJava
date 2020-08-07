package BasicOfOOP.Task2;

//Задача 2.  Создать класс Payment с внутренним классом,
//           с помощью объектов которого можно сформировать покупку из нескольких товаров.

//https://metanit.com/java/tutorial/3.12.php

public class Main
{
    public static void main(String[] args)
    {
    int count = 2;

    Payment payment = new Payment(count);

    System.out.println(payment.toString());
    }
}
