package BasicOfOOP.Task1;

//Задача 1.  Создать объект класса Текстовый файл, используя классы Файл, Директория.
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

//https://metanit.com/java/tutorial/6.11.php

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        menu();
    }

    private static void menu() throws IOException
    {
        TextFile fileConstract = new TextFile();

        File file2 = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

        System.out.println("Для того что бы выбрать один из пукнктов меню введите его : ");
        System.out.println("1) Создать файл");
        System.out.println("2) Переименовать файл");

        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

       switch (ch)
       {
           case "1" :
           {
               file2.createNewFile();
               break;
           }
           case "2" :
           {
               fileConstract.setFileName("ReNameFile.txt");
               File fileNew = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               file2.renameTo(fileNew);
               break;
           }
           case "3" :
           {
               file2 = new File(fileConstract.getDiretoryNameDefault(), fileConstract.getFileName());
               Scanner input = new Scanner(file2);

               while (input.hasNextLine())
               {
                   System.out.println(input.nextLine());
               }
               break;
           }
           default:
               System.out.println("Введено не допустимое значение - приложение будет закрыто");
       }
    }
}
