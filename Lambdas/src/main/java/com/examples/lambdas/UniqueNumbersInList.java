package com.examples.lambdas;

import java.util.List;

public class UniqueNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,1,11,12,2,1,3,2,4,3,5,12);
        printUniqueNumbers(numbers);
    }

    private static void printUniqueNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
