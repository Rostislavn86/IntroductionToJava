package Lessons.TestClasses;

public class Advice extends Thought {
    @Override
    public void message() {
        System.out.println("Внимание: Даты в календаре ближе, чем кажутся.");
        super.message();  // Вызов версии метода родительского класса
    }
}

