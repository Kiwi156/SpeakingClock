package com.serenitydojo.speakingclock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class WhenWorkingWithSpeakingClock {
    SpeakingClockHours time0 = new SpeakingClockHours(0);
    SpeakingClockHours time1 = new SpeakingClockHours(1);
    SpeakingClockHours time2 = new SpeakingClockHours(2);
    SpeakingClockHours time3 = new SpeakingClockHours(3);
    SpeakingClockHours time4 = new SpeakingClockHours(4);
    SpeakingClockHours time5 = new SpeakingClockHours(5);
    SpeakingClockHours time6 = new SpeakingClockHours(6);
    SpeakingClockHours time7 = new SpeakingClockHours(7);
    SpeakingClockHours time8 = new SpeakingClockHours(8);
    SpeakingClockHours time9 = new SpeakingClockHours(9);
    SpeakingClockHours time10 = new SpeakingClockHours(10);
    SpeakingClockHours time11 = new SpeakingClockHours(11);
    SpeakingClockHours time12 = new SpeakingClockHours(12);

    SpeakingClockHours time13 = new SpeakingClockHours(13);

    SpeakingClockHours time14 = new SpeakingClockHours(14);

    SpeakingClockHours time15 = new SpeakingClockHours(15);

    SpeakingClockHours time16 = new SpeakingClockHours(16);

    SpeakingClockHours time17 = new SpeakingClockHours(17);

    SpeakingClockHours time18 = new SpeakingClockHours(18);

    SpeakingClockHours time19 = new SpeakingClockHours(19);

    SpeakingClockHours time20 = new SpeakingClockHours(20);

    SpeakingClockHours time21 = new SpeakingClockHours(21);

    SpeakingClockHours time22 = new SpeakingClockHours(22);

    SpeakingClockHours time23 = new SpeakingClockHours(23);

    SpeakingClockMinutes minutes0 = new SpeakingClockMinutes(0);

    SpeakingClockMinutes minutes1 = new SpeakingClockMinutes(1);

    SpeakingClockMinutes minutes2 = new SpeakingClockMinutes(2);

    SpeakingClockMinutes minutes3 = new SpeakingClockMinutes(3);

    SpeakingClockMinutes minutes4 = new SpeakingClockMinutes(4);

    SpeakingClockMinutes minutes5 = new SpeakingClockMinutes(5);

    SpeakingClockMinutes minutes6 = new SpeakingClockMinutes(6);

    SpeakingClockMinutes minutes7 = new SpeakingClockMinutes(7);

    SpeakingClockMinutes minutes8 = new SpeakingClockMinutes(8);

    SpeakingClockMinutes minutes9 = new SpeakingClockMinutes(9);

    SpeakingClockMinutes minutes10 = new SpeakingClockMinutes(10);

    SpeakingClockMinutes minutes11 = new SpeakingClockMinutes(11);

    SpeakingClockMinutes minutes12 = new SpeakingClockMinutes(12);

    SpeakingClockMinutes minutes13 = new SpeakingClockMinutes(13);

    SpeakingClockMinutes minutes14 = new SpeakingClockMinutes(14);

    SpeakingClockMinutes minutes15 = new SpeakingClockMinutes(15);

    SpeakingClockMinutes minutes16 = new SpeakingClockMinutes(16);

    SpeakingClockMinutes minutes17 = new SpeakingClockMinutes(17);

    SpeakingClockMinutes minutes18 = new SpeakingClockMinutes(18);

    SpeakingClockMinutes minutes19 = new SpeakingClockMinutes(19);

    SpeakingClockMinutes minutes20 = new SpeakingClockMinutes(20);

    SpeakingClockMinutes minutes21 = new SpeakingClockMinutes(21);

    SpeakingClockMinutes minutes22 = new SpeakingClockMinutes(22);

    SpeakingClockMinutes minutes23 = new SpeakingClockMinutes(23);

    SpeakingClockMinutes minutes24 = new SpeakingClockMinutes(24);

    SpeakingClockMinutes minutes25 = new SpeakingClockMinutes(25);

    SpeakingClockMinutes minutes26 = new SpeakingClockMinutes(26);

    SpeakingClockMinutes minutes27 = new SpeakingClockMinutes(27);

    SpeakingClockMinutes minutes28 = new SpeakingClockMinutes(28);

    SpeakingClockMinutes minutes29 = new SpeakingClockMinutes(29);

    SpeakingClockMinutes minutes30 = new SpeakingClockMinutes(30);

    SpeakingClockMinutes minutes31 = new SpeakingClockMinutes(31);

    SpeakingClockMinutes minutes32 = new SpeakingClockMinutes(32);

    SpeakingClockMinutes minutes33 = new SpeakingClockMinutes(33);

    SpeakingClockMinutes minutes34 = new SpeakingClockMinutes(34);

    SpeakingClockMinutes minutes35 = new SpeakingClockMinutes(35);

    SpeakingClockMinutes minutes36 = new SpeakingClockMinutes(36);


    SpeakingClockMinutes minutes37 = new SpeakingClockMinutes(37);


    SpeakingClockMinutes minutes38 = new SpeakingClockMinutes(38);

    SpeakingClockMinutes minutes39 = new SpeakingClockMinutes(39);


    SpeakingClockMinutes minutes40 = new SpeakingClockMinutes(40);


    SpeakingClockMinutes minutes41 = new SpeakingClockMinutes(41);

    SpeakingClockMinutes minutes42 = new SpeakingClockMinutes(42);

    SpeakingClockMinutes minutes43 = new SpeakingClockMinutes(43);

    SpeakingClockMinutes minutes44 = new SpeakingClockMinutes(44);

    SpeakingClockMinutes minutes45 = new SpeakingClockMinutes(45);

    SpeakingClockMinutes minutes46 = new SpeakingClockMinutes(46);

    SpeakingClockMinutes minutes47 = new SpeakingClockMinutes(47);

    SpeakingClockMinutes minutes48 = new SpeakingClockMinutes(48);

    SpeakingClockMinutes minutes49 = new SpeakingClockMinutes(49);

    SpeakingClockMinutes minutes50 = new SpeakingClockMinutes(50);

    SpeakingClockMinutes minutes51 = new SpeakingClockMinutes(51);

    SpeakingClockMinutes minutes52 = new SpeakingClockMinutes(52);

    SpeakingClockMinutes minutes53 = new SpeakingClockMinutes(53);

    SpeakingClockMinutes minutes54 = new SpeakingClockMinutes(54);

    SpeakingClockMinutes minutes55 = new SpeakingClockMinutes(55);

    SpeakingClockMinutes minutes56 = new SpeakingClockMinutes(56);

    SpeakingClockMinutes minutes57 = new SpeakingClockMinutes(57);

    SpeakingClockMinutes minutes58 = new SpeakingClockMinutes(58);

    SpeakingClockMinutes minutes59 = new SpeakingClockMinutes(59);


    @Test
    public void whenCreatingASpeakingClockHoursMessage() {

        Assertions.assertThat(time1.expectedOutput()).isEqualTo(" one.");

        assertThat(time6.expectedOutput()).isEqualTo(" six.");

        assertThat(time12.expectedOutput()).isEqualTo(" twelve.");

    }

    @Test
    public void whenCreatingASpeakingClockMinutesMessage() {

        assertThat(minutes0.expectedOutput()).isEqualTo("It's ");

        assertThat(minutes6.expectedOutput()).isEqualTo("It's just after ");

        assertThat(minutes59.expectedOutput()).isEqualTo("It's nearly ");

    }

    @Test
    public void findTheCurrentSystemTime() {
        LocalTime systemTime = LocalTime.now();
        //System.out.println(systemTime);

        Assertions.assertThat(systemTime).isNotNull();

    }


    @Test
    public void whenWorkingWithASpeakingClock() {
        LocalTime localTime = LocalTime.now();
        int tellHourTime = localTime.getHour();

        List<SpeakingClockHours> theTime = new ArrayList<>();

        theTime.add(time0);
        theTime.add(time1);
        theTime.add(time2);
        theTime.add(time3);
        theTime.add(time4);
        theTime.add(time5);
        theTime.add(time6);
        theTime.add(time7);
        theTime.add(time8);
        theTime.add(time9);
        theTime.add(time10);
        theTime.add(time11);
        theTime.add(time12);
        theTime.add(time13);
        theTime.add(time14);
        theTime.add(time15);
        theTime.add(time16);
        theTime.add(time17);
        theTime.add(time18);
        theTime.add(time19);
        theTime.add(time20);
        theTime.add(time21);
        theTime.add(time22);
        theTime.add(time23);


    //      System.out.println(tellHourTime);

    //     System.out.println(theTime.get(tellHourTime));

        Assertions.assertThat(tellHourTime).isStrictlyBetween(0, 25);
    }

    @Test
    public void usingTimes() {
        LocalTime localTime = LocalTime.now();
        LocalTime fourHoursAgo = LocalTime.now().minus(4, ChronoUnit.HOURS);
        int hourTimeFoursAgo = fourHoursAgo.getHour();

        List<SpeakingClockHours> theTime = new ArrayList<>();

        theTime.add(time0);
        theTime.add(time1);
        theTime.add(time2);
        theTime.add(time3);
        theTime.add(time4);
        theTime.add(time5);
        theTime.add(time6);
        theTime.add(time7);
        theTime.add(time8);
        theTime.add(time9);
        theTime.add(time10);
        theTime.add(time11);
        theTime.add(time12);
        theTime.add(time13);
        theTime.add(time14);
        theTime.add(time15);
        theTime.add(time16);
        theTime.add(time17);
        theTime.add(time18);
        theTime.add(time19);
        theTime.add(time20);
        theTime.add(time21);
        theTime.add(time22);
        theTime.add(time23);


    //    System.out.println(fourHoursAgo);

    //    System.out.println(theTime.get(hourTimeFoursAgo));

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
    public void tellTheMinutesTime() {
        LocalTime localTime = LocalTime.now();
        int tellTheMinutesTime = localTime.getMinute();
    //    System.out.println(tellTheMinutesTime);

        Assertions.assertThat(tellTheMinutesTime).isStrictlyBetween(0, 60);
    }

    @Test
    public void workingWithTheSpeakingClockToTellTheMinutesTime() {
        LocalTime localTime = LocalTime.now();
        int tellTheMinutesTime = localTime.getMinute();

        List<SpeakingClockMinutes> minutesTime = new ArrayList<>();
        minutesTime.add(minutes0);
        minutesTime.add(minutes1);
        minutesTime.add(minutes2);
        minutesTime.add(minutes3);
        minutesTime.add(minutes4);
        minutesTime.add(minutes5);
        minutesTime.add(minutes6);
        minutesTime.add(minutes7);
        minutesTime.add(minutes8);
        minutesTime.add(minutes9);
        minutesTime.add(minutes10);
        minutesTime.add(minutes11);
        minutesTime.add(minutes12);
        minutesTime.add(minutes13);
        minutesTime.add(minutes14);
        minutesTime.add(minutes15);
        minutesTime.add(minutes16);
        minutesTime.add(minutes17);
        minutesTime.add(minutes18);
        minutesTime.add(minutes19);
        minutesTime.add(minutes20);
        minutesTime.add(minutes21);
        minutesTime.add(minutes22);
        minutesTime.add(minutes23);
        minutesTime.add(minutes24);
        minutesTime.add(minutes25);
        minutesTime.add(minutes26);
        minutesTime.add(minutes27);
        minutesTime.add(minutes28);
        minutesTime.add(minutes29);
        minutesTime.add(minutes30);
        minutesTime.add(minutes31);
        minutesTime.add(minutes32);
        minutesTime.add(minutes33);
        minutesTime.add(minutes34);
        minutesTime.add(minutes35);
        minutesTime.add(minutes36);
        minutesTime.add(minutes37);
        minutesTime.add(minutes38);
        minutesTime.add(minutes39);
        minutesTime.add(minutes40);
        minutesTime.add(minutes41);
        minutesTime.add(minutes42);
        minutesTime.add(minutes43);
        minutesTime.add(minutes44);
        minutesTime.add(minutes45);
        minutesTime.add(minutes46);
        minutesTime.add(minutes47);
        minutesTime.add(minutes48);
        minutesTime.add(minutes49);
        minutesTime.add(minutes50);
        minutesTime.add(minutes51);
        minutesTime.add(minutes52);
        minutesTime.add(minutes53);
        minutesTime.add(minutes54);
        minutesTime.add(minutes55);
        minutesTime.add(minutes56);
        minutesTime.add(minutes57);
        minutesTime.add(minutes58);
        minutesTime.add(minutes59);


        //   System.out.println(tellTheMinutesTime);

      //  System.out.println(minutesTime.get(tellTheMinutesTime));
    }

    @Test
    public void workingWithSpeakingClockTellTheTime() {
        LocalTime localTime = LocalTime.now();
        int tellHourTime = localTime.getHour();

        List<SpeakingClockHours> theTime = new ArrayList<>();
        theTime.add(time0);
        theTime.add(time1);
        theTime.add(time2);
        theTime.add(time3);
        theTime.add(time4);
        theTime.add(time5);
        theTime.add(time6);
        theTime.add(time7);
        theTime.add(time8);
        theTime.add(time9);
        theTime.add(time10);
        theTime.add(time11);
        theTime.add(time12);
        theTime.add(time13);
        theTime.add(time14);
        theTime.add(time15);
        theTime.add(time16);
        theTime.add(time17);
        theTime.add(time18);
        theTime.add(time19);
        theTime.add(time20);
        theTime.add(time21);
        theTime.add(time22);
        theTime.add(time23);

        LocalTime localTimeNow = LocalTime.now();
        int tellTheMinutesTime = localTimeNow.getMinute();


        List<SpeakingClockMinutes> minutesTime = new ArrayList<>();
        minutesTime.add(minutes0);
        minutesTime.add(minutes1);
        minutesTime.add(minutes2);
        minutesTime.add(minutes3);
        minutesTime.add(minutes4);
        minutesTime.add(minutes5);
        minutesTime.add(minutes6);
        minutesTime.add(minutes7);
        minutesTime.add(minutes8);
        minutesTime.add(minutes9);
        minutesTime.add(minutes10);
        minutesTime.add(minutes11);
        minutesTime.add(minutes12);
        minutesTime.add(minutes13);
        minutesTime.add(minutes14);
        minutesTime.add(minutes15);
        minutesTime.add(minutes16);
        minutesTime.add(minutes17);
        minutesTime.add(minutes18);
        minutesTime.add(minutes19);
        minutesTime.add(minutes20);
        minutesTime.add(minutes21);
        minutesTime.add(minutes22);
        minutesTime.add(minutes23);
        minutesTime.add(minutes24);
        minutesTime.add(minutes25);
        minutesTime.add(minutes26);
        minutesTime.add(minutes27);
        minutesTime.add(minutes28);
        minutesTime.add(minutes29);
        minutesTime.add(minutes30);
        minutesTime.add(minutes31);
        minutesTime.add(minutes32);
        minutesTime.add(minutes33);
        minutesTime.add(minutes34);
        minutesTime.add(minutes35);
        minutesTime.add(minutes36);
        minutesTime.add(minutes37);
        minutesTime.add(minutes38);
        minutesTime.add(minutes39);
        minutesTime.add(minutes40);
        minutesTime.add(minutes41);
        minutesTime.add(minutes42);
        minutesTime.add(minutes43);
        minutesTime.add(minutes44);
        minutesTime.add(minutes45);
        minutesTime.add(minutes46);
        minutesTime.add(minutes47);
        minutesTime.add(minutes48);
        minutesTime.add(minutes49);
        minutesTime.add(minutes50);
        minutesTime.add(minutes51);
        minutesTime.add(minutes52);
        minutesTime.add(minutes53);
        minutesTime.add(minutes54);
        minutesTime.add(minutes55);
        minutesTime.add(minutes56);
        minutesTime.add(minutes57);
        minutesTime.add(minutes58);
        minutesTime.add(minutes59);

        //Getting message based on the local time.

        String startOfTimeMessage = String.valueOf((minutesTime.get(tellTheMinutesTime)));

        String endTimeMessage = String.valueOf((theTime.get(tellHourTime)));

        // Formatting message to make it readable.

        String formattedTimeMessage = (startOfTimeMessage.substring(37).replace("]", "").replace("}", "").replace("'","")+ endTimeMessage.substring(37).replace("]", "").replace("'","").replace("}", "").replace("'","")) +".";
        System.out.println(formattedTimeMessage);

        Assertions.assertThat(formattedTimeMessage).isNotEmpty();

    }

    @Test
    public void whenTimeIsCloserToNextHour() {

        LocalTime localTime = LocalTime.now();
        int tellHourTime = localTime.getHour();
        //System.out.println("Hours:" + tellHourTime);
        int timeCloserToNextHour = tellHourTime;

        LocalTime localTimeNow = LocalTime.now();
        int tellTheMinutesTime = localTimeNow.getMinute();
        //System.out.println("Minutes:" + tellTheMinutesTime);



        if (tellTheMinutesTime > 44) {
            timeCloserToNextHour = timeCloserToNextHour + 1;
        } else {
            //   System.out.println(tellHourTime);
        }
        // System.out.println(timeCloserToNextHour);

        List<SpeakingClockHours> theTime = new ArrayList<>();
        theTime.add(time0);
        theTime.add(time1);
        theTime.add(time2);
        theTime.add(time3);
        theTime.add(time4);
        theTime.add(time5);
        theTime.add(time6);
        theTime.add(time7);
        theTime.add(time8);
        theTime.add(time9);
        theTime.add(time10);
        theTime.add(time11);
        theTime.add(time12);
        theTime.add(time13);
        theTime.add(time14);
        theTime.add(time15);
        theTime.add(time16);
        theTime.add(time17);
        theTime.add(time18);
        theTime.add(time19);
        theTime.add(time20);
        theTime.add(time21);
        theTime.add(time22);
        theTime.add(time23);


        List<SpeakingClockMinutes> minutesTime = new ArrayList<>();
        minutesTime.add(minutes0);
        minutesTime.add(minutes1);
        minutesTime.add(minutes2);
        minutesTime.add(minutes3);
        minutesTime.add(minutes4);
        minutesTime.add(minutes5);
        minutesTime.add(minutes6);
        minutesTime.add(minutes7);
        minutesTime.add(minutes8);
        minutesTime.add(minutes9);
        minutesTime.add(minutes10);
        minutesTime.add(minutes11);
        minutesTime.add(minutes12);
        minutesTime.add(minutes13);
        minutesTime.add(minutes14);
        minutesTime.add(minutes15);
        minutesTime.add(minutes16);
        minutesTime.add(minutes17);
        minutesTime.add(minutes18);
        minutesTime.add(minutes19);
        minutesTime.add(minutes20);
        minutesTime.add(minutes21);
        minutesTime.add(minutes22);
        minutesTime.add(minutes23);
        minutesTime.add(minutes24);
        minutesTime.add(minutes25);
        minutesTime.add(minutes26);
        minutesTime.add(minutes27);
        minutesTime.add(minutes28);
        minutesTime.add(minutes29);
        minutesTime.add(minutes30);
        minutesTime.add(minutes31);
        minutesTime.add(minutes32);
        minutesTime.add(minutes33);
        minutesTime.add(minutes34);
        minutesTime.add(minutes35);
        minutesTime.add(minutes36);
        minutesTime.add(minutes37);
        minutesTime.add(minutes38);
        minutesTime.add(minutes39);
        minutesTime.add(minutes40);
        minutesTime.add(minutes41);
        minutesTime.add(minutes42);
        minutesTime.add(minutes43);
        minutesTime.add(minutes44);
        minutesTime.add(minutes45);
        minutesTime.add(minutes46);
        minutesTime.add(minutes47);
        minutesTime.add(minutes48);
        minutesTime.add(minutes49);
        minutesTime.add(minutes50);
        minutesTime.add(minutes51);
        minutesTime.add(minutes52);
        minutesTime.add(minutes53);
        minutesTime.add(minutes54);
        minutesTime.add(minutes55);
        minutesTime.add(minutes56);
        minutesTime.add(minutes57);
        minutesTime.add(minutes58);
        minutesTime.add(minutes59);


        // Getting message based on the local time.

        String startOfTimeMessage = String.valueOf((minutesTime.get(tellTheMinutesTime)));

        String endTimeMessage = String.valueOf((theTime.get(timeCloserToNextHour)));

        Assertions.assertThat(endTimeMessage).isNotEmpty();

    }

}
