package BasicOfOOP.OOPTask4;

public class Methods
{

    public int generateCoins()
    {
        int min = 0;
        int max = 10000;

        int randomInt = (int)(Math.random() * (max - min + 1) + min);

        return randomInt;
    }
}
