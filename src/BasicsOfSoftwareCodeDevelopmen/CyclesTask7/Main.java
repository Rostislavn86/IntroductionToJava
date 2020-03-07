package BasicsOfSoftwareCodeDevelopmen.CyclesTask7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = sc.nextInt();
        System.out.println("Введите второе число: ");
        int second = sc.nextInt();

        int mass[];
        mass = findChisla(first,second);

        for(int i = 0; i < mass.length; i++)
        {
            findDelitsel(mass[i]);
            System.out.println("---------------------");
        }
    }

    public static void findDelitsel(int x) {

        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0) {
                if (i == 1) continue;
                if (i == x) break;
                System.out.println("Делителем числа " + x + " является число " + i);
            }
        }
    }

    public static int[] findChisla(int x, int y)
    {
        int arr[] = new int[y-x+1];

        for(int i = 0; i <= (y-x); i++)
        {
            arr[i] = x + i ;
        }
        return arr;
    }
    }
