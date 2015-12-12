package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 05
 * <p/>
 * Написать программу, которая вводит с клавиатуры строку текста. Программа должна вывести на экран две строки: <b/>
 * первая содержит только гласные, а вторая - только согласные буквы из введенной строки. <b/>
 * Пример ввода: <b/>
 * Мама мыла раму. <b/>
 * Пример вывода: <b/>
 * а а ы а а у <b/>
 * М м м л р м. <b/>
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String s = reader.readLine();
        String vowelStr = "";
        String consonantStr = "";
        char[] letters = s.toCharArray();

        for ( int i = 0; i < letters.length; i++ )
        {
            if ( letters[i] == ' ' )
            {
                continue;
            }
            if ( isVowel( letters[i] ) )
            {
                vowelStr += letters[i] + " ";
            }
            else
            {
                consonantStr += letters[i] + " ";
            }
        }

        vowelStr = vowelStr.trim();
        consonantStr = consonantStr.trim();

        System.out.println( vowelStr );
        System.out.println( consonantStr );
    }

    public static char[] vowels = new char[]{ 'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё' };

    //метод проверяет, гласная ли буква
    public static boolean isVowel( char c )
    {
        c = Character.toLowerCase( c ); //приводим символ в нижний регистр - от заглавных к строчным буквам

        for ( char d : vowels ) //ищем среди массива гласных
        {
            if ( c == d )
            {
                return true;
            }
        }
        return false;
    }
}