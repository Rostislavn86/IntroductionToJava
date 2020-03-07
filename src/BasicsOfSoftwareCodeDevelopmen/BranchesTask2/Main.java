package BasicsOfSoftwareCodeDevelopmen.BranchesTask2;

public class Main
{
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 8;
        int d = 43;

        System.out.println(findmax(findmin(a,b),findmin(c,d)));
            }

    public static int findmin(int a, int b)
    {
        if (a == b) return a;
        if (a>b) return b;
        else return a;
    }

    public static int findmax(int a, int b)
    {
        if (a == b) return a;
        if (a>b) return a;
        else return b;
    }

}
