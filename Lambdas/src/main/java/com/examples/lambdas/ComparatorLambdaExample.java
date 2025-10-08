package com.examples.lambdas;

import java.util.Comparator;

/**
 * Example that shows how Comparator interface was used in pre java 8 and how lambda made it very simple to use
 * Pre java 8, we had to implement anonymous classes for implementing the single interface method compare()
 *
 */
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

        // with lambda expression - compare() is implemented as lambda expression
        Comparator<Integer> comparator1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda is :" + comparator1.compare(3,4));

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda is :" + comparator2.compare(4,5));
    }
}
