package Lessons.Enum;

public enum Animal
{
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    //new DOF("собака")

    private String tranlation;

    private Animal(String tranlation)
    {
    this.tranlation = tranlation;
    }

    public String getTranlation()
    {
        return tranlation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tranlation='" + tranlation + '\'' +
                '}';
    }
}
