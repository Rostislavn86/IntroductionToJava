package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task6;

import java.util.Scanner;

public class Time
{
    int hour;
    int min;
    int sec;

    Time()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите часы : ");

        int timeHour = scan.nextInt();

        if ((timeHour > 24) || (timeHour <= 0)) timeHour = 0;

        this.hour = timeHour;

        System.out.println("Введите минуты : ");

        int timeMin = scan.nextInt();

        if ((timeMin > 24) || (timeMin <= 0)) timeMin = 0;

        this.min = timeMin;

        System.out.println("Введите секунды : ");

        int timeSec = scan.nextInt();

        if ((timeSec > 24) || (timeSec <= 0)) timeSec = 0;

        this.sec = timeSec;

        System.out.println("Введенное время : ");
        System.out.println(hour + ":" + min + ":" + sec);
    }

    public void changeSec() {
        System.out.println("Введите время (секунды) которое вы хотели бы изменить");

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите секунды : ");

        int sec = scan.nextInt();

        this.sec = sec + this.sec;

        if ((this.sec > 60) || (this.sec <= 0)) this.sec = 0;

    }

    public void changeMin()
    {
        System.out.println("Введите время (минуты) которое вы хотели бы изменить");

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите минуты : ");

        int min = scan.nextInt();

        this.min = min + this.min;

        if ((this.min > 60) || (this.min <= 0)) this.min = 0;

    }

    public void changeHour()
    {
        System.out.println("Введите время (часы) которое вы хотели бы изменить");

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите часы : ");

        int hour = scan.nextInt();

        this.hour = hour + this.hour;

        if ((this.hour > 24) || (this.hour <= 0)) this.hour = 0;

    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
