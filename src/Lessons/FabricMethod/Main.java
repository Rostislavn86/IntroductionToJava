package Lessons.FabricMethod;

public class Main
{
    public static void main(String[] args)
    {
        PolygonFactory pf = new PolygonFactory();

        System.out.println(pf.createPolygon(3).getType()); //TRIANGLE
        System.out.println(pf.createPolygon(4).getType()); //SQUARE
        System.out.println(pf.createPolygon(5).getType()); //PENTAGON
    }
}
