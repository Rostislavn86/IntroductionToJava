package ProgrammingWithClasses.Task3;

public class Students {
    private String nameOfTheStudent;
    private int namberOfTheGroup;
    private int[] marks = new int[5];

    public Students(String name, int numG, int[] marks)
    {
        this.nameOfTheStudent = name;
        this.namberOfTheGroup = numG;
        if ( marks.length != 5 ) System.out.println("Введите правильное количество оценок");
        this.marks = marks;
    }

    String getName()
    {
        return nameOfTheStudent;
    }

    int getNamberOfTheGroup()
    {
        return namberOfTheGroup;
    }

    boolean onlyNineAndTen()
    {
        int[] marks = this.marks;

        boolean flag = true;

        for(int i = 0; i < marks.length; i++)
        {
            if (marks[i] < 9) flag = false;
        }

        return flag;
    }

}
