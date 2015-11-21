package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static class Human
    {
        public static final boolean MALE = true;
        public static final boolean FEMALE = false;

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human( String name, boolean sex, int age )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human( String name, boolean sex, int age, ArrayList<Human> children )
        {
            this( name, sex, age );
            this.children.addAll( children );
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + ( this.sex ? "мужской" : "женский" );
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if ( childCount > 0 )
            {
                text += ", дети: " + this.children.get( 0 ).name;

                for ( int i = 1; i < childCount; i++ )
                {
                    Human child = this.children.get( i );
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

    public static void main( String[] args )
    {
        Human[] family = new Human[9];
        ArrayList<Human> childList = new ArrayList<Human>();

        family[0] = new Human( "Татьяна", Human.FEMALE, 16 );
        family[1] = new Human( "Вовочка", Human.MALE, 10 );
        family[2] = new Human( "Настя", Human.FEMALE, 5 );

        childList.add( family[0] );
        childList.add( family[1] );
        childList.add( family[2] );

        family[3] = new Human( "Veronika Ivanova", Human.FEMALE, 36, childList );
        family[4] = new Human( "Alexandr Ivanov", Human.MALE, 40, childList );

        childList = new ArrayList<Human>();
        childList.add( family[4] );

        family[5] = new Human( "Иосиф Виссарионович", Human.MALE, 92, childList );
        family[6] = new Human( "Изольда Тихоновна", Human.FEMALE, 79, childList );

        childList = new ArrayList<Human>();
        childList.add( family[3] );

        family[7] = new Human( "Борим Моисеевич", Human.MALE, 69, childList );
        family[8] = new Human( "Клара Захаровна", Human.FEMALE, 58, childList );

        for ( Human x : family )
        {
            System.out.println( x );
        }
    }

}