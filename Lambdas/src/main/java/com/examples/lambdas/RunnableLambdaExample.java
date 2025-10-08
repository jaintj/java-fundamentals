package com.examples.lambdas;

import java.sql.SQLOutput;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        // Prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };
        new Thread(runnable).start();

        // java 8 lambda implementation
        // () -> {};
        Runnable runnableLambda1 = () -> {
            System.out.println("inside lambda runnable 1");
        };
        new Thread(runnableLambda1).start();

        Runnable runnableLambda2 = () -> System.out.println("inside lambda runnable 2");
        new Thread(runnableLambda2).start();

        new Thread(() -> System.out.println("inside lambda runnable 3")).start();
    }

}
