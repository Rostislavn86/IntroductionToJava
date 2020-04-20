package BasicsOfSoftwareCodeDevelopmen.CyclesTask5;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:

public class Main
{
    public static void main(String[] args) {
        double e = 18;
        double summ = 0;

        for(;;)
        {
            int count = 1;
            summ  += Math.abs((1/Math.pow(2,count) + 1/Math.pow(3,count)));
            if (summ <= e )
            {
                 count++;
            }
            else
            {
                System.out.println("Сумма члено ряда модуль которых равен числу "+ e + " сумма = "+summ);
                break;
            }
        }
    }
}
