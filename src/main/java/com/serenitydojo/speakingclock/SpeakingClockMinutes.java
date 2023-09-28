package com.serenitydojo.speakingclock;

public class SpeakingClockMinutes {

    public final String expectedOutput;

    public SpeakingClockMinutes(int minutes) {

        switch (minutes) {
            case 0  -> {
                this.expectedOutput = "It's ";
            }case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 -> {
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
    }

    public String expectedOutput() {
        return expectedOutput;
    }
}


