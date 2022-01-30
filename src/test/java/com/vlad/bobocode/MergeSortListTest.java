package com.vlad.bobocode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortListTest {
    private List<Integer> integerList;
    private List<Double> doubleList;

    @BeforeEach
    void setUp() {
        integerList = List.of(36, 2, 30, 1, 19, 23, 4, 0, 12, 14, 32);
        doubleList = List.of(19.0, 23.3, 4.1, 0.5, 12.0);
    }

    @Test
    void when_unsorted_integers_then_return_sorted_list() {
        final MergeSortList<Integer> mergeSortList = new MergeSortList<>();
        final List<Integer> sortedList = mergeSortList.sorted(integerList);
        final List<Integer> expectedResult = List.of(0, 1, 2, 4, 12, 14, 19, 23, 30, 32, 36);

        assertEquals(sortedList, expectedResult);
    }

    @Test
    void when_unsorted_doubles_then_return_sorted_list() {
        final MergeSortList<Double> mergeSortList = new MergeSortList<>();
        final List<Double> sortedList = mergeSortList.sorted(doubleList);
        final List<Double> expectedResult = List.of(0.5, 4.1, 12.0, 19.0, 23.3);

        assertEquals(sortedList, expectedResult);
    }

    @Test
    void when_list_contains_one_element_then_should_return_the_same_list() {
        final MergeSortList<Integer> mergeSortList = new MergeSortList<>();
        final List<Integer> list = List.of(2);
        final List<Integer> sortedList = mergeSortList.sorted(list);

        assertEquals(list, sortedList);

    }
}