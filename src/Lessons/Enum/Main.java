package Lessons.Enum;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args)
    {
    Animal animal = Animal.CAT;
    Animal animal2 = Animal.CAT;
    System.out.println(animal.getTranlation());
        System.out.println(animal.toString());

        if(animal.equals(animal2)) System.out.println("True");

    switch (animal)
    {
        case CAT:
            System.out.println("Cat");
            break;
        case DOG:
            System.out.println("Dog");
            break;
    }

    Season season = Season.SUMMER;

    switch (season)
    {
        case AUTOM:
            System.out.println("Aut");
            break;
        case SUMMER:
            System.out.println("Summer");
            break;
    }
    }


}
