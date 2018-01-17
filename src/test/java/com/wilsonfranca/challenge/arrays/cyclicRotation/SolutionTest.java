package com.wilsonfranca.challenge.arrays.cyclicRotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wilson.franca on 16/01/18.
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test(expected = RuntimeException.class)
    public void rotationShouldNotBeLessThanZero() {
        solution.solution(new int[3], -1);
    }

    @Test
    public void rotationShouldBeGreaterThanZero() {
        assertNotNull(solution.solution(new int[3], 1));
    }

    @Test(expected = RuntimeException.class)
    public void rotationShouldNotBeGreaterThan100() {
        solution.solution(new int[3], 101);
    }

    @Test(expected = RuntimeException.class)
    public void allElementsMustBeGreaterThanMinus1000() {
        int[] ints = {1, 2, 100, -2000};
        solution.solution(ints, 2);
    }

    @Test(expected = RuntimeException.class)
    public void allElementsMustBeLessThan1000() {
        int[] ints = {1, 2, 100, 2000};
        solution.solution(ints, 2);
    }

    @Test
    public void shouldRotateOneElementToRight() {
        int[] ints = {1, 22, 100, 54};
        int[] output = {54, 1, 22, 100};
        assertArrayEquals(output, solution.solution(ints, 1));
    }

    @Test
    public void shouldRotateTwoElementToRight() {
        int[] ints = {1, 22, 100, 54};
        int[] output = {100, 54, 1, 22};
        assertArrayEquals(output, solution.solution(ints, 2));
    }

    @Test
    public void shouldDoFullRotationToRight() {
        int[] ints = {1, 22, 100, 54};
        int[] output = {1, 22, 100, 54};
        assertArrayEquals(output, solution.solution(ints, 4));
    }

    @Test
    public void shouldDoMoreThanFullRotationToRight() {
        int[] ints = {1, 22, 100, 54};
        int[] output = {100, 54, 1, 22};
        assertArrayEquals(output, solution.solution(ints, 6));
    }

    @Test
    public void shouldDoMaxRotations() {
        int[] ints = {1, 22, 100, 54};
        int[] output = {22, 100, 54, 1};
        assertArrayEquals(output, solution.solution(ints, 99));
    }
}
