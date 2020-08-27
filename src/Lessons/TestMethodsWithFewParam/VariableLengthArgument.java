package Lessons.TestMethodsWithFewParam;

public class VariableLengthArgument {

    public void printArgument1(int ... k) {
        System.out.println("Количество аргументов: " + k.length);

        for(int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }
}
