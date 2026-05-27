package com.tochicodes.Q1;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Lazy
        System.out.println("Creating three instances of Lazy Singleton...");
        LazySingletonAssignment3.getInstance(1);
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance(2);
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance(3);
        System.out.println();

        // Eager
        System.out.println("Creating three instances of Eager Singleton...");
        EagerSingletonAssignment3.getInstance(1);
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance(2);
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance(3);
    }

}
/*The output of the client code execution is given below. You'll get a similar output with different timestamps. This output displays the difference in instance creation time between the Lazy and Eager approaches.
Creating three instances of Lazy Singleton...
Instance created at:6:49:09:38
Instance created at:6:49:11:49
Instance created at:6:49:13:56

Creating three instances of Eager Singleton...
Instance created at:6:49:13:60
Instance created at:6:49:13:60
Instance created at:6:49:13:60*/

