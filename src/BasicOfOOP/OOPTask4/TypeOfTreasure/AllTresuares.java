package BasicOfOOP.OOPTask4.TypeOfTreasure;

public class AllTresuares extends Chest
{
    public String getNamOfAllTheTresuare;

    public int numberOfAllGoldCoins;
    public int numberOfAllSilverCoins;
    public int numberOfAllBronzeCoins;

    public int numberOfAllGoldCups;
    public int numberOfAllSilverCups;
    public int numberOfAllBronzeCups;

    public int numberOfAmetistAllPreciousStones;
    public int numberOfDiamondAllPreciousStones;

    public int totalPriceOfTheAllOneTresuare;


    public AllTresuares(String getNamOfAllTheTresuare, int numberOfAllGoldCoins, int numberOfAllSilverCoins, int numberOfAllBronzeCoins, int numberOfAllGoldCups, int numberOfAllSilverCups, int numberOfAllBronzeCups, int numberOfAmetistAllPreciousStones, int numberOfDiamondAllPreciousStones, int totalPriceOfTheAllOneTresuare)
    {
        this.getNamOfAllTheTresuare = getNamOfAllTheTresuare;
        this.numberOfAllGoldCoins = numberOfAllGoldCoins;
        this.numberOfAllSilverCoins = numberOfAllSilverCoins;
        this.numberOfAllBronzeCoins = numberOfAllBronzeCoins;
        this.numberOfAllGoldCups = numberOfAllGoldCups;
        this.numberOfAllSilverCups = numberOfAllSilverCups;
        this.numberOfAllBronzeCups = numberOfAllBronzeCups;
        this.numberOfAmetistAllPreciousStones = numberOfAmetistAllPreciousStones;
        this.numberOfDiamondAllPreciousStones = numberOfDiamondAllPreciousStones;
        this.totalPriceOfTheAllOneTresuare = totalPriceOfTheAllOneTresuare;
    }

    public AllTresuares(String getNamOfAllTheTresuare, int numberOfAllGoldCoins, int numberOfAllSilverCoins, int numberOfAllBronzeCoins, int totalPriceOfTheAllOneTresuare) {
        this.getNamOfAllTheTresuare = getNamOfAllTheTresuare;
        this.numberOfAllGoldCoins = numberOfAllGoldCoins;
        this.numberOfAllSilverCoins = numberOfAllSilverCoins;
        this.numberOfAllBronzeCoins = numberOfAllBronzeCoins;
        this.totalPriceOfTheAllOneTresuare = totalPriceOfTheAllOneTresuare;
    }

    public AllTresuares(String cup, String getNamOfAllTheTresuare,int numberOfAllGoldCups, int numberOfAllSilverCups, int numberOfAllBronzeCups, int totalPriceOfTheAllOneTresuare)
    {
        this.getNamOfAllTheTresuare = getNamOfAllTheTresuare;
        this.numberOfAllGoldCups = numberOfAllGoldCups;
        this.numberOfAllSilverCups = numberOfAllSilverCups;
        this.numberOfAllBronzeCups = numberOfAllBronzeCups;
        this.totalPriceOfTheAllOneTresuare = totalPriceOfTheAllOneTresuare;
    }

    public AllTresuares(String getNamOfAllTheTresuare, int numberOfAmetistAllPreciousStones, int numberOfDiamondAllPreciousStones, int totalPriceOfTheAllOneTresuare)
    {
        this.getNamOfAllTheTresuare = getNamOfAllTheTresuare;
        this.numberOfAmetistAllPreciousStones = numberOfAmetistAllPreciousStones;
        this.numberOfDiamondAllPreciousStones = numberOfDiamondAllPreciousStones;
        this.totalPriceOfTheAllOneTresuare = totalPriceOfTheAllOneTresuare;
    }

    @Override
    public String toString()
    {
        return  "Название сокровища : " + getNamOfAllTheTresuare + '\'' +
                " Количество золотых монет : " + numberOfAllGoldCoins +
                " Количество серебрянных монет : " + numberOfAllSilverCoins +
                " Количество бронзовых монет : " + numberOfAllBronzeCoins +
                " Количество золотых кубков : " + numberOfAllGoldCups +
                " Кличество серебрянных кубков : " + numberOfAllSilverCups +
                " Количество серебрянных кубков : " + numberOfAllBronzeCups +
                " Количество Аметистов : " + numberOfAmetistAllPreciousStones +
                " Количество Алмазов : " + numberOfDiamondAllPreciousStones +
                " Общая сумма сокровища : " + totalPriceOfTheAllOneTresuare ;
    }
}
