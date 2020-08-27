package BasicOfOOP.Task4;

//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.

import BasicOfOOP.Task4.TypeOfTreasure.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        AllTresuares[] dragonCave = createCave();
        menu(dragonCave);
    }

    public static void menu(AllTresuares[] obj)
    {
        System.out.println("Добрый день, добро пожаловать в пещеру дракона, введите номер команды : ");

        System.out.println("1) Посмотреть все сокровища в пещере ");
        System.out.println("2) Найти самое дорогое сокровище ");
        System.out.println("3) Выбрать сокровище на заданную сумму ");

        Scanner sc = new Scanner(System.in);
        Integer ch = sc.nextInt();

        if (ch == 1)
        {
            for(int i = 1; i < obj.length; i++)
            {
                System.out.println( obj[i].toString());
            }
            menu(obj);
        }

        if (ch == 2)
        {
            findMostExpansiveTreasure(obj);
            menu(obj);
        }

        if (ch == 3)
        {
            chooseAtreasureForAFGivenAmount(obj);
            menu(obj);
        }
    }


    public static void chooseAtreasureForAFGivenAmount(AllTresuares[] obj)
    {
        System.out.println("Введите сумму сокровища : ");

        Scanner sc = new Scanner(System.in);
        Integer ch = sc.nextInt();

        boolean flag = false;

        for(int i = 1; i < obj.length; i++)
        {
            if (obj[i].totalPriceOfTheAllOneTresuare == ch)
            {
                flag = true;
                System.out.println(obj[i].toString());
            }
        }
        if (flag == false) System.out.println("Сокровище отсутсвует ...");
    }

    public static void findMostExpansiveTreasure(AllTresuares[] obj)
    {
        int[] sortArray = new int[obj.length];

        for(int i = 1; i < obj.length; i++)
        {
        sortArray[i] = obj[i].totalPriceOfTheAllOneTresuare;
        }

        Arrays.sort(sortArray);

        System.out.println("Самое дорогое сокровище это : ");

        for(int i = 1; i < obj.length; i++)
        {
            if (obj[i].totalPriceOfTheAllOneTresuare == sortArray[obj.length - 1])
                System.out.println(obj[i].toString());
        }
    }

    public static AllTresuares[] createCave()
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

        Cup[] objectsCups = new Cup[20];

        for(int i = 0; i < objectsCups.length; i++ )
        {
            objectsCups[i] = new Cup(Integer.toString(i+1));
        }

        PreciousStone[] preciousStones = new PreciousStone[10];

        for(int i = 0; i < preciousStones.length; i++ )
        {
            preciousStones[i] = new PreciousStone(Integer.toString(i+1));
        }

        AllTresuares[] allTresuares = new AllTresuares[new TreasuresPrice().getNumberOfTreasures()];

        for(int i = 0; i < 10; i++)
        {
            allTresuares[i] = new AllTresuares(objectsChests[i].getGetNamberOfTheChest(),
                    objectsChests[i].getNumberOfGoldCoins(),
                    objectsChests[i].getNumberOfSilverCoins(),
                    objectsChests[i].getNumberOfBronzeCoins(),
                    objectsChests[i].getNumberOfGoldCups(),
                    objectsChests[i].getNumberOfSilverCups(),
                    objectsChests[i].getNumberOfBronzeCups(),
                    objectsChests[i].getNumberOfAmetistPreciousStones(),
                    objectsChests[i].getNumberOfDiamondPreciousStones(),
                    objectsChests[i].totalPrice());
        }

        int count = 0;
        for (int i = 10; i < 80; i++)
        {
            allTresuares[i] = new AllTresuares(
                    objectsCoins[count].namberBagOfCoins,
                    objectsCoins[count].numberOfGoldCoins,
                    objectsCoins[count].numberOfSilverCoins,
                    objectsCoins[count].numberOfBronzeCoins,
                    objectsCoins[count].totalCoinsPrice);
            count++;
        }
        count = 0;
        for (int i = 70; i < 90; i++)
        {
            allTresuares[i] = new AllTresuares("Cup",objectsCups[count].numberBagOfTheCups,
                    objectsCups[count].numberOfGoldCups,
                    objectsCups[count].numberOfSilverCups,
                    objectsCups[count].numberOfBronzeCups,
                    objectsCups[count].totalCupsPrice);
            count++;
        }
        count = 0;
        for (int i = 90; i < 100; i++)
        {
            allTresuares[i] = new AllTresuares(preciousStones[count].naberBagOgThePreciosStone,
                    preciousStones[count].numberOfAmetist,
                    preciousStones[count].numberOfDiamond,
                    preciousStones[count].totalStonePrice);
            count++;

        }
        return allTresuares;
    }
    }



