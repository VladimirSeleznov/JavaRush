package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Drake on 20.12.2015.
 */
class UkrainianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 4;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", UKRAINE, getCountOfEggsPerMonth());
    }
}
