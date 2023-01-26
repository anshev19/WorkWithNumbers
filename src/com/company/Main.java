package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void main(String[] args) {
        List<Integer> resIntList = new ArrayList<>();
        for (int i : intList) {
            if (i > 0 && i % 2 == 0)
                resIntList.add(i);
        }
        resIntList.sort(Comparator.naturalOrder());
        System.out.println(resIntList);
    }
}
