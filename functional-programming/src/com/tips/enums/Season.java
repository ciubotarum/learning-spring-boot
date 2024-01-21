package com.tips.enums;

enum Season {
//    WINTER, SPRING, SUMMER, FALL;
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    private int value;
    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}