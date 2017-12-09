package com.math;

public class PositiveInteger {
    private int value;

    public PositiveInteger(int value) {
        if (value <= 0) throw new IllegalArgumentException("A Positive Integer cannot be lower than 1");
        this.value = value;
    }

    public int getValue() { return value; }
}
