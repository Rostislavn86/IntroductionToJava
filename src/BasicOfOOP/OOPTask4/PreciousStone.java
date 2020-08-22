package BasicOfOOP.OOPTask4;

import BasicOfOOP.OOPTask4.TypeOfPreciousStone.*;

public class PreciousStone extends Treasures implements Amethist,Diamond
{
    int numberOfAmetist;
    int numberOfDiamond;

    public int getNumberOfAmetist() {
        return numberOfAmetist;
    }

    public void setNumberOfAmetist(int numberOfAmetist) {
        this.numberOfAmetist = numberOfAmetist;
    }

    public int getNumberOfDiamond() {
        return numberOfDiamond;
    }

    public void setNumberOfDiamond(int numberOfDiamond) {
        this.numberOfDiamond = numberOfDiamond;
    }

    @Override
    public int creteAmetist()
    {
        this.numberOfAmetist = 1;
        return this.numberOfAmetist;
    }

    @Override
    public int createDiamond()
    {
        this.numberOfDiamond = 1;
        return this.numberOfDiamond;
    }
}
