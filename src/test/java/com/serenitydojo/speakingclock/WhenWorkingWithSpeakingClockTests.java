package com.serenitydojo.speakingclock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithSpeakingClockTests {


    @Test
    public void checkingTheSpeakingClock() {

        assertThat(new SpeakingClock(0, 0).getExpectedOutPut()).isEqualTo("It's midnight");

        assertThat(new SpeakingClock(1, 0).getExpectedOutPut()).isEqualTo("It's one");

        assertThat(new SpeakingClock(9, 30).getExpectedOutPut()).isEqualTo("It's half past nine");

        assertThat(new SpeakingClock(12, 0).getExpectedOutPut()).isEqualTo("It's midday");

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

        //System.out.println(systemTime);

        Assertions.assertThat(systemTime).isNotNull();

    }

    @Test
    public void checkTheTimeAgainstAnEarlierTime() {
        LocalTime localTime = LocalTime.now();
        LocalTime fourHoursAgo = LocalTime.now().minus(4, ChronoUnit.HOURS);
        int hourTimeFoursAgo = fourHoursAgo.getHour();

    //    System.out.println(fourHoursAgo);

        Assertions.assertThat(fourHoursAgo).isBefore(localTime);
    }

    @Test
    public void comparingTimes() {
        LocalTime nineOClock = LocalTime.of(9, 00);
        LocalTime elevenOClock = LocalTime.of(11, 00);

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
    public void whenTimeIsCloserToNextHour() {

        assertThat(new SpeakingClock(11, 51).getExpectedOutPut()).isEqualTo("It's nearly midday");

        assertThat(new SpeakingClock(15, 45).getExpectedOutPut()).isEqualTo("It's quarter to four");

    }
    }





