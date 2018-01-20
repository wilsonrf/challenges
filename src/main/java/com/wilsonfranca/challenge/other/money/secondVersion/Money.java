package com.wilsonfranca.challenge.other.money.secondVersion;

import java.util.Currency;

/**
 * Created by wilson on 20/01/18.
 */
public class Money {

    private final Double amount;
    private final Currency currency;

    public Money(final double amount, final String currencyCode) {
        if(currencyCode == null || currencyCode.trim() == "") {
            throw new IllegalArgumentException("Currency code can't be null");
        }
        this.amount = amount;
        this.currency = Currency.getInstance(currencyCode);
    }

    private Money(final double amount, final Currency currency) {
        if(currency == null) {
            throw new IllegalArgumentException("Currency can't be null");
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != null ? !amount.equals(money.amount) : money.amount != null) return false;
        return currency != null ? currency.equals(money.currency) : money.currency == null;

    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
