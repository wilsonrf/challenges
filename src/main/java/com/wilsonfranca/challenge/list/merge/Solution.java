package com.wilsonfranca.challenge.list.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wilson.franca on 21/02/18.
 */
public class Solution {

    /**
     * [3,4,7,8,9]
     * [1,2,5,6,10,11,12]
     * [1,2,3,4,5,6,7,8,9,10,11,12]
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {

        List<Integer> resultList = new ArrayList<>();

        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        Integer i = iterator1.hasNext() ? iterator1.next() : null;
        Integer j = iterator2.hasNext() ? iterator2.next() : null;

        while (i != null || j != null) {
            if (j == null || (i != null && i.compareTo(j) <= 0)){
                resultList.add(i);
                i = (iterator1.hasNext() ? iterator1.next() : null);
            } else {
                resultList.add(j);
                j = (iterator2.hasNext() ? iterator2.next() : null);
            }
        }

        return resultList;
    }
}
