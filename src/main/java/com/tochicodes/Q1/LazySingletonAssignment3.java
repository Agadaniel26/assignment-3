package com.tochicodes.Q1;

public class LazySingletonAssignment3 {
    private static final LazySingletonAssignment3[] instances =
            new LazySingletonAssignment3[3];

    private final Assignment3 assignment3;

    private LazySingletonAssignment3() {
        assignment3 = new Assignment3();
    }

    public static LazySingletonAssignment3 getInstance(int index) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("Index must be between 1 and 3");
        }
        if (instances[index - 1] == null) {
            instances[index - 1] = new LazySingletonAssignment3();
        }
        return instances[index - 1];
    }

    public Assignment3 getAssignment3() {
        return assignment3;
    }
}
