package ProgrammingWithClasses.AgregationAndComposition.Task4;

//счета
public class Accaunts
{
    private int numberOfTheAccaunt;
    private int numberOfTheMoney;

    private static int tempNumberOfTheAccaunt = 0;
    private static int getAllMoney;
    private static int getAllMoneyPlus;
    private static int getAllMoneyMinus;

    Accaunts(int numberOfTheAccaunt, int numberOfTheMoney)
    {
    this.numberOfTheAccaunt = numberOfTheAccaunt;
    this.numberOfTheMoney = numberOfTheMoney;

    getAllMoney += this.numberOfTheMoney;

    if (this.numberOfTheMoney > 0)
    getAllMoneyPlus += this.numberOfTheMoney;

    if (this.numberOfTheMoney < 0)
    getAllMoneyMinus += this.numberOfTheMoney;
    }

    public int getNumberOfTheAccaunt()
    {
        if (numberOfTheAccaunt == 0) return tempNumberOfTheAccaunt;
        return numberOfTheAccaunt;
    }

    public void accauntBlocking()
    {
        System.out.println("Счёт номер =  " + getNumberOfTheAccaunt());
        if (this.numberOfTheAccaunt == 0) System.out.println("Аккаунт уже заблокирован");
        else
        {
            tempNumberOfTheAccaunt = this.numberOfTheAccaunt;
            this.numberOfTheAccaunt = 0;
            System.out.println("Аккаунт заблакирован ");
        }
    }

    public void accauntUnBlocking()
    {
        System.out.println("Счёт номер =  " + getNumberOfTheAccaunt());
        if (this.numberOfTheAccaunt == 0)
        {
            this.numberOfTheAccaunt = tempNumberOfTheAccaunt;
            System.out.println("Аккаунт разблакирован ");
        }
        else System.out.println("Аккаунт не заблокирован");
    }

    public int getAllMoney()
    {
        return getAllMoney;
    }

    public int getGetAllMoneyBalancePlus()
    {
        return getAllMoneyPlus;
    }

    public int getGetAllMoneyBalanceMinus()
    {
        return getAllMoneyMinus;
    }




}
