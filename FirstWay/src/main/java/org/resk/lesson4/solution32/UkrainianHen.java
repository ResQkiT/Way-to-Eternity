package org.resk.lesson4.solution32;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }
    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + "Моя страна - Украина. Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
