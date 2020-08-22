package BasicOfOOP.OOPTask4;

public class PreciousStone extends Chest
{
    String naberBagOgThePreciosStone;

    int numberOfAmetist;
    int numberOfDiamond;

    int totalStonePrice;

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
