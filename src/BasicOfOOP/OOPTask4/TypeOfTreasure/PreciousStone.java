package BasicOfOOP.OOPTask4.TypeOfTreasure;

import BasicOfOOP.OOPTask4.TreasuresPrice;

public class PreciousStone extends Chest
{
    public String naberBagOgThePreciosStone;

    public int numberOfAmetist;
    public int numberOfDiamond;

    public int totalStonePrice;

    public PreciousStone(String naberBagOgThePreciosStone)
    {
        this.naberBagOgThePreciosStone = naberBagOgThePreciosStone;

        this.numberOfAmetistPreciousStones = getNumberOfAmetistPreciousStones();
        this.numberOfDiamondPreciousStones = getNumberOfDiamondPreciousStones();
    }

    @Override
    public int totalPrice()
    {
        this.totalStonePrice = this.numberOfAmetistPreciousStones * new TreasuresPrice().priceOfAmetist
                + this.numberOfDiamondPreciousStones * new TreasuresPrice().priceOfDiamond;
        return this.totalStonePrice;
    }

    @Override
    public String toString() {
        return "PreciousStone{" +
                "naberBagOgThePreciosStone='" + naberBagOgThePreciosStone + '\'' +
                ", numberOfAmetist=" + numberOfAmetist +
                ", numberOfDiamond=" + numberOfDiamond +
                ", totalStonePrice=" + totalStonePrice +
                '}';
    }
}
