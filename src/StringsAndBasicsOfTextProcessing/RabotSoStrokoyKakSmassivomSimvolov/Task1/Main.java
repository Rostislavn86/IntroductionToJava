package StringsAndBasicsOfTextProcessing.RabotSoStrokoyKakSmassivomSimvolov.Task1;

//https://vertex-academy.com/tutorials/ru/chto-takoe-camelstyle/
//https://ru.wikipedia.org/wiki/Snake_case

public class Main {
    public static void main(String[] args) {
        String[] names = {"camelCaseAndCamelCase", "camelCase", "camelCase", "camelCase", "userFirstName", "userLastName", "userPhone", "userAge"};
        printArray(names);
        //changeArray(names);

        //changeArray(changeArray(names));

        printArray(changeArray(changeArray(names)));
    }

    private static String[] changeArray(String[] names)
    {
      String[] newArray = new String[names.length];
      String[] tempUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890".split("");

      for(int j = 0; j < newArray.length; j++)
      {
              for (int i = 0; i < tempUpperCase.length; i++)
              {
                  if (names[j].contains(tempUpperCase[i]))
                  {
                      newArray[j] = changeWord(names[j], tempUpperCase[i]);
                  }
              }
      }
      return newArray;
    }

    private static String changeWord(String stroka, String upperSighn)
    {
        String s1 = stroka;
        char[] ch = s1.toCharArray();

        String s2 = upperSighn;
        char[] znach = s2.toCharArray();

        String newString = null;

            for (int i = 0; i < ch.length; i++)
            {
                if (ch[i] == znach[0])
                {
                    newString = s1.replace(s2, "_" + Character.toLowerCase(znach[0]));
                }
            }
        return newString;
    }


    private static void printArray(String[] array)
    {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


}


