package BasicOfOOP.OOPTask4;

import BasicOfOOP.OOPTask4.TypeOfMetal.Bronze;
import BasicOfOOP.OOPTask4.TypeOfMetal.Gold;
import BasicOfOOP.OOPTask4.TypeOfMetal.Silver;

public class Cup extends Treasures implements Bronze,Gold,Silver
{
    int numberOfGoldCup;
    int numberOfSilverCup;
    int numberOfBronzeCup;

    public int getNumberOfGoldCup() {
        return numberOfGoldCup;
    }

    public void setNumberOfGoldCup(int numberOfGoldCup) {
        this.numberOfGoldCup = numberOfGoldCup;
    }

    public int getNumberOfSilverCup() {
        return numberOfSilverCup;
    }

    public void setNumberOfSilverCup(int numberOfSilverCup) {
        this.numberOfSilverCup = numberOfSilverCup;
    }

    public int getNumberOfBronzeCup() {
        return numberOfBronzeCup;
    }

    public void setNumberOfBronzeCup(int numberOfBronzeCup) {
        this.numberOfBronzeCup = numberOfBronzeCup;
    }

    @Override
    public void createBronze()
    {
        this.numberOfGoldCup = 1;
    }


    @Override
    public int createSilver()
    {
        this.numberOfSilverCup = 2;
        return this.numberOfSilverCup;
    }

    @Override
    public int createGold()
    {   this.numberOfBronzeCup = 3;
        return this.numberOfBronzeCup;
    }
}
