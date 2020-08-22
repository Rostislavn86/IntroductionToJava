package BasicOfOOP.OOPTask4.TypeOfTreasure;

import BasicOfOOP.OOPTask4.Methods;
import BasicOfOOP.OOPTask4.TreasuresPrice;

public class Chest
{
    public String getNamberOfTheChest;

    public int numberOfGoldCoins;
    public int numberOfSilverCoins;
    public int numberOfBronzeCoins;

    public int numberOfGoldCups;
    public int numberOfSilverCups;
    public int numberOfBronzeCups;

    public int numberOfAmetistPreciousStones;
    public int numberOfDiamondPreciousStones;

    public int totalChestPrice;

    public Chest(String name)
    {
        this.getNamberOfTheChest = "Сундук номер " + name;

        this.numberOfGoldCoins = getNumberOfGoldCoins();
        this.numberOfSilverCoins = getNumberOfSilverCoins();
        this.numberOfBronzeCoins = getNumberOfBronzeCoins();

        this.numberOfGoldCups = getNumberOfGoldCups();
        this.numberOfSilverCups = getNumberOfSilverCups();
        this.numberOfBronzeCups = getNumberOfBronzeCups();

        this.numberOfAmetistPreciousStones = getNumberOfAmetistPreciousStones();
        this.numberOfDiamondPreciousStones = getNumberOfDiamondPreciousStones();
    }

    public Chest()
    {

    }

    public String getNamberOfTheChest()
    {
        int count = 0;
        return getNamberOfTheChest;
    }

    public int getNumberOfGoldCoins()
    {
        return numberOfGoldCoins = new Methods().generateCoins();
    }

    public int getNumberOfSilverCoins() {
        return numberOfSilverCoins = new Methods().generateCoins();
    }

    public int getNumberOfBronzeCoins() {
        return numberOfBronzeCoins = new Methods().generateCoins();
    }

    public int getNumberOfGoldCups() {
        return numberOfGoldCups = new Methods().generateCups();
    }

    public int getNumberOfSilverCups() {
        return numberOfSilverCups = new Methods().generateCups();
    }

    public int getNumberOfBronzeCups() {
        return numberOfBronzeCups = new Methods().generateCups();
    }

    public int getNumberOfAmetistPreciousStones() {
        return numberOfAmetistPreciousStones = new Methods().generatePreciousStones();
    }

    public int getNumberOfDiamondPreciousStones() {
        return numberOfDiamondPreciousStones = new Methods().generatePreciousStones();
    }

    public int totalPrice()
    {
        this.totalChestPrice = this.numberOfGoldCoins * new TreasuresPrice().priceGoldCoins
                + this.numberOfSilverCoins * new TreasuresPrice().priceSilverCoins
                + this.numberOfBronzeCoins * new TreasuresPrice().priceBronzeCoins
                + this.numberOfGoldCups * new TreasuresPrice().priceOfGoldCup
                + this.numberOfSilverCups * new TreasuresPrice().priceOfSilverCup
                + this.numberOfBronzeCups * new TreasuresPrice().priceOfBronzeCup
                + this.numberOfAmetistPreciousStones * new TreasuresPrice().priceOfAmetist
                + this.numberOfDiamondPreciousStones * new TreasuresPrice().priceOfDiamond;

        return this.totalChestPrice;
    }

    @Override
    public String toString() {
        return "Chest{" +
                "getNamberOfTheChest='" + getNamberOfTheChest + '\'' +
                ", numberOfGoldCoins=" + numberOfGoldCoins +
                ", numberOfSilverCoins=" + numberOfSilverCoins +
                ", numberOfBronzeCoins=" + numberOfBronzeCoins +
                ", numberOfGoldCups=" + numberOfGoldCups +
                ", numberOfSilverCups=" + numberOfSilverCups +
                ", numberOfBronzeCups=" + numberOfBronzeCups +
                ", numberOfAmetistPreciousStones=" + numberOfAmetistPreciousStones +
                ", numberOfDiamondPreciousStones=" + numberOfDiamondPreciousStones +
                ", totalChestPrice=" + totalChestPrice +
                '}';
    }
}
