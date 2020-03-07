package BasicsOfSoftwareCodeDevelopmen.LinearProgramsTask3;

public class Main {
    public static void main(String[] args) {
        double x = 45;
        double y = 90;

        double z;

        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);

        System.out.println(z);
    }
}
