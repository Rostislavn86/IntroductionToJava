package StringsAndBasicsOfTextProcessing.RabotSoStrokoyKakSmassivomSimvolov.Task1;

//https://ru.wikipedia.org/wiki/CamelCase
//https://ru.wikipedia.org/wiki/Snake_case

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Main {
    public static void main(String[] args)
    {
        String[] names = {"biCapitalization", "bumpyCaps", "bumpyCase", "wordsStrungTogether", "wordsRunTogether"};
        System.out.println("CamelCase :");
        printArray(names);
        System.out.println("snake_case :");
        printArray(changeArray(names));
    }

    private static String[] changeArray(String[] names)
    {
        String s = "";

        int count = 0;

        for(int i = 0; i < names.length; i++)
        {
            if (count > 0)
            {
                s += ' ';
                count = 0;
            }
            String n = names[i];
            s += n;
            count++;
        }

        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < names.length; j++)
            {
                String changeSighn = Character.toString(c[i]);
                String changedSighn =  Character.toString(Character.toLowerCase(c[i]));
                if (Character.isUpperCase(c[i])) names[j] = names[j].replaceAll(changeSighn,"_" + changedSighn);
            }
        }
        return names;
    }

    private static void printArray(String[] array)
    {
        for (String s : array)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}


