package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task1;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
// отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

//Read more: https://javarevisited.blogspot.com/2015/09/how-to-read-file-into-string-in-java-7.html#ixzz6OxQnNVns
//https://www.javatpoint.com/java-pattern-split-method

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task1\\text.txt")));

        // Сортировка Абзацев
//        String[] newString;
//
//        newString = sortNumberOfSentence(createParagraphArray(contents),contents);
//
//        for (int i = 0; i < sortNumberOfSentence(createParagraphArray(contents),contents).length; i++)
//        {
//            System.out.println(newString[i]);
//            if (i == 1) System.out.println();
//        }

        // Сортировка слов по длинне в абзаце
        //sortParagraphByTheLenghtOfTheWord(contents);

        // Сортировка слов в предложении
        //sortParagraphTheLenghtOfTheWordInSentence(contents);

        // Доделать https://qna.habr.com/q/297784

       //System.out.println(countOfSighn("1212","1"));

        //Создать метод сортировки по алфавиту, с помощью монепуляий с массивом строк i+1
        sortWordsInSentenceBySighn(contents);


    }

    private static int countOfSighn(String str, String sighn) {
        int count = 0;

        Pattern p1 = Pattern.compile(sighn);
        Matcher m1 = p1.matcher(str);

        while (m1.find())
        {
            count++;
        }
        return count;
    }

    private static String[] createNewString(String[] str,int[] place,String sighn)
    {
        String[] finalString = new String[str.length];

        for(int i = place.length - 1; i > 0; i--)
        {

        }

        return finalString;
    }

    private static String[] createAndSortWordsByAcountOfTheWord(String str)
    {
        String[] strArray = str.split(" ");
        Arrays.sort(strArray);
        return strArray;
    }

    private static String[] srtWordsByASimbol(String str, String sighn)
    {
        String[] finalString = str.split(" ");
        int[] countSighn = new int[finalString.length];

        for(int i = 0; i < finalString.length; i++)
        {
            countSighn[i] = countOfSighn(finalString[i],sighn);
            System.out.println(countSighn[i]);
        }

        String[] finalStringWithAPlaces = new  String[finalString.length];

        for(int i = 0; i < finalStringWithAPlaces.length; i++)
        {
            finalStringWithAPlaces[i] = String.valueOf(countSighn[i]) + finalString[i];
            System.out.println(finalStringWithAPlaces[i]);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

        Arrays.sort(finalStringWithAPlaces);

        for(int i = 0; i < finalStringWithAPlaces.length; i++)
        {
            System.out.println(finalStringWithAPlaces[i]);
        }

        return finalString;
    }

    private static void sortWordsInSentenceBySighn(String text)
    {
        String string = text;

        string = string.replaceAll("[1234567890,—-]", "");

        //System.out.println(string);

        int countofSentance = countOfSighn(string,"([^.!?]+[.!?])");

        System.out.println(countofSentance);

        String[] stringsArray = new String[countofSentance];

        stringsArray = string.split("[.!?]");

//        for(int i = 0; i <stringsArray.length; i++)
//        {
//            System.out.println(i + " : " +  stringsArray[i]);
//        }



        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

       // Arrays.sort(stringsArray,new StringLengthComparator());

        srtWordsByASimbol(stringsArray[0],"а");

//        System.out.println("Сортировка по длинне  предложения : ");
//        for(int i = 0; i <stringsArray.length; i++)
//        {
//            System.out.println(stringsArray[i]);
//           // System.out.println(i + " : " +  stringsArray[i]);
//        }









    }


    private static void sortParagraphTheLenghtOfTheWordInSentence(String text)
    {

        String string = text;

        string = string.replaceAll("[1234567890,—-]", "");

        String[] stringArray = new String[30];
        String[] stringArray2 = new String[10];
        Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(string);

        String textFinal = "";

        while (matcher.find())
        {
            stringArray[0] = matcher.group();

            stringArray2 = stringArray[0].split(" ");

            stringArray2[0] = stringArray2[0].replaceAll("[.!?]", "");

            Arrays.sort(stringArray2,new StringLengthComparator());

            textFinal += Arrays.toString(stringArray2);
        }


        //https://ru.stackoverflow.com/questions/103640/%D0%A3%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D1%81%D0%B8%D0%BC%D0%B2%D0%BE%D0%BB%D1%8B-%D0%B2-java

        textFinal = textFinal.replaceAll("[,.!?:;]", "");

        System.out.println(textFinal);

    }

    private static void sortParagraphByTheLenghtOfTheWord(String text)
    {
        String[] arrayOfSentence = new String[createParagraphArray(text).length - 1];

          //      String[] arrayOfSentence = createParagraphArray(text);

        System.out.println("-------------------------------");

        for(int i = 0; i < arrayOfSentence.length; i++)
        {
            //System.out.println(createParagraphArray(text)[0]);
            if (createParagraphArray(text)[i].equals(createParagraphArray(text)[0])) continue;
            arrayOfSentence[i]= createParagraphArray(text)[i];
           // System.out.println("1" + arrayOfSentence[i]);
        }

        String wordsOfArrayOfSentence = "";

        for(int i = 0; i < arrayOfSentence.length; i++)
        {

             }

        Pattern p1 = Pattern.compile("[а-юА-Юa-zA-Z\\s]");
        Matcher m1 = p1.matcher(arrayOfSentence[2]);

        for(int i = 0; i < 300; i++)
        {
            if (m1.find())
            {
                wordsOfArrayOfSentence += m1.group();
            }
        }

        String[] wordsOfArrayOfSentenceArray = wordsOfArrayOfSentence.split(" ");

        for(int i = 0; i < wordsOfArrayOfSentenceArray.length; i++)
        {
            System.out.println(wordsOfArrayOfSentenceArray[i]);
        }

        System.out.println(wordsOfArrayOfSentence);

        System.out.println("---------------------------------");

        //https://stackoverflow.com/questions/35866240/how-to-sort-string-array-by-length-using-arrays-sort

        Arrays.sort(wordsOfArrayOfSentenceArray,new StringLengthComparator());

        System.out.println(Arrays.toString(wordsOfArrayOfSentenceArray));

    }

    private static String[] sortNumberOfSentence(String[] str, String text)
    {
        String[] sotredString = new String[str.length];

        int[] numbreOfSentence = new int[createParagraphArray(text).length];

        for(int i = 0; i < numbreOfSentence.length; i++)
        {
            numbreOfSentence[i] = countOfSentence(createParagraphArray(text)[i]);
        }

        Arrays.sort(numbreOfSentence);

        for (int i = 0; i < numbreOfSentence.length; i++)
        {
            for (int j = 0; j < numbreOfSentence.length; j++)
            {
                if (numbreOfSentence[i] == countOfSentence(createParagraphArray(text)[j])) sotredString[i] = str[j];
            }
        }

        return sotredString;

    }

    private static int countOfSentence(String str) {
        int count = 0;

        Pattern p1 = Pattern.compile("[.!?]");
        Matcher m1 = p1.matcher(str);

        while (m1.find())
        {
           count++;
        }
        return count;
    }

    private static String[] createParagraphArray(String text)
    {
        Pattern p = Pattern.compile("  ");

        String[] strPar = p.split(text);

        return strPar;
    }

}







