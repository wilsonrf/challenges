package com.wilsonfranca.challenge.other.money.secondVersion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wilson on 19/01/18.
 */
public class MoneyTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNullCurrencyCode() {
        Money money = new Money(10, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowEmptyCurrencyCode() {
        Money money = new Money(10, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowWhitheCharCurrencyCode() {
        Money money = new Money(10, "    ");
    }

    @Test
    public void shouldCopyTheMoney() {
        Money tenUsd = new Money(10, "USD");
        assertEquals(Money.copy(tenUsd), tenUsd);
    }

    @Test
    public void shouldPrintTextRepresentationOfMoney() {
        Money tenEur = new Money(10, "EUR");
        assertEquals(tenEur.toString(), "10.0 EUR");
    }

    @Test
    public void shouldSumTwoMoneys() {
        Money tenEur = new Money(10, "EUR");
        Money fiveEur = new Money(5.3512, "EUR");
        Money result = new Money(15.3512, "EUR");
        assertEquals(tenEur.sum(fiveEur), result);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowSumTwoMoneysOfDifferentCurrencies() {
        Money tenEur = new Money(10, "EUR");
        Money fiveUsd = new Money(5.3512, "USD");
        tenEur.sum(fiveUsd);
    }
}
