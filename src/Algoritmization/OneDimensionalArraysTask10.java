package Algoritmization;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

public class OneDimensionalArraysTask10 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println("Не сжатый массив :");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        int a = 0;
        int b = arr.length;
        int c = 2;

        do {
            arr[1] = 0;
            a  +=  c;
            if ((a+1) >= arr.length) break;
            arr[a+1] = 0;
        } while (a <= b);

        System.out.println("Массив из которого выброшен каждый второй элемент : ");

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0) continue;
            System.out.println(arr[i]);
        }

    }

}
