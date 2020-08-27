package BasicOfOOP.Task4.TypeOfTreasure;

import BasicOfOOP.Task4.TreasuresPrice;

public class PreciousStone extends Chest
{
    public String naberBagOgThePreciosStone;

    public int numberOfAmetist;
    public int numberOfDiamond;

    public int totalStonePrice;

    public PreciousStone(String naberBagOgThePreciosStone)
    {

        this.naberBagOgThePreciosStone = "Мешок драгоценных камней номер " + naberBagOgThePreciosStone;

        this.numberOfAmetist = getNumberOfAmetistPreciousStones();
        this.numberOfDiamond = getNumberOfDiamondPreciousStones();

        this.totalStonePrice = totalPrice();
    }

    @Override
    public int totalPrice()
    {
        this.totalStonePrice = this.numberOfAmetistPreciousStones * new TreasuresPrice().priceOfAmetist
                + this.numberOfDiamondPreciousStones * new TreasuresPrice().priceOfDiamond;
        return this.totalStonePrice;
    }

}
