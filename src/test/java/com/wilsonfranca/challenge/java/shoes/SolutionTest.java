package com.wilsonfranca.challenge.java.shoes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by wilson on 20/03/18.
 */
public class SolutionTest {



    @Test
    public void testIfShoesOnLineAreRLRLRLAndIntervalIs3() {
        Solution solution = new Solution();
        assertEquals(solution.solution("RLRLRL"), 3);
    }

    @Test
    public void testIfShoesOnLineAreRRLRLLAndIntervalIs1() {
        Solution solution = new Solution();
        assertEquals(solution.solution("RRLRLL"), 1);
    }

    @Test
    public void testIfShoesOnLineAreRLRRLLRRLRLLAndIntervalIs3() {
        Solution solution = new Solution();
        assertEquals(solution.solution("RLRRLLRRLRLL"), 3);
    }
}
