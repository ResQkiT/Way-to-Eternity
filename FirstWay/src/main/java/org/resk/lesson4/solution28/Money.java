package org.resk.lesson4.solution28;

abstract class Money{
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyName() {
        return null;
    }
}