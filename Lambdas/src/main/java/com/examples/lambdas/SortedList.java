package com.examples.lambdas;

import java.util.Comparator;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,1,11,12,2,1,3,2,4,3,5,12);
        //printSortedList(numbers);
        printSortedListInReverseOrder(numbers);
    }

    private static void printSortedListInReverseOrder(List<Integer> numbers) {
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void printSortedList(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);
    }
}
