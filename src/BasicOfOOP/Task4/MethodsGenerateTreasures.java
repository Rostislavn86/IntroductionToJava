package BasicOfOOP.Task4;

public class MethodsGenerateTreasures
{

    public int generateCoins()
    {
        int min = 0;
        int max = 10000;

        int randomInt = (int)(Math.random() * (max - min + 1) + min);

        return randomInt;
    }

    public int generateCups()
    {
        int min = 0;
        int max = 10;

        int randomInt = (int)(Math.random() * (max - min + 1) + min);

        return randomInt;
    }

    public int generatePreciousStones()
    {
        int min = 0;
        int max = 100;

        int randomInt = (int)(Math.random() * (max - min + 1) + min);

        return randomInt;
    }
}
