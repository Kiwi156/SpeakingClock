package com.serenitydojo.speakingclock;

public class SpeakingClockHours {
    private final String expectedOutput;

    public SpeakingClockHours(int hour) {

        switch (hour) {
            case 1, 13 -> {
                this.expectedOutput = "one";
            }
            case 2, 14 -> {
                this.expectedOutput = "two";
            }
            case 3, 15 -> {
                this.expectedOutput = "three";
            }
            case 4, 16 -> {
                this.expectedOutput = "four";
            }
            case 5, 17 -> {
                this.expectedOutput = "five";
            }
            case 6, 18 -> {
                this.expectedOutput = "six";
            }
            case 7, 19 -> {
                this.expectedOutput = "seven";
            }
            case 8, 20 -> {
                this.expectedOutput = "eight";
            }
            case 9, 21 -> {
                this.expectedOutput = "nine";
            } 
            case 10, 22 -> {
                this.expectedOutput = "ten";
            }
            case 11, 23 -> {
                this.expectedOutput = "eleven";
            }
            case 0, 12, 24 -> {
                this.expectedOutput = "twelve";
            }

            default -> {
              throw new IllegalArgumentException();
            }
        }


    }

    public String expectedOutput() {
        return " " + expectedOutput+ ".";
    }

    @Override
    public String toString() {
        return "SpeakingClockHours{" +
                ", expectedOutput='" + expectedOutput + '\'' +
                '}';
    }
}
