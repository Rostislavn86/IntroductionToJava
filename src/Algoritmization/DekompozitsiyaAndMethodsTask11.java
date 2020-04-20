package Algoritmization;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class DekompozitsiyaAndMethodsTask11
{
    public static void main(String[] args)
    {
        int x = 587111;
        int y = 8743211;

        int rezX = findNumberOfCharacters(x);
        int rezY = findNumberOfCharacters(y);

        System.out.println("Искомые числа " + "x = " + x + " y = " + y);

        if (rezX > rezY) System.out.println("В числе X больше цифр");
        if (rezX < rezY) System.out.println("В числе Y больше цифр");
        if (rezX == rezY) System.out.println("Количество цифр в обоих числах равно");
    }

    public static int findNumberOfCharacters(int x)
    {
        int rez = 0;
        int decriment = 1;
        for(;;)
        {
            if (x/decriment == 0) break;
            rez += 1;
            decriment *= 10;
        }
        return rez;
    }
}