package StringsAndBasicsOfTextProcessing.WorkingWithRegularExpressionsPatternMatcher.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\Epam_Task\\Introduction to Java\\src\\StringsAndBasicsOfTextProcessing\\WorkingWithRegularExpressionsPatternMatcher\\Task1\\text.txt")));

        chooseVivod(contents);

    }

    public static void chooseVivod(String contents)
    {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Выбирите какой из параметров вы хотите вывести на консоль : ");
        System.out.println("Для того что бы вывести отсортированные абзацы по количеству предложений введите '1' ");
        System.out.println("Для того что бы вывести отсортированные в каждом предложении слова по длине введите '2' ");
        System.out.println("Для того что бы вывести отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту введите '3' ");
        System.out.println("Для выхода введите любой символ (или комбинацию символов : )");

        Scanner bukva = new Scanner(System.in);
        String ch = bukva.nextLine();

        if (ch.equals("1")) {
            System.out.println("Изначальный текст : ");
            System.out.println(contents);
            System.out.println("---------------------");
            System.out.println("Ваш Запрос :");
            paragraphSorting(contents);
            chooseVivod(contents);
        }

        if (ch.equals("2")) {
            System.out.println("Изначальный текст : ");
            System.out.println(contents);
            System.out.println("---------------------");
            System.out.println("Ваш Запрос :");
            sortParagraphTheLenghtOfTheWordInSentence(contents);
            chooseVivod(contents);
        }

        if (ch.equals("3")) {
            System.out.println("Изначальный текст : ");
            System.out.println(contents);
            System.out.println("---------------------");
            System.out.println("Ваш Запрос :");
            sortWordsInSentenceBySighn(contents);
            chooseVivod(contents);
        }
    }

    private static void paragraphSorting(String contents)
    {
        String[] newString;

        newString = sortNumberOfSentence(createParagraphArray(contents),contents);

        for (int i = 0 ; i < newString.length; i++)
        {
            System.out.println(newString[i]);
        }
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

    private static String createAndSortWordsByAcountOfTheWord(String str)
    {
        String[] strArray = str.split(" ");
        Arrays.sort(strArray);

        String strOut = "";

        for(int i = 0; i < strArray.length; i++)
        {
            strOut += strArray[i] + " ";
        }

        return strOut;
    }

    private static void srtWordsByASimbol(String str, String sighn)
    {
        String[] finalString = str.split(" ");
        int[] countSighn = new int[finalString.length];

        for(int i = 0; i < finalString.length; i++)
        {
            countSighn[i] = countOfSighn(finalString[i],sighn);
        }

        String[] finalStringWithAPlaces = new  String[finalString.length];

        for(int i = 0; i < finalStringWithAPlaces.length; i++)
        {
            finalStringWithAPlaces[i] = String.valueOf(countSighn[i]) + finalString[i];
        }

        Arrays.sort(finalStringWithAPlaces);

        String arrayStringPovt0 = "";
        String arrayStringPovt1 = "";
        String arrayStringPovt2 = "";
        String arrayStringPovt3 = "";
        String arrayStringPovt4 = "";
        String arrayStringPovt5 = "";
        String arrayStringPovt6 = "";

        for(int i = 0; i < finalStringWithAPlaces.length; i++)
        {
            Pattern p = Pattern.compile("^[0-9]");
            Matcher m = p.matcher(finalStringWithAPlaces[i]);

            while (m.find()) {
                if (m.group().equals("0")) arrayStringPovt0 += finalStringWithAPlaces[i];
                if (m.group().equals("1")) arrayStringPovt1 += finalStringWithAPlaces[i];
                if (m.group().equals("2")) arrayStringPovt2 += finalStringWithAPlaces[i];
                if (m.group().equals("3")) arrayStringPovt3 += finalStringWithAPlaces[i];
                if (m.group().equals("4")) arrayStringPovt4 += finalStringWithAPlaces[i];
                if (m.group().equals("5")) arrayStringPovt5 += finalStringWithAPlaces[i];
                if (m.group().equals("6")) arrayStringPovt6 += finalStringWithAPlaces[i];
            }
        }

        arrayStringPovt0 = arrayStringPovt0.replaceAll("[0-9]"," ");
        arrayStringPovt0 = arrayStringPovt0.trim();

        arrayStringPovt1 = arrayStringPovt1.replaceAll("[0-9]"," ");
        arrayStringPovt1 = arrayStringPovt1.trim();

        arrayStringPovt2 = arrayStringPovt2.replaceAll("[0-9]"," ");
        arrayStringPovt2 = arrayStringPovt2.trim();

        arrayStringPovt3 = arrayStringPovt3.replaceAll("[0-9]"," ");
        arrayStringPovt3 = arrayStringPovt3.trim();

        arrayStringPovt4 = arrayStringPovt4.replaceAll("[0-9]"," ");
        arrayStringPovt4 = arrayStringPovt4.trim();

        arrayStringPovt5 = arrayStringPovt5.replaceAll("[0-9]"," ");
        arrayStringPovt5 = arrayStringPovt5.trim();

        arrayStringPovt6 = arrayStringPovt6.replaceAll("[0-9]"," ");
        arrayStringPovt6 = arrayStringPovt6.trim();

        createAndSortWordsByAcountOfTheWord(arrayStringPovt0);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt1);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt2);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt3);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt4);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt5);
        createAndSortWordsByAcountOfTheWord(arrayStringPovt6);

        String strForFinalArray = createAndSortWordsByAcountOfTheWord(arrayStringPovt6)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt5)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt4)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt3)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt2)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt1)
        + createAndSortWordsByAcountOfTheWord(arrayStringPovt0);

        strForFinalArray = strForFinalArray.trim();

        String[] outPutArray = strForFinalArray.split(" ");

        for(int i = 0; i < outPutArray.length; i++)
        {
            if (outPutArray[i].equals("")) continue;
            System.out.print(outPutArray[i] + " ");
        }
    }

    private static void sortWordsInSentenceBySighn(String text)
    {
        String string = text;

        string = string.replaceAll("[1234567890,—-]", "");

        String[] stringsArray ;

        stringsArray = string.split("[.!?]");

        System.out.println("Введите символ вхождение которого нужно посчитать в строке : ");

        Scanner bukva = new Scanner(System.in);
        String ch = bukva.nextLine();

        for(int i = 0; i <stringsArray.length; i++)
        {
            srtWordsByASimbol(stringsArray[i],ch);
            System.out.println();
        }
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







