package com.javarush.test.level09.lesson08.task04;

import java.io.IOException;
import java.rmi.RemoteException;

/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/


/* Решение очень странное и самостоятельно до него додуматься сложно.
Часть кода, как выясняется, просто не работает.
а третий catch даже не надо создавать.
 */
public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj)
    {

        try
        {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (NoSuchFieldException e){
            System.out.println(e);
        }

        //всё-задача принята сервером

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}