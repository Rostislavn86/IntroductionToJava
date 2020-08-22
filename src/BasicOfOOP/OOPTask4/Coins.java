package BasicOfOOP.OOPTask4;

public class Coins extends Chest
{
    String namberBagOfCoins;

    int numberOfGoldCoins;
    int numberOfSilverCoins;
    int numberOfBronzeCoins;

    int totalCoinsPrice;

    public Coins(String namberBagOfCoins)
    {
        this.namberBagOfCoins = namberBagOfCoins;

        this.numberOfGoldCoins = getNumberOfGoldCoins();
        this.numberOfSilverCoins = getNumberOfSilverCoins();
        this.numberOfBronzeCoins = getNumberOfBronzeCoins();
    }

    @Override
    public int totalPrice()
    {
        this.totalCoinsPrice = this.numberOfGoldCoins * new TreasuresPrice().priceGoldCoins
                + this.numberOfSilverCoins * new TreasuresPrice().priceSilverCoins
                + this.numberOfBronzeCoins * new TreasuresPrice().priceBronzeCoins;

        return this.totalCoinsPrice;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "namberBagOfCoins='" + namberBagOfCoins + '\'' +
                ", numberOfGoldCoins=" + numberOfGoldCoins +
                ", numberOfSilverCoins=" + numberOfSilverCoins +
                ", numberOfBronzeCoins=" + numberOfBronzeCoins +
                ", totalCoinsPrice=" + totalCoinsPrice +
                '}';
    }
}
