package BasicOfOOP.Task5.Fabrics;

import BasicOfOOP.Task5.CreateFlower;
import BasicOfOOP.Task5.Flowers.*;

public class FlowerFactory
{

    static String[] allFlowers = {"flower","flower","flower","flower","flower"};

    public CreateFlower createFlower(String flower)
    {
        {
            if (flower.equalsIgnoreCase("Роза"))
            {
                allFlowers[0] = new Rose().getFlowerName();
                return new Rose();
            }
            if (flower.equalsIgnoreCase("Крокус"))
            {
                allFlowers[1] = new Crocus().getFlowerName();
                return new Crocus();
            }
            if (flower.equalsIgnoreCase("Георгин"))
            {
                allFlowers[2] = new Dahlia().getFlowerName();
                return new Dahlia();
            }
            if (flower.equalsIgnoreCase("Тысячелистник"))
            {
                allFlowers[3] = new Milfoil().getFlowerName();
                return new Milfoil();
            }
            if (flower.equalsIgnoreCase("Подснежник"))
            {
                allFlowers[4] = new Snowdrop().getFlowerName();
                return new Snowdrop();
            }
            else
            {
                return null;
            }
        }
    }

    public static String[] getAllFlowers()
    {
        return allFlowers;
    }

}
