package com.company;

import java.util.Comparator;
import java.util.List;

public class StreamMain {
    List<Integer> intList;

    public StreamMain(List<Integer> intList) {
        this.intList = intList;
    }

    public void streamSort() {
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}