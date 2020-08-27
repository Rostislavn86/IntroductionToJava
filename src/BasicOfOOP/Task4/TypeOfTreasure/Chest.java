package BasicOfOOP.Task4.TypeOfTreasure;

import BasicOfOOP.Task4.MethodsGenerateTreasures;
import BasicOfOOP.Task4.TreasuresPrice;

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

        this.totalChestPrice = totalPrice();
    }

    public Chest()
    {

    }

    public String getGetNamberOfTheChest()
    {
        return getNamberOfTheChest;
    }

    public int getNumberOfGoldCoins()
    {
        return numberOfGoldCoins = new MethodsGenerateTreasures().generateCoins();
    }

    public int getNumberOfSilverCoins() {
        return numberOfSilverCoins = new MethodsGenerateTreasures().generateCoins();
    }

    public int getNumberOfBronzeCoins() {
        return numberOfBronzeCoins = new MethodsGenerateTreasures().generateCoins();
    }

    public int getNumberOfGoldCups() {
        return numberOfGoldCups = new MethodsGenerateTreasures().generateCups();
    }

    public int getNumberOfSilverCups() {
        return numberOfSilverCups = new MethodsGenerateTreasures().generateCups();
    }

    public int getNumberOfBronzeCups() {
        return numberOfBronzeCups = new MethodsGenerateTreasures().generateCups();
    }

    public int getNumberOfAmetistPreciousStones() {
        return numberOfAmetistPreciousStones = new MethodsGenerateTreasures().generatePreciousStones();
    }

    public int getNumberOfDiamondPreciousStones() {
        return numberOfDiamondPreciousStones = new MethodsGenerateTreasures().generatePreciousStones();
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

}
