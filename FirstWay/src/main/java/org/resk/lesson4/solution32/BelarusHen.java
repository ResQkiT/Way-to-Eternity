package org.resk.lesson4.solution32;

public class BelarusHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 666;
    }
    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + "Моя страна - Белорусь. Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
