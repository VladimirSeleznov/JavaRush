package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String surname;
        int age;
        Human father;
        Human mother;
        boolean sex;

        public Human(String name, String surname, int age, Human father, Human mother, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, Human father, Human mother)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(boolean sex, String surname)
        {
            this.sex = sex;
            this.surname = surname;
        }

        public Human(Human father, Human mother, boolean sex)
        {
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }

        public Human(int age, Human father, Human mother, boolean sex)
        {
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }

        public Human(String surname, int age, Human father, Human mother, boolean sex)
        {
            this.surname = surname;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String surname)
        {

            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, Human father)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.father = father;
        }
    }
}
