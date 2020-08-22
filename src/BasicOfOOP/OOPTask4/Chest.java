package BasicOfOOP.OOPTask4;

import BasicOfOOP.OOPTask4.TypeOfMetal.*;
import BasicOfOOP.OOPTask4.TypeOfPreciousStone.*;

public class Chest extends Treasures implements Gold, Silver, Bronze, Amethist, Diamond
{
    String name;

    int numberOfGoldCoinsOfChest;
    int numberOfSilverCoinsOfChest;
    int numberOfBronzeCoinsOfChest;

    int numberOfGoldCupsOfChest;
    int numberOfSilverCupsOfChest;
    int numberOfBronzeCupsOfChest;

    int numberOfAmetistPreciousStonesOfChest;
    int numberOfDiamondPreciousStonesOfChest;

    public Chest(String name)
    {
        this.name = "Сундук номер " + name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfGoldCoinsOfChest() {
        return numberOfGoldCoinsOfChest;
    }

    public void setNumberOfGoldCoinsOfChest(int numberOfGoldCoinsOfChest) {
        this.numberOfGoldCoinsOfChest = numberOfGoldCoinsOfChest;
    }

    public int getNumberOfSilverCoinsOfChest() {
        return numberOfSilverCoinsOfChest;
    }

    public void setNumberOfSilverCoinsOfChest(int numberOfSilverCoinsOfChest) {
        this.numberOfSilverCoinsOfChest = numberOfSilverCoinsOfChest;
    }

    public int getNumberOfBronzeCoinsOfChest() {
        return numberOfBronzeCoinsOfChest;
    }

    public void setNumberOfBronzeCoinsOfChest(int numberOfBronzeCoinsOfChest) {
        this.numberOfBronzeCoinsOfChest = numberOfBronzeCoinsOfChest;
    }

    public int getNumberOfGoldCupsOfChest() {
        return numberOfGoldCupsOfChest;
    }

    public void setNumberOfGoldCupsOfChest(int numberOfGoldCupsOfChest) {
        this.numberOfGoldCupsOfChest = numberOfGoldCupsOfChest;
    }

    public int getNumberOfSilverCupsOfChest() {
        return numberOfSilverCupsOfChest;
    }

    public void setNumberOfSilverCupsOfChest(int numberOfSilverCupsOfChest) {
        this.numberOfSilverCupsOfChest = numberOfSilverCupsOfChest;
    }

    public int getNumberOfBronzeCupsOfChest() {
        return numberOfBronzeCupsOfChest;
    }

    public void setNumberOfBronzeCupsOfChest(int numberOfBronzeCupsOfChest) {
        this.numberOfBronzeCupsOfChest = numberOfBronzeCupsOfChest;
    }

    public int getNumberOfAmetistPreciousStonesOfChest() {
        return numberOfAmetistPreciousStonesOfChest;
    }

    public void setNumberOfAmetistPreciousStonesOfChest(int numberOfAmetistPreciousStonesOfChest) {
        this.numberOfAmetistPreciousStonesOfChest = numberOfAmetistPreciousStonesOfChest;
    }

    public int getNumberOfDiamondPreciousStonesOfChest() {
        return numberOfDiamondPreciousStonesOfChest;
    }

    public void setNumberOfDiamondPreciousStonesOfChest(int numberOfDiamondPreciousStonesOfChest) {
        this.numberOfDiamondPreciousStonesOfChest = numberOfDiamondPreciousStonesOfChest;
    }

    public int totalPrice()
    {
        return this.numberOfGoldCoinsOfChest * new Treasures().priceBronzeCoins;
    }

    @Override
    public void createBronze()
    {
        this.numberOfBronzeCoinsOfChest = 1;
        this.numberOfBronzeCupsOfChest = 1;
    }

    @Override
    public int createGold()
    {
        this.numberOfGoldCoinsOfChest = 1;
        this.numberOfGoldCupsOfChest = 1;
        return 0;
    }

    @Override
    public int createSilver()
    {
        this.numberOfSilverCoinsOfChest = 1;
        this.numberOfSilverCupsOfChest = 1;
        return 0;
    }

    @Override
    public int creteAmetist()
    {
        this.numberOfAmetistPreciousStonesOfChest = 1;
        return 0;
    }

    @Override
    public int createDiamond()
    {
        this.numberOfDiamondPreciousStonesOfChest = 1;
        return 0;
    }
}
