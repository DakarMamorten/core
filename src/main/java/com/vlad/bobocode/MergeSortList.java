package com.vlad.bobocode;

import java.util.ArrayList;
import java.util.List;

public class MergeSortList<T extends Number> {

    public List<T> sorted(final List<T> list) {
        if (list.size() < 2) {
            return list;
        }
        int mid = list.size() / 2;
        return merged(
                sorted(list.subList(0, mid)),
                sorted(list.subList(mid, list.size()))
        );
    }

    private List<T> merged(final List<T> left, final List<T> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        final List<T> merged = new ArrayList<>();

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).doubleValue() < right.get(rightIndex).doubleValue()) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }
        }
        merged.addAll(left.subList(leftIndex, left.size()));
        merged.addAll(right.subList(rightIndex, right.size()));
        return merged;
    }
}
