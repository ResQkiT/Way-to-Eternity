package org.resk.lesson4.solution32;

public class MoldovianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 55;
    }
    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + "Моя страна - Молдовия. Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
