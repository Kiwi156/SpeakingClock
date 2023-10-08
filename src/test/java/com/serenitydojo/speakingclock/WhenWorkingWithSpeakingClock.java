package com.serenitydojo.speakingclock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithSpeakingClock {


    @Test
    public void checkingTheSpeakingClock() {

        assertThat(new SpeakingClock(1, 00).getExpectedOutPut()).isEqualTo("It's one");

        assertThat(new SpeakingClock(9, 30).getExpectedOutPut()).isEqualTo("It's half past nine");

    }

    @Test
    public void everyValidCombinationHasAnOutput() {
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 24; j++) {
                assertThat(new SpeakingClock(j, i).getExpectedOutPut()).isNotEmpty();
            }
        }
    }



    @Test
    public void checkTheCurrentSystemTimeIsNotNull() {
        LocalTime systemTime = LocalTime.now();

        // System.out.println(systemTime);

        Assertions.assertThat(systemTime).isNotNull();

    }

    @Test
    public void checkTheTimeAgainstAnEarlierTime() {
        LocalTime localTime = LocalTime.now();
        LocalTime fourHoursAgo = LocalTime.now().minus(4, ChronoUnit.HOURS);
        int hourTimeFoursAgo = fourHoursAgo.getHour();

        // System.out.println(fourHoursAgo);

        Assertions.assertThat(fourHoursAgo).isBefore(localTime);
    }

    @Test
    public void comparingTimes() {
        LocalTime nineOClock = LocalTime.of(9, 00);
        LocalTime elevenOClock = LocalTime.of(11, 00);
        LocalTime twelveOClock = LocalTime.of(12, 00);

        Assertions.assertThat(twelveOClock).isAfter(elevenOClock);
        Assertions.assertThat(nineOClock).isBefore(elevenOClock);
    }

    @Test
    public void checkTheMinutesTime() {
        LocalTime localTime = LocalTime.now();
        int tellTheMinutesTime = localTime.getMinute();
       // System.out.println(tellTheMinutesTime);

        Assertions.assertThat(tellTheMinutesTime).isStrictlyBetween(0, 60);
        Assertions.assertThat(tellTheMinutesTime).isNotNull();
    }


    @Test
    public void workingWithSpeakingClockTellTheTime() {
        LocalTime localTime = LocalTime.now();

       // System.out.println(localTime);

       // assertThat(new SpeakingClock(localTime)).getExpectedOutPut.




        //@Test
        // public void whenTimeIsCloserToNextHour() {

        //   LocalTime localTime = LocalTime.now();
        //   int tellHourTime = localTime.getHour();
        //System.out.println("Hours:" + tellHourTime);
        // int timeCloserToNextHour = tellHourTime;

        // LocalTime localTimeNow = LocalTime.now();
        //  int tellTheMinutesTime = localTimeNow.getMinute();
        //System.out.println("Minutes:" + tellTheMinutesTime);


        //   if (tellTheMinutesTime > 44) {
        //     timeCloserToNextHour = timeCloserToNextHour + 1;
        //  } else {
        //   System.out.println(tellHourTime);
//        }
        // System.out.println(timeCloserToNextHour);


        // Getting message based on the local time.

        //String startOfTimeMessage = String.valueOf((minutesTime.get(tellTheMinutesTime)));

        // String endTimeMessage = String.valueOf((theTime.get(timeCloserToNextHour)));

        // Assertions.assertThat(endTimeMessage).isNotEmpty();


    }

}



