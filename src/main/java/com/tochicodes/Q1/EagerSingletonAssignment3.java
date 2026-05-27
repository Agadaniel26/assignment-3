package com.tochicodes.Q1;

public class EagerSingletonAssignment3 {

    private static final EagerSingletonAssignment3[] instances = {
            new EagerSingletonAssignment3(),
            new EagerSingletonAssignment3(),
            new EagerSingletonAssignment3()
    };

    private final Assignment3 assignment3;

    private EagerSingletonAssignment3() {
        assignment3 = new Assignment3();
    }

    public static EagerSingletonAssignment3 getInstance(int index) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("Index must be between 1 and 3");
        }
        return instances[index - 1];
    }
    public Assignment3 getAssignment3() {
        return assignment3;
    }
}
