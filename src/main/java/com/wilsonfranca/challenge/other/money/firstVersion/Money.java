package com.wilsonfranca.challenge.other.money.firstVersion;

/**
 * Created by wilson on 19/01/18.
 */
public class Money {

    private final Double amount;
    private final String currency;

    public Money(final double amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public static Money copy(final Money money) {
        Money copy = new Money(money.amount, money.currency);
        return copy;
    }

    public Money sum(final Money money) {

        if(this.currency.equals(money.currency)) {
            Double newAmount = this.amount + money.amount;
            return new Money(newAmount, money.currency);
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (((Money) obj).amount.equals(this.amount)
                && this.currency.equals(((Money)obj).currency)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
