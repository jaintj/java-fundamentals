package com.examples.lambdas;

import java.util.List;

public class PrintCubesOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,21,4324,34,11,1,3,5);
        printCubesOfOddNumbers(numbers);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num * num)
                .forEach(System.out::println);
    }
}
