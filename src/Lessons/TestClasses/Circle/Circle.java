package Lessons.TestClasses.Circle;

public class Circle
{
    // класс, реализующий окружность на координатной плоскости
    private int x, y; // координаты центра окружности
    private int r; // радиус окружности

    // перегруженные конструкторы
    // конструктор без параметров
    public Circle()
    {
        x = y = 0;
        r = 1;
    }

    // конструктор с 1 параметром
    private Circle(int r)
    {
        this.r = r;
    }

    // конструктор с 2 параметрами
    public Circle(int x, int y)
    {
        this.x = x;
        this.y = y;
        r = 1;
    }

    // конструктор с 3 параметрами
    Circle(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // методы доступа
    // возвращает объект Circle
    Circle GetCircle()
    {
        // создать новый объект типа Circle, обязательно выделить память для него
        Circle c = new Circle(x, y, r);
        return c;    // возвратить объект
    }

    // возвратить координаты и радиус
    int GetX() { return x; }
    int GetY() { return y; }
    int GetR() { return r; }

    // установить новые значения x, y, r
    void SetXYR(int nx, int ny, int nr)
    {
        x = nx;
        y = ny;
        r = nr;
    }

    // метод, который вычисляет площадь окружности
    double GetSquare()
    {
        return (double)(3.1415*r*4);
    }

}
