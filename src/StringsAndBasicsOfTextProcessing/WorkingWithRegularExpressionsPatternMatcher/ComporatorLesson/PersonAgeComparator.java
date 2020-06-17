package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.ComporatorLesson;

import java.util.Comparator;

class PersonAgeComparator implements Comparator<Person2>
{

    public int compare(Person2 a, Person2 b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
