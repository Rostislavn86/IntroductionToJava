package Algoritmization;

//7. Пусть даны две неубывающие последовательности действительных чисел
//a1  a2  an и b1  b2  bm
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1  b2  bm
//в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class OneDimensionalSortArraysTask7
{
    public static void main(String[] args)
    {
        int[] arrayA = {1 ,2 ,3 ,4 ,5 ,6};
        int[] arrayB = {4 ,5, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        comleteTask(arrayA,arrayB);
    }

    public static int[] comleteTask(int[] arrayA, int[] arrayB)
    {
        int tmp = 0;

        for(int i = 0; i < arrayA.length; i++)
        {
            for(int j = 0; j < arrayB.length; j++)
            {
            tmp = arrayA[i];
            arrayA[i] = arrayB[j];
            if (checkVozvr(arrayA) == true)
            {
                System.out.println("*****************************************************");
                System.out.println((i + 1)  + " (ой) элемент массива 1 можно заменить" );
                System.out.println("на " + (j + 1) + "(ый) элементом массива 2");
                System.out.println("и новая последовательность будет возрастающей");
                System.out.println("*****************************************************");
            }
            checkVozvr(arrayA);
            arrayA[i] = tmp;
            }
        }
        return arrayA;
    }

    public static boolean checkVozvr(int[] arr)
    {
        boolean b = false;
        
        for(int i = 0; i < arr.length;)
        {
            if (i + 1 == arr.length) break;

            if (arr[i] < arr[i + 1])
            {
                i++;
                b = true;
            }
            else
            {
                b = false;
                break;
            }
        }
        return b;
    }
}
