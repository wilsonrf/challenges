package com.wilsonfranca.challenge.java.gambling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wilson on 18/03/18.
 */
public class SolutionTest {


    @Test
    public void johnWon2CoinsPlayed0AllInsAndPlayed1Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(2, 0), 1);

    }

    @Test
    public void johnWon8CoinsPlayed0AllInsAndPlayed7Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(8, 0), 7);
    }

    @Test
    public void johnWon18CoinsPlayed2AllInsAndPlayed6Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(18, 2), 6);
    }

    @Test
    public void johnWon10CoinsPlayed10AllInsAndPlayed4Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(10, 10), 4);
    }

    @Test
    public void johnWon3CoinsPlayed0AllInsAndPlayed2Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(3, 0), 2);
    }

    @Test
    public void johnWon6CoinsPlayed1AllInsAndPlayed4Rounds() {

        Solution solution = new Solution();

        assertEquals(solution.solution(6, 1), 3);
    }

}
