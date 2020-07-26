package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task7;

import java.util.Scanner;

public class Triangle
{
    double x1;
    double x2;
    double x3;

    double y1;
    double y2;
    double y3;

    Triangle()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите x1 : ");

        double x1 = scan.nextDouble();

        System.out.println("Введите y1 : ");

        double y1 = scan.nextDouble();

        System.out.println("Введите x2 : ");

        double x2 = scan.nextDouble();

        System.out.println("Введите y2 : ");

        double y2 = scan.nextDouble();

        System.out.println("Введите x1 : ");

        double x3 = scan.nextDouble();

        System.out.println("Введите x1 : ");

        double y3 = scan.nextDouble();

        if (isTriangle(x1,y1,x2,y2,x3,y3) == true)
        {
            System.out.println("Периметр тругольника равен = " + perimetr(x1,y1,x2,y2,x3,y3));
            System.out.println("Площадь тругольника равен = " + squareTriangle(x1,y1,x2,y2,x3,y3));
            medianIntersection(x1,y1,x2,y2,x3,y3);
        }
        else
        {
            System.out.println("Треугольник не существует");
        }

    }

    Triangle(double x1, double y1,double x2, double y2, double x3, double y3)
    {
        this.x1 = x1;

        this.x2 = x2;

        this.x3 = x3;

        this.y1 = y1;

        this.y2 = y2;

        this.y3 = y3;

        if (isTriangle(x1,y1,x2,y2,x3,y3) == true)
        {
            System.out.println("Периметр тругольника равен = " + perimetr(x1,y1,x2,y2,x3,y3));
            System.out.println("Площадь тругольника равен = " + squareTriangle(x1,y1,x2,y2,x3,y3));
            medianIntersection(x1,y1,x2,y2,x3,y3);
        }
        else
        {
            System.out.println("Треугольник не существует");
        }

    }

    public boolean isTriangle(double x1, double y1,double x2, double y2, double x3, double y3)
    {
        double a;
        double b;
        double c;

        double result;

        //AB = √(xb - xa)2 + (yb - ya)2
        a = Math.sqrt(Math.pow((x2 - x1),2) + (Math.pow((y2 - y1),2)));
        b = Math.sqrt(Math.pow((x3 - x2),2) + (Math.pow((y3 - y2),2)));
        c = Math.sqrt(Math.pow((x1 - x3),2) + (Math.pow((y1 - y3),2)));
        double pp = perimetr(x1,y1,x2,y2,x3,y3) / 2.0;
        //double pp = (a + b + c) / 2.0;  // полупериметр
        result =  Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

        if (result != 0) return true;
        else
        return false;
    }

    public double squareTriangle(double x1, double y1,double x2, double y2, double x3, double y3)
    {
        double a;
        double b;
        double c;

        double result;

        a = Math.sqrt(Math.pow((x2 - x1),2) + (Math.pow((y2 - y1),2)));
        b = Math.sqrt(Math.pow((x3 - x2),2) + (Math.pow((y3 - y2),2)));
        c = Math.sqrt(Math.pow((x1 - x3),2) + (Math.pow((y1 - y3),2)));
        double pp = perimetr(x1,y1,x2,y2,x3,y3) / 2.0;

        result =  Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

        return result;
    }

    public double perimetr(double x1, double y1,double x2, double y2, double x3, double y3)
    {
        double a;
        double b;
        double c;

        a = Math.sqrt(Math.pow((x2 - x1),2) + (Math.pow((y2 - y1),2)));
        b = Math.sqrt(Math.pow((x3 - x2),2) + (Math.pow((y3 - y2),2)));
        c = Math.sqrt(Math.pow((x1 - x3),2) + (Math.pow((y1 - y3),2)));
        double p = (a + b + c);

        return p;
    }

    public void medianIntersection(double x1, double y1,double x2, double y2, double x3, double y3)
    {
    double dot1;
    double dot2;

    dot1 = (x1 + x2 + x3) / 3.0;
    dot2 = (y1 + y2 + y3) / 3.0;

    System.out.println("Точка пересечения медиан " + "x : " + dot1 + " y : " + dot2);
    }

}
