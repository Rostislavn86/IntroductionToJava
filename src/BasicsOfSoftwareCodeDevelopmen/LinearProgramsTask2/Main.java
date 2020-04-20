package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask2;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Main
{

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;

        double z;

        z = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / 2 * a) - (Math.pow(a,3) * c + Math.pow(b, - 2));

        System.out.println("Значение выражения по формуле = " + z);

    }
}
