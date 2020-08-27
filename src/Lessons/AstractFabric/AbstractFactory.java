package Lessons.AstractFabric;

public interface AbstractFactory
{
    Animal getAnimal(String animalType) ;
    Color getColor(String colorType);
}
