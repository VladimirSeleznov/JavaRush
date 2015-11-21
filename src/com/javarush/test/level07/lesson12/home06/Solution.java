package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human oldVasya = new Human("Vasya",true,60,null,null);
        Human oldSasha = new Human("Sasha",true,66,null,null);
        Human oldMasha = new Human("Masha",false,62,null,null);
        Human oldDasha = new Human("Dasha",false,61,null,null);
        Human notOldVasha = new Human("Vasha",true,40,oldVasya,oldMasha);
        Human notOldDasha = new Human("Dashka",false,37,oldSasha,oldDasha);
        Human veryNotOldPetya = new Human("Petya",true,12,notOldVasha,notOldDasha);
        Human veryNotOldBedya = new Human("Bedya",true,14,notOldVasha,notOldDasha);
        Human veryNotOldSuka = new Human("Suka",false,12,notOldVasha,notOldDasha);

        System.out.println(oldDasha);
        System.out.println(oldMasha);
        System.out.println(oldSasha);
        System.out.println(oldVasya);
        System.out.println(notOldDasha);
        System.out.println(notOldVasha);
        System.out.println(veryNotOldBedya);
        System.out.println(veryNotOldPetya);
        System.out.println(veryNotOldSuka);

    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, Boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
