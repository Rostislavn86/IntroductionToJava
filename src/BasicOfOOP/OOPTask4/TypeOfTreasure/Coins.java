package BasicOfOOP.OOPTask4.TypeOfTreasure;

import BasicOfOOP.OOPTask4.TreasuresPrice;

public class Coins extends Chest
{
    public String namberBagOfCoins;

    public int numberOfGoldCoins;
    public int numberOfSilverCoins;
    public int numberOfBronzeCoins;

    public int totalCoinsPrice;

    public Coins(String namberBagOfCoins)
    {
        this.namberBagOfCoins = "Мешок монет номер " + namberBagOfCoins;

        this.numberOfGoldCoins = getNumberOfGoldCoins();
        this.numberOfSilverCoins = getNumberOfSilverCoins();
        this.numberOfBronzeCoins = getNumberOfBronzeCoins();

        this.totalCoinsPrice = totalPrice();
    }

    public String getNamberBagOfCoins()
    {
        return namberBagOfCoins;
    }

    @Override
    public int totalPrice()
    {
        this.totalCoinsPrice = this.numberOfGoldCoins * new TreasuresPrice().priceGoldCoins
                + this.numberOfSilverCoins * new TreasuresPrice().priceSilverCoins
                + this.numberOfBronzeCoins * new TreasuresPrice().priceBronzeCoins;

        return this.totalCoinsPrice;
    }

}
