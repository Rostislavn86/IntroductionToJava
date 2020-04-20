package Algoritmization;

public class DekompozitsiyaAndMethodsTask11
{
    public static void main(String[] args)
    {
        int x = 587111;
        int y = 87432;

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
        for(int i = 0;;i++ )
        {

            if (x/decriment == 0) break;
            rez += 1;
            decriment *= 10;
        }
        return rez;
    }
}