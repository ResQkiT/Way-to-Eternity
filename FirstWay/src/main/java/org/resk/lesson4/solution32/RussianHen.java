package org.resk.lesson4.solution32;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + "Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
