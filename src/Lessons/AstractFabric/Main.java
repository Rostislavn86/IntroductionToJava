package Lessons.AstractFabric;

public class Main
{
    public static void main(String[] args)
    {
//    AbstractFactory abstractFactory = new AbstractFactory()
//
//    {
//        @Override
//        public Animal getAnimal(String animalType)
//        {
//            return null;
//        }
//
//        @Override
//        public Color getColor(String colorType)
//        {
//            return null;
//        }
//    };
//
//    abstractFactory.getAnimal("asda");

        FactoryProvider factoryProvider = new FactoryProvider();

        FactoryProvider.getFactory("Animal").getAnimal("Dog");

    }
}
