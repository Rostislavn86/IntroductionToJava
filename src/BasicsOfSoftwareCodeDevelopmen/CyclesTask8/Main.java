package BasicsOfSoftwareCodeDevelopmen.CyclesTask8;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Main
{
    public static void main(String[] args)
    {
     int x = 1242003;
     int y = 40521333;

     String str1 = Integer.toString(x);
     String str2 = Integer.toString(y);

     String[] massStrok1 = str1.split("");
     String[] massStrok2 = str2.split("");
     String[] values = {"1","2","3","4","5","6","7","8","9","0"};

     String[] buffer = findEquals(massStrok1,massStrok2);

     System.out.println("Первое число: " + x);
     System.out.println("Второе число: " + y);

        for (int i = 0; i <= buffer.length - 1; i ++ )
        {
            for (int j = 0; j <= values.length - 1 ; j ++ )
            {
                if (buffer[i] == null) continue;
                if (buffer[i].contains(values[j])) values[j] = "x";
            }
        }

        System.out.println("Цифры входящие в запись как первого так и второго числа :");

        for (int i = 0; i <= values.length - 1  ; i ++ )
        {
            if (values[i].equals("x"))
            {
                if (((i + 1 ) == 10) && (i == 9))
                {
                    System.out.println("0");
                    continue;
                }
                System.out.println(i + 1);
            }
        }
    }

    public static String[] findEquals(String[] arr1, String[] arr2)
    {

        String[] mass = new String[arr1.length + arr2.length];

        for (int i = 0; i <= arr1.length - 1; i ++ )
        {
            for (int j = 0; j <= arr2.length - 1; j ++ )
            {
                if (arr1[i].equals(arr2[j])) mass[i] = arr1[i];
            }
        }
        return mass;
    }
    }
