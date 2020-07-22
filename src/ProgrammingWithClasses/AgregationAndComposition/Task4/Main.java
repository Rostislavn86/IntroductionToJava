package ProgrammingWithClasses.AgregationAndComposition.Task4;

//4. Счета. Клиент может иметь несколько счетов в банке.
//   Учитывать возможность блокировки/разблокировки счета.
//   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
//   Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Accaunts accaunts1 = new Accaunts(1125,1000);
        Accaunts accaunts2 = new Accaunts(3558, -500);
        Accaunts accaunts3 = new Accaunts(9852, 320);
        Accaunts accaunts4 = new Accaunts(1234, 234);

        Clients clientAccaunt1 = new Clients("Иванов",accaunts1);
        Clients clientAccaunt2 = new Clients("Иванов",accaunts2);
        Clients clientAccaunt3 = new Clients("Иванов",accaunts3);
        Clients clientAccaunt4 = new Clients("Сидоров",accaunts4);

        System.out.println("Блокировка и разблокировка аккаунтов : ");
        clientAccaunt1.accaunts.accauntBlocking();
        clientAccaunt1.accaunts.accauntUnBlocking();

        clientAccaunt2.accaunts.accauntBlocking();
        clientAccaunt2.accaunts.accauntUnBlocking();

        clientAccaunt3.accaunts.accauntBlocking();
        clientAccaunt3.accaunts.accauntUnBlocking();

        System.out.println("Поиск номера счёта по имени клиента : ");

        String name = "Сидоров";
        System.out.println("Имя клиента  = " + name);

        clientAccaunt1.findNumberOfTheAccauntByTheNameOfTheClient(name);
        clientAccaunt2.findNumberOfTheAccauntByTheNameOfTheClient(name);
        clientAccaunt3.findNumberOfTheAccauntByTheNameOfTheClient(name);
        clientAccaunt4.findNumberOfTheAccauntByTheNameOfTheClient(name);

        System.out.println("Отсортированные счета клиентов : ");

        int[] clientsArrayAccauntNumber = new int[4];

        clientsArrayAccauntNumber[0] = clientAccaunt1.accaunts.getNumberOfTheAccaunt();
        clientsArrayAccauntNumber[1] = clientAccaunt2.accaunts.getNumberOfTheAccaunt();
        clientsArrayAccauntNumber[2] = clientAccaunt3.accaunts.getNumberOfTheAccaunt();
        clientsArrayAccauntNumber[3] = clientAccaunt4.accaunts.getNumberOfTheAccaunt();

        Arrays.sort(clientsArrayAccauntNumber);

        for(int i = 0; i < clientsArrayAccauntNumber.length; i++)
        {
            System.out.println(clientsArrayAccauntNumber[i]);
        }

        System.out.println("Вычисление общей суммы всех счетов в банке : ");

        System.out.println(clientAccaunt1.accaunts.getAllMoney());

        System.out.println("Вычисление суммы по всем счетам, имеющим положительный баланс");

        System.out.println(clientAccaunt1.accaunts.getGetAllMoneyBalancePlus());

        System.out.println("Вычисление суммы по всем счетам, имеющим отрицательный баланс");

        System.out.println(clientAccaunt1.accaunts.getGetAllMoneyBalanceMinus());

    }
}
