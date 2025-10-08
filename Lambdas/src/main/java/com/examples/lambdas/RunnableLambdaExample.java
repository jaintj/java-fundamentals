package com.examples.lambdas;

/**
 * Example that shows how Runnable interface was used in pre java 8 and how lambda made it very simple to use
 * Pre java 8, we had to implement anonymous classes for implementing the single interface method run()
 *
 */

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
        //  { } is required only when there are multiple lines of code with in the lambda.
        //  If only single line is there, we can avoid putting {}
        Runnable runnableLambda2 = () -> System.out.println("inside lambda runnable 2");
        new Thread(runnableLambda2).start();

        new Thread(() -> System.out.println("inside lambda runnable 3")).start();
    }

}
