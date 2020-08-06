package BasicOfOOP.Task1;

//Задача 1.  Создать объект класса Текстовый файл, используя классы Файл, Директория.
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

//https://metanit.com/java/tutorial/6.11.php
//https://devcolibri.com/java-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0%D0%BC%D0%B8/#j1
//https://ru.stackoverflow.com/questions/463771/%D0%9A%D0%B0%D0%BA-%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%B8%D1%82%D1%8C-%D1%82%D0%B5%D0%BA%D1%81%D1%82-%D0%B2-%D0%BA%D0%BE%D0%BD%D0%B5%D1%86-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0-%D0%B2-java

import java.io.*;
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

        System.out.println("Для того что бы выбрать один из пукнктов меню введите его : ");
        System.out.println("1) Создать файл");
        System.out.println("2) Переименовать файл");
        System.out.println("3) Показать содержание файла ");
        System.out.println("4) Дополнить содержание файла ");
        System.out.println("5) Удалить файл ");

        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

       switch (ch)
       {
           case "1" :
           {
               System.out.println("Введите название файла : ");

               String fileName = sc.nextLine();

               fileConstract.setFileName(fileName);

               File fileMy = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               fileMy.createNewFile();

               PrintWriter out = new PrintWriter(fileMy.getAbsoluteFile());

               try {
                   //Записываем текст у файл
                   out.print("Default text");
               } finally {
                   //После чего мы должны закрыть файл
                   //Иначе файл не запишется
                   out.close();
               }
               break;
           }

           case "2" :
           {
               System.out.println("Введите название файла : ");

               String fileName = sc.nextLine();

               fileConstract.setFileName(fileName);

               fileConstract.setFileName(fileName);

               File fileMy = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               fileConstract.setFileName("ReNameFile");

               File fileNew = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               fileMy.renameTo(fileNew);
               fileMy.delete();
               break;
           }

           case "3" :
           {
               System.out.println("Введите название файла : ");

               String fileName = sc.nextLine();

               fileConstract.setFileName(fileName);

               File fileMy = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               fileMy = new File(fileConstract.getDiretoryNameDefault(), fileConstract.getFileName());
               Scanner input = new Scanner(fileMy);

               while (input.hasNextLine())
               {
                   System.out.println(input.nextLine());
               }
               break;
           }

           case "4" :
               {
               System.out.println("Введите название файла : ");

               String fileName = sc.nextLine();
               fileConstract.setFileName(fileName);

               File fileMy = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               System.out.println("Пожалуйста введите текст который в хотели бы добавить в файл : ");
               String text = sc.nextLine();

               FileWriter writer = new FileWriter(fileMy, true);
               BufferedWriter bufferWriter = new BufferedWriter(writer);
               bufferWriter.write("\n" + text);
               bufferWriter.close();
               break;
               }

           case "5" :
           {
               System.out.println("Введите название файла : ");

               String fileName = sc.nextLine();
               fileConstract.setFileName(fileName);

               File fileMy = new File(fileConstract.getDiretoryNameDefault(),fileConstract.getFileName());

               System.out.println(fileMy.getName());
               fileMy.delete();
               break;
           }

           default:
           {
               System.out.println("Введено не допустимое значение - приложение будет закрыто");
           }
       }
    }

    }
