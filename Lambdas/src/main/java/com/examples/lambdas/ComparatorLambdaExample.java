package com.examples.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("result of the comparator is :" + comparator.compare(4,4));

        // with lambda expression
        Comparator<Integer> comparator1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda is :" + comparator1.compare(3,4));

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda is :" + comparator2.compare(4,5));
    }
}
