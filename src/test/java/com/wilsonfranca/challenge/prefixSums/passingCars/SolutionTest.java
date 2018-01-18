package com.wilsonfranca.challenge.prefixSums.passingCars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wilson.franca on 18/01/18.
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test(expected = RuntimeException.class)
    public void shouldNoAllowArraySizeLessThanOne() {
        solution.solution(new int[0]);
    }

    @Test
    public void shouldReturnMinusOneForArraySizeGreaterThanOneHundredThousands() {
        assertEquals(-1, solution.solution(new int[100001]));
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowIfAnyElementOnArrayThatIsNotOneOrZero() {
        int[] array = {0, 1, 1, 2};
        solution.solution(array);
    }

    @Test
    public void shouldReturnZeroIfAllTheCarsAreInTheSameDirection() {
        int[] arrayOnes = {1, 1, 1, 1};
        int[] arrayZeros = {0, 0, 0, 0};

        assertEquals(0, solution.solution(arrayOnes));
        assertEquals(0, solution.solution(arrayZeros));
    }

    @Test
    public void shouldReturnOneForOneCarGoingWest() {
        int[] arrayOnes = {0, 1, 0, 0};

        assertEquals(1, solution.solution(arrayOnes));
    }

    @Test
    public void shouldReturnTwoForTwoCarsGoingWest() {
        int[] array = {0, 1, 1, 0, 0 };

        assertEquals(2, solution.solution(array));
    }

    @Test
    public void shouldReturnFiveForThreeCarsGoingWestThreeEast() {
        int[] array = {0, 1, 0, 1, 1 };

        assertEquals(5, solution.solution(array));
    }

    @Test
    public void shouldReturnFourForFourCarsGoingWestOneEast() {
        int[] array = {0, 0, 0, 0, 1 };

        assertEquals(4, solution.solution(array));
    }
}
