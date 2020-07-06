package ProgrammingWithClasses.Task3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
// равные только 9 или 10.

public class Main
{

    public static void main(String[] args)
    {
        Students[] student = new Students[10];
        {
            student[0] = new Students("Иванов С.И", 123456, new int[]{10, 9, 9, 9, 9});
            student[1] = new Students("Сидоров А.Г", 34567, new int[]{10, 9, 9, 9, 9});
            student[2] = new Students("Иванькина Я.К", 123456, new int[]{4, 4, 5, 4, 5});
            student[3] = new Students("Скарбец Н.И", 123456, new int[]{4, 3, 4, 4, 5});
            student[4] = new Students("Коновалов Г.А", 34567, new int[]{4, 3, 5, 4, 5});
            student[5] = new Students("Гагарин Н.А", 34567, new int[]{9, 9, 10, 9, 10});
            student[6] = new Students("Свиридов С.У", 34567, new int[]{4, 4, 4, 4, 3});
            student[7] = new Students("Логунов В.В", 34567, new int[]{4, 5, 3, 4, 5});
            student[8] = new Students("Пушкин Р.Ф", 34567, new int[]{4, 3, 4, 4, 5});
            student[9] = new Students("Купальский М.У", 34567, new int[]{10, 9, 9, 9, 9});
        }

        for(int i = 0; i < student.length; i ++)
        {
            if (student[i].onlyNineAndTen()) System.out.println(student[i].getName()
                    + " номер группы " +student[i].getNamberOfTheGroup());
        }

    }

}
