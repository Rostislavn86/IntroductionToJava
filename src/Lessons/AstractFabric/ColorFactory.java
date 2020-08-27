package Lessons.AstractFabric;

public class ColorFactory implements AbstractFactory
{
    public Animal getAnimal(String animalType)
    {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType))
        {
            return new Duck();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException();
    }
}
