package com.javarush.test;

/**
 * Created by Drake on 18.10.2015.
 */
public class Cycle {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        Boolean bool = (a > b);

        if ((bool.toString()).length() > 4) {
            System.out.println("a > b");
        }
    }
}
