package BasicOfOOP.OOPTask4;

import BasicOfOOP.OOPTask4.TypeOfMetal.Bronze;
import BasicOfOOP.OOPTask4.TypeOfMetal.Gold;
import BasicOfOOP.OOPTask4.TypeOfMetal.Silver;

public class Coins extends Treasures implements Gold, Silver, Bronze
{

    int numberOfGoldCoins;
    int numberOfSilverCoins;
    int numberOfBronzeCoins;

    public int getNumberOfGoldCoins()
    {
        return numberOfGoldCoins = new Methods().generateCoins();
    }

    public void setNumberOfGoldCoins(int numberOfGoldCoins)
    {
        this.numberOfGoldCoins = numberOfGoldCoins;
    }

    public int getNumberOfSilverCoins() {
        return numberOfSilverCoins = new Methods().generateCoins();
    }

    public void setNumberOfSilverCoins(int numberOfSilverCoins) {
        this.numberOfSilverCoins = numberOfSilverCoins;
    }

    public int getNumberOfBronzeCoins()
    {

        return numberOfBronzeCoins = new Methods().generateCoins();
    }

    public void setNumberOfBronzeCoins(int numberOfBronzeCoins) {
        this.numberOfBronzeCoins = numberOfBronzeCoins;
    }

    @Override
    public void createBronze()
    {
        this.numberOfBronzeCoins = new Methods().generateCoins();
    }

    @Override
    public int createSilver()
    {
        this.numberOfSilverCoins = new Methods().generateCoins();;
        return this.numberOfBronzeCoins;
    }

    @Override
    public int createGold()
    {   this.numberOfGoldCoins = new Methods().generateCoins();;
        return this.numberOfGoldCoins;
    }



}
