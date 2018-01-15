package com.wilsonfranca.challenge.evaluate.array;

import com.wilsonfranca.challenge.evaluate.array.Calc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wilson.franca on 15/01/18.
 */
public class CalcTest {

    Calc calc;

    @Before
    public void before() {
        calc = new Calc();
    }

    @Test
    public void shouldEvaluateSimpleSum() {
        assertEquals(3, calc.evaluate("2 1 +"), 0);
    }

    @Test
    public void shouldEvaluateSimpleSubtraction() {
        assertEquals(1, calc.evaluate("3 2 -"), 0);
    }

    @Test
    public void shouldEvaluateSimpleMultiply() {
        assertEquals(25, calc.evaluate("5 5 *"), 0);
    }

    @Test
    public void shouldEvaluateSimpleDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test
    public void shouldEvaluateAComplexExpression() {
        assertEquals(6, calc.evaluate("7 4 5 + * 3 - 10 /"), 0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotEvaluateInvalidExpression() {
        calc.evaluate("5 1+");
    }

    @Test
    public void shouldAcceptFloats() {
        assertEquals(6, calc.evaluate("6.0"), 0);
    }

    @Test
    public void shouldReturnZeroToEmpty() {
        assertEquals(0, calc.evaluate(" "), 0);
    }
}
