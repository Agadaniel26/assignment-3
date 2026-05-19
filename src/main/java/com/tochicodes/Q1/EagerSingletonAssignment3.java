package com.tochicodes.Q1;

public class EagerSingletonAssignment3 {
    // All 3 instances are created immediately when the class is loaded,
    // before getInstance() is ever called
    private static final EagerSingletonAssignment3[] instances = {
            new EagerSingletonAssignment3(),
            new EagerSingletonAssignment3(),
            new EagerSingletonAssignment3()
    };

    private final Assignment3 assignment3;

    // Private constructor: creates the Assignment3 (prints timestamp)
    private EagerSingletonAssignment3() {
        assignment3 = new Assignment3();
    }

    // index is 1-based (1, 2, or 3)
    public static EagerSingletonAssignment3 getInstance(int index) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("Index must be between 1 and 3");
        }
        // Instance already exists; just return it
        return instances[index - 1];
    }

    public Assignment3 getAssignment3() {
        return assignment3;
    }
}
