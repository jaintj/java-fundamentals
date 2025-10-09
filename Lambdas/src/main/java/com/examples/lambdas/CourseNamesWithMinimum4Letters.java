package com.examples.lambdas;

import java.util.List;

public class CourseNamesWithMinimum4Letters {
    public static void main(String[] args) {
        List<String> courseNames = List.of("Java", "Sql", "Html", "Microservices", "Artificial Intelligence", "Python", "Linux");
        printCourseNamesWithMinimum4Letters(courseNames);
    }

    private static void printCourseNamesWithMinimum4Letters(List<String> courseNames) {
        courseNames.stream()
                .filter(name -> name.length() >= 7)
                .forEach(System.out::println);
    }
}
