package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task5;

public class DecimalCounter
{
    int startCount;
    int lowerRange;
    int upperRange;

    //Default
    DecimalCounter()
    {
    int startCount = 5;
    int lowerRange = 0;
    int upperRange = 10;

    this.startCount = startCount;
    this.lowerRange = lowerRange;
    this.upperRange = upperRange;
    }

    //Random
    DecimalCounter(int startCount, int lowerRange, int upperRange)
    {
    this.startCount = startCount;
    this.lowerRange = lowerRange;
    this.upperRange = upperRange;
    }

    public int getstartCount() {
        return startCount;
    }

    public void setstartCount(int startCount) {
        this.startCount = startCount;
    }

    public int getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(int lowerRange) {
        this.lowerRange = lowerRange;
    }

    public int getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(int upperRange) {
        this.upperRange = upperRange;
    }

    @Override
    public String toString() {
        return "Текущее состояние счётчика : " +
                " Текущее значение счётчика = " + startCount +
                " нижнее значение диапазона = " + lowerRange +
                " верхнее значение диапазона = " + upperRange;
    }
}
