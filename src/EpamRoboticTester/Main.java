package EpamRoboticTester;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        //Число монет которое необходимо посчитать по условию задачи
        int amount = 111;

        //Номинал Монет
        int[] coinsArray = {100, 50, 20, 10, 5, 1};

        int count = 0;

        int i = 0;

        do {
            if (amount <= 0)
            {
                System.out.println("Введите корректное число");
                break;
            }

            if (amount / coinsArray[i] !=  0)
            {
                amount -= coinsArray[i];
            }
            else
            {
                i++;
                count--;
            }

            count++;

            if (i == coinsArray.length) break;

        } while (amount != 0);

        System.out.println("count " + count);

    }
}










