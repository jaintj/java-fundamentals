package com.examples.lambdas;

import java.util.Comparator;
import java.util.List;

public class SortStringsOnLength {
    public static void main(String[] args) {
        List<String> names = List.of("Mahindra", "Adani", "Ambani", "Tata", "Birla", "Usafali", "Vembu");
        printSortedNamesOnLength(names);
    }

    private static void printSortedNamesOnLength(List<String> names) {
        names.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

}
