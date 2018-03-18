package com.wilsonfranca.challenge.list.merge;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wilson.franca on 21/02/18.
 */
public class SolutionTest {

    @Test
    public void testIfMergeTwListsFirstSmallerThanTheSecond() {

        List<Integer> list1 = Arrays.asList(3,4,7,8,9);
        List<Integer> list2 = Arrays.asList(1,2,5,6,10,11,12);

        List<Integer> result = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

        assertEquals(result, Solution.merge(list1, list2));


    }

    @Test
    public void testIfMergeTwListsSecondSmallerThanTheFirst() {

        List<Integer> list2 = Arrays.asList(3,4,7,8,9);
        List<Integer> list1 = Arrays.asList(1,2,5,6,10,11,12);

        List<Integer> result = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

        assertEquals(result, Solution.merge(list1, list2));


    }
}
