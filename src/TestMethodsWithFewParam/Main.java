package TestMethodsWithFewParam;

//https://vscode.ru/prog-lessons/peremennoe-chislo-argumentov-java.html

public class Main {
    public static void main(String[] args) {
        VariableLengthArgument vla = new VariableLengthArgument();

        vla.printArgument1(1);
        vla.printArgument1(10, 100, 1000);
        vla.printArgument1();
    }
}
