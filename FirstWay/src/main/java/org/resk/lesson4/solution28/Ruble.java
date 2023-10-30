package org.resk.lesson4.solution28;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName(){
        return "RUB";
    }
}
