package BasicOfOOP.Task2;

//Задача 2.  Создать класс Payment с внутренним классом,
//           с помощью объектов которого можно сформировать покупку из нескольких товаров.

//https://metanit.com/java/tutorial/3.12.php

public class Main
{
    public static void main(String[] args)
    {
    int count = 5;

    Payment payment = new Payment(count);

        System.out.println(payment.toString());

//    Payment payment1 = new Payment("Бензопила MS180",520);
//    Payment payment2 = new Payment("Бензопила MS210",820);
//    Payment payment3 = new Payment("Триммер FS55",580);
//
//    System.out.println(payment1.toString());
//    System.out.println(payment2.toString());
//    System.out.println(payment3.toString());

    }
}
