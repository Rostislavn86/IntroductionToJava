package ProgrammingWithClasses.AgregationAndComposition.Task5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Methods
{
    public String chooseTr(String[] trArray)
    {
        System.out.println("Список доступного транспорта на выбор : ");

        deleteDublicate(trArray);

        for(int i = 0; i < deleteDublicate(trArray).length; i++)
        {
            if (deleteDublicate(trArray)[i] == null) continue;
            System.out.println(deleteDublicate(trArray)[i]);
        }

        System.out.println("Пожалуйста введите название трансопорта : ");

        Scanner scan = new Scanner(System.in);
        String chooseTr = scan.nextLine();

        return  chooseTr;
    }

    public String chooseFood(String[] foodArray)
    {
        System.out.println("Список доступной еды на выбор : ");

        deleteDublicate(foodArray);

        for(int i = 0; i < deleteDublicate(foodArray).length; i++)
        {
            if (deleteDublicate(foodArray)[i] == null) continue;
            System.out.println(deleteDublicate(foodArray)[i]);
        }

        System.out.println("Пожалуйста введите название еды : ");

        Scanner scan = new Scanner(System.in);
        String chooseFood = scan.nextLine();

        return chooseFood;
    }

    public String chooseDay(String[] dayArray)
    {
        System.out.println("Список дней дооступных для выбра : ");

        deleteDublicate(dayArray);

        for(int i = 0; i < deleteDublicate(dayArray).length; i++)
        {
            if (deleteDublicate(dayArray)[i] == null) continue;
            System.out.println(deleteDublicate(dayArray)[i]);
        }

        System.out.println("Пожалуйста введите количество дней : ");

        Scanner scan = new Scanner(System.in);
        String chooseDay = scan.nextLine();

        return chooseDay;
    }

    public String[] deleteDublicate(String[] str)
    {
        Set set = new HashSet();

        for(int i = 0; i < str.length; i++)
        {
            set.add(str[i]);
        }

        set.toArray(str);

        return str;
    }

    public String writeAnswer(String[] typeOfVacation,String tr,String food, String day) {

        String answer = "";

        for (int i = 0; i < typeOfVacation.length; i++)
        {
            if (typeOfVacation[i].contains(tr) && typeOfVacation[i].contains(food)
                    && typeOfVacation[i].contains(day))
            {
                System.out.println("Путёвка подходящая вам по параметрам : ");
                answer += "|" +  typeOfVacation[i] + "|"
                        + "\n";
            }
        }

        if (answer.equals("")) System.out.println("Совпадений не найдено :( ");

        return answer;
    }
}
