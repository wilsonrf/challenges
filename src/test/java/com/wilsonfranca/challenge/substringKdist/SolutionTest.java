package com.wilsonfranca.challenge.substringKdist;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by wilson on 28/01/18.
 */
public class SolutionTest {

    @Test
    public void testIfHasDistinctKChars() {
        Solution solution = new Solution();
        boolean distinct = solution.hasDistinctChars("abcd");
        assertTrue(distinct);
    }
}
