package BasicOfOOP.Task5.Fabrics;

import BasicOfOOP.Task5.CreateFlower;
import BasicOfOOP.Task5.Flowers.*;

public class FlowerFactory
{

    String flowerName;
    static String[] allFlowers = new String[5];

    public CreateFlower createFlower(String flower)
    {

        {
            if (flower.equalsIgnoreCase("Роза"))
            {
                this.flowerName = flower;
                allFlowers[0] = flower;
                return new Rose();
            }
            if (flower.equalsIgnoreCase("Крокус"))
            {
                this.flowerName = flower;
                allFlowers[1] = flower;
                return new Crocus();
            }
            if (flower.equalsIgnoreCase("Георгин"))
            {
                this.flowerName = flower;
                allFlowers[2] = flower;
                return new Dahlia();
            }
            if (flower.equalsIgnoreCase("Тысячелистник"))
            {
                this.flowerName = flower;
                allFlowers[3] = flower;
                return new Milfoil();
            }
            if (flower.equalsIgnoreCase("Подснежник"))
            {
                this.flowerName = flower;
                allFlowers[4] = flower;
                return new Snowdrop();
            }
            else
            {
                return null;
            }
        }
    }

    public static String[] getAllFlowers() {
        return allFlowers;
    }

    @Override
    public String toString() {
        return "FlowerFactory{" +
                "flowerName='" + flowerName + '\'' +
                '}';
    }

}
