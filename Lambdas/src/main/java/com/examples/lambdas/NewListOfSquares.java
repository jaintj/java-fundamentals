package com.examples.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class NewListOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        List<Integer> squareList = getSquarsList(numbers);
        System.out.println(squareList);
    }

    private static List<Integer> getSquarsList(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
