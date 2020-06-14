package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task1;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
// отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

//Read more: https://javarevisited.blogspot.com/2015/09/how-to-read-file-into-string-in-java-7.html#ixzz6OxQnNVns
//https://www.javatpoint.com/java-pattern-split-method

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task1\\text.txt")));

       // System.out.println("---------------------------------------");




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
        sortParagraphTheLenghtOfTheWordInSentence(contents);



    }

    private static void sortParagraphTheLenghtOfTheWordInSentence(String text)
    {

        String string = text;
        String[] stringArray = new String[30];
        String[] stringArray2 = new String[10];
        Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(string);

        String textFinal = "";

        while (matcher.find())
        {
            stringArray[0] = matcher.group(1);

            stringArray2 = stringArray[0].split(" ");

            Arrays.sort(stringArray2,new StringLengthComparator());

            System.out.println(Arrays.toString(stringArray2));

            textFinal += Arrays.toString(stringArray2);
           // System.out.println(matcher.group(1));
        }

        System.out.println("--------------------");

        textFinal = textFinal.replaceAll(",","");

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
      //  wordsOfArrayOfSentence += arrayOfSentence[i];
        }

       // System.out.println(wordsOfArrayOfSentence);



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

//    private static String[] sortNumberOfWords(String[] str)
//    {
//        String[] sortedString = new String[str.length];
//
//        int[] lenghtOfWords = new int[str.length];
//
//        for(int i = 0; i < lenghtOfWords.length; i++)
//        {
//            lenghtOfWords[i] = str[i].length();
//            System.out.println(lenghtOfWords[i]);
//        }
//
//        Arrays.sort(lenghtOfWords);
//
//
//
//        for(int i = 0; i < lenghtOfWords.length; i++)
//        {
//            for(int j = 0; j < str.length; j++)
//            {
//                if (lenghtOfWords[i] == str[j].length())
//                {
//                    sortedString[i] = str[j];
//                    str[j] = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
//                }
//
//            }
//            System.out.println(sortedString[i]);
//        }
//
//
//        return sortedString;
//    }


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







