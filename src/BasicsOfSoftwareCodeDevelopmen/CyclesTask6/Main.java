package BasicsOfSoftwareCodeDevelopmen.CyclesTask6;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Main
{
    public static void main(String[] args) {
        for (int i = 0; i < 256 ; i ++)
        {
            System.out.println(i + " - " + (char)i + " ");
        }
    }
}
