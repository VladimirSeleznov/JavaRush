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
        int age;
        int height;
        int weight;
        String firstName;
        String lastName;
        boolean sex;

        public Human(int age, int height, int weight, String firstName, String lastName, boolean sex) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(int age, int height, int weight, String firstName, String lastName) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(int age, int height, int weight, String firstName) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.firstName = firstName;
        }

        public Human(int age, int height, int weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String lastName) {
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(int age, String firstName, String lastName) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
