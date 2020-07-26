package ProgrammingWithClasses.TheSimplestClassesAndObjects.Task8;

public class Customer
{
    //Methods methods = new Methods();

    int id;
    String surname;
    String name;
    String patronymic;
    String adress;
    String numberOfCreditCard;
    int bankAccauntNumber;

    Customer(int id, String surname, String name, String patronymic, String adress, String numberOfCreditCard, int bankAccauntNumber)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.numberOfCreditCard = numberOfCreditCard;
        this.bankAccauntNumber = bankAccauntNumber;
    }

    public int getId()
    {
        return id;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getName()
    {
        return name;
    }

    public String getPatronymic()
    {
        return patronymic;
    }

    public String getAdress()
    {
        return adress;
    }

    public String getNumberOfCreditCard()
    {
        return numberOfCreditCard;
    }

    public int getBankAccauntNumber()
    {
        return bankAccauntNumber;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public void setNumberOfCreditCard(String numberOfCreditCard)
    {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public void setBankAccauntNumber(int bankAccauntNumber)
    {
        this.bankAccauntNumber = bankAccauntNumber;
    }

    @Override
    public String toString()
    {
        return "id : " +id
                + " Фамилия : " + surname
                + " Имя " + name
                + " Отчество " + patronymic
                + " Адрес " + adress
                + " номер кредитной карты " + numberOfCreditCard
                + " номер счёта " + bankAccauntNumber;
    }
}
