package Algoritmization.DekompozitsiyaAndMethodsTask;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class DekompozitsiyaAndMethodsTask6
{
    //https://ru.wikipedia.org/wiki/%D0%92%D0%B7%D0%B0%D0%B8%D0%BC%D0%BD%D0%BE_%D0%BF%D1%80%D0%BE%D1%81%D1%82%D1%8B%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%B0

    public static void main(String[] args)
    {

    int a = 50;
    int b = 25;
    int c = 50;

    if (getNod(a,b) == 1 && getNod(b,c) == 1 && (getNod(a,c)) == 1) System.out.println("Числа " + a + " " + b + " " + c + " взаимно простые");
    else System.out.println("Числа " + a + " " + b + " " + c + " не взаимно простые");

    }

    private static int getNod(int a, int b)
    {
        if (a % b == 0)
        {
            return b;
        }
        if (b % a == 0)
        {
            return a;
        }
        if (a > b) {
            return getNod(a%b,b);
        }
        return getNod(a,b%a);
    }
}
