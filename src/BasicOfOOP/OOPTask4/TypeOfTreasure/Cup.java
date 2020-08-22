package BasicOfOOP.OOPTask4.TypeOfTreasure;


import BasicOfOOP.OOPTask4.TreasuresPrice;

public class Cup extends Chest
{
    public String numberBagOfTheCups;

    public int numberOfGoldCups;
    public int numberOfSilverCups;
    public int numberOfBronzeCups;

    public int totalCupsPrice;

    public Cup(String numberBagOfTheCups)
    {
        this.numberBagOfTheCups = numberBagOfTheCups;

        this.numberOfGoldCups = getNumberOfGoldCups();
        this.numberOfSilverCups = getNumberOfSilverCups();
        this.numberOfBronzeCups = getNumberOfBronzeCups();
    }

    @Override
    public int totalPrice()
    {
        this.totalCupsPrice = this.numberOfGoldCups * new TreasuresPrice().priceOfGoldCup
                + this.numberOfSilverCups * new TreasuresPrice().priceOfSilverCup
                + this.numberOfBronzeCups * new TreasuresPrice().priceOfBronzeCup;
        return this.totalCupsPrice;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "numberBagOfTheCups='" + numberBagOfTheCups + '\'' +
                ", numberOfGoldCups=" + numberOfGoldCups +
                ", numberOfSilverCups=" + numberOfSilverCups +
                ", numberOfBronzeCups=" + numberOfBronzeCups +
                ", totalCupsPrice=" + totalCupsPrice +
                '}';
    }
}
