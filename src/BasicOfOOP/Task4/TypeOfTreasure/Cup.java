package BasicOfOOP.Task4.TypeOfTreasure;

import BasicOfOOP.Task4.TreasuresPrice;

public class Cup extends Chest
{
    public String numberBagOfTheCups;

    public int numberOfGoldCups;
    public int numberOfSilverCups;
    public int numberOfBronzeCups;

    public int totalCupsPrice;

    public Cup(String numberBagOfTheCups)
    {
        this.numberBagOfTheCups = "Мешок кубков номер " + numberBagOfTheCups;

        this.numberOfGoldCups = getNumberOfGoldCups();
        this.numberOfSilverCups = getNumberOfSilverCups();
        this.numberOfBronzeCups = getNumberOfBronzeCups();

        this.totalCupsPrice = totalPrice();
    }

    @Override
    public int totalPrice()
    {
        this.totalCupsPrice = this.numberOfGoldCups * new TreasuresPrice().priceOfGoldCup
                + this.numberOfSilverCups * new TreasuresPrice().priceOfSilverCup
                + this.numberOfBronzeCups * new TreasuresPrice().priceOfBronzeCup;
        return this.totalCupsPrice;
    }

}
