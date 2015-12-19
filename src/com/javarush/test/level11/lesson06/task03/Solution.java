package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public class Animal
    {
        String type;
        String name;
        int age;
    }

    public class Cow extends Animal
    {
        void say (){
            System.out.println("Moo");
        }
    }

    public class Pig extends Animal
    {
        void say (){
            System.out.println("Hru");
        }
    }

    public class Sheep extends Animal
    {
        void say (){
            System.out.println("Mee");
        }
    }

    public class Bull extends Animal
    {
        void say (){
            System.out.println("Hz");
        }
    }

    public class Goat extends Animal
    {
        void say (){
            System.out.println("Bee");
        }
    }

}
