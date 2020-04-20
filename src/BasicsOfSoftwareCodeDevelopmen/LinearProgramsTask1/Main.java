package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask1;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

public class Main {

    public static void main(String[] args)
    {
        double a = 2;
        double b = 4;
        double c = 6;

        double z = ((a-3)*b/2) + c;

        System.out.println("Значение функции: z = ( (a – 3 ) * b / 2) + c = " + z);
    }
}
