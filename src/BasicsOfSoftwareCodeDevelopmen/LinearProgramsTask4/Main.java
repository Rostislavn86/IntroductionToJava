package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask4;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Main
{
    public static void main(String[] args)
    {
        double r = 123.456;

        System.out.println("Начальное число R = " + r);
        System.out.printf("Изменённое число по условию задачи = " + "%.3f" ,reversMethod(r));
    }

    public static double reversMethod(double x)
    {
        double drobnChast;

        drobnChast = x;

        drobnChast = drobnChast % 100;

        drobnChast = drobnChast % 10;

        drobnChast = drobnChast % 1;

        drobnChast = drobnChast * 1000;

        return drobnChast + x/1000;
    }
}
