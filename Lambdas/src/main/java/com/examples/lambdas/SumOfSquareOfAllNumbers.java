package com.examples.lambdas;

import java.util.List;

public class SumOfSquareOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,32,34,12,15,3,5,7,6,90);
        System.out.println(printSumOfSquareOfAllNumbers(numbers));
    }

    private static Integer printSumOfSquareOfAllNumbers(List<Integer> numbers) {
        return numbers.stream().map(num->num * num)
                .reduce(0,Integer::sum);
    }
}
