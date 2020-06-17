package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.ComporatorLesson;

public class Person implements Comparable<Person>
{
    private String name;
    Person(String name, int i)
    {
        this.name=name;
    }
    String getName()
    {return name;}

    public int compareTo(Person p){

        return name.compareTo(p.getName());
    }
}
