package BasicOfOOP.OOPTask4;

//https://javarush.ru/groups/posts/1981-dlja-chego-v-java-nuzhnih-interfeysih
//https://metanit.com/java/tutorial/3.5.php
//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.

import jdk.swing.interop.SwingInterOpUtils;

public class Main
{
    public static void main(String[] args)
    {

    Chest[] objectsChests = new Chest[10];

    for(int i = 0; i < objectsChests.length; i++)
    {
        objectsChests[i] = new Chest(Integer.toString(i + 1));
    }

    Coins[] objectsCoins = new Coins[70];

    for(int i = 0; i < objectsCoins.length; i++)
    {
        objectsCoins[i] = new Coins(Integer.toString(i + 1));
    }

        System.out.println(objectsChests[0].getNamberOfTheChest);
        System.out.println(objectsChests[1].numberOfGoldCoins);
        System.out.println(objectsChests[1].numberOfGoldCoins);

        System.out.println(objectsChests[0].totalPrice());




    
    }
}
