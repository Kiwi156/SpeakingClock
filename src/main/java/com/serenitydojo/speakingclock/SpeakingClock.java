package com.serenitydojo.speakingclock;

public class SpeakingClock {
    private final int hour;
    private final int minutes;
    private String expectedOutput;

    public String getExpectedOutPut(){
        return expectedOutput;
    }
    public SpeakingClock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
        expectedOutput = null;


        switch (minutes) {
            case 0 -> {
                this.expectedOutput = "It's ";
            }
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 -> {
                this.expectedOutput = "It's just after ";
            }
            case 15 -> {
                this.expectedOutput = "It's quarter past ";
            }
            case 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 -> {
                this.expectedOutput = "It's just after quarter past ";
            }
            case 30 -> {
                this.expectedOutput = "It's half past ";
            }
            case 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 -> {
                this.expectedOutput = "It's just after half past ";
            }
            case 45 -> {
                this.expectedOutput = "It's quarter to ";
            }
            case 46, 47, 48, 49, 50 -> {
                this.expectedOutput = "It's just after quarter to ";
            }
            case 51, 52, 53, 54, 55, 56, 57, 58, 59 -> {
                this.expectedOutput = "It's nearly ";
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
        switch (hour) {
            case 1, 13 -> {
                this.expectedOutput += "one";
            }
            case 2, 14 -> {
                this.expectedOutput += "two";
            }
            case 3, 15 -> {
                this.expectedOutput += "three";
            }
            case 4, 16 -> {
                this.expectedOutput += "four";
            }
            case 5, 17 -> {
                this.expectedOutput += "five";
            }
            case 6, 18 -> {
                this.expectedOutput += "six";
            }
            case 7, 19 -> {
                this.expectedOutput += "seven";
            }
            case 8, 20 -> {
                this.expectedOutput += "eight";
            }
            case 9, 21 -> {
                this.expectedOutput += "nine";
            }
            case 10, 22 -> {
                this.expectedOutput += "ten";
            }
            case 11, 23 -> {
                this.expectedOutput += "eleven";
            }
            case 0, 12, 24 -> {
                this.expectedOutput += "twelve";
            }

            default -> {
                throw new IllegalArgumentException();
            }

        }
    }
}