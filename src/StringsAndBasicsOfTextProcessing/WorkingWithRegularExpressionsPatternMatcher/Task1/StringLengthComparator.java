package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task1;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> { //Custom Comparator class according to your need

    @Override
    public int compare(String str1, String str2)
    {
        return str1.length() - str2.length();// compare length of Strings
    }
}
