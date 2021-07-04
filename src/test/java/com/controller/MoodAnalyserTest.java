package com.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_ToMoodAnalyser_ReturnsHappy() {
        String message = "I am happy";
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertTrue(mood.equals("Happy"));
    }
    void givenMessage_ToMoodAnalyser_ReturnsSad(){
        String message = "Iam sad";
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertTrue(mood.equals("Sad"));
    }
}
