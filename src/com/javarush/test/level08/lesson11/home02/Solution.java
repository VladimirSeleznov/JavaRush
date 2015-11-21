package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        //printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        Cat cat1 = new Cat("vasya",11);
        Cat cat2 = new Cat("vetalya",7);
        Cat cat3 = new Cat("barsik",14);
        Cat cat4 = new Cat("hyyarsik",3);

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);


        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();

        Dog dog1 = new Dog("vasya",11);
        Dog dog2 = new Dog("vetalya",7);
        Dog dog3 = new Dog("barsik",14);

        result.add(dog1);
        result.add(dog2);
        result.add(dog3);


        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> pet = new HashSet<>();
        pet.addAll(cats);
        pet.addAll(dogs);
        return pet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets)
    {

        for (Object pet : pets) {
            System.out.println(pet);
        }

    }

    public static class Cat
    {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Dog
    {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
