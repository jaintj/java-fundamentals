package com.examples.lambdas;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,11,23,6,2,12,10,4,65);
        //printAllNumbers(numbers);
        //printEvenNumbers(numbers);
        //printOddNumbers(numbers);
        printSquarsOfEvenNumbers(numbers);
    }

    private static void printSquarsOfEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(num -> num%2==0)
                .map(num -> num * num)
                .forEach(System.out::println);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(num->num%2!=0).forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter((num)-> num%2==0)
                .forEach(System.out::println);
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }
}
