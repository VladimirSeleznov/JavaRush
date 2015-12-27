package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution()
    {
    }
    public Solution(String s)
    {
    }
    public Solution(boolean b)
    {
    }
    private Solution(int i, int j)
    {
    }
    private Solution(String s, String a)
    {
    }
    private Solution(boolean b, boolean c)
    {
    }
    protected Solution(int i, String s)
    {
    }
    protected Solution(String s, boolean b)
    {
    }
    protected Solution(boolean b, int i)
    {
    }
    Solution(int i, boolean b)
    {
    }
    Solution(boolean b, String s)
    {
    }
    Solution(String s, int i)
    {
    }
}

