package com.examples.lambdas;

import java.sql.SQLOutput;
import java.util.List;

public class SumWithReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 45,2,9,8,7);
        System.out.println(printSum(numbers));
    }

    /*private static Integer printSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,SumWithReduce::sum);
    }
*/
    /*private static Integer printSum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x,y)-> x+y);
    }*/

    private static Integer printSum(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    private static Integer sum(Integer a, Integer b) {
        return a + b;
    }

}
