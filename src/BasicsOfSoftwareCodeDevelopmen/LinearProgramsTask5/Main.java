package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask5;

//proverka
//https://www.convert-me.com/ru/convert/time/dhms.html?u=dhms&v=02%3A21%3A40

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
        System.out.println(hour + " " + min + " " + sec);
    }
}
