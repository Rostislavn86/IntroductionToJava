package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask5;

//proverka
//https://www.convert-me.com/ru/convert/time/dhms.html?u=dhms&v=02%3A21%3A40

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Main
{
    public static void main(String[] args)
    {
        int t = 8500;
        methodCovertation(t);
    }

    public static void methodCovertation(int x)
    {
        int hour = x / 3600;
        int min = (x/60 - hour*60);
        int sec = x - hour*3600 - min*60;
        System.out.println(hour + " ч " + min + " мин " + sec + " сек ");
    }
}
