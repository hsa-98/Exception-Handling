package com.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_ToMoodAnalyser_ReturnsHappy()  {
        String message = "I am happy";
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertTrue(mood.equals("Happy"));
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMessage_ToMoodAnalyser_ReturnsSad(){
        String message = "Iam sad";
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertTrue(mood.equals("Sad"));

        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }

    @Test
    void givenNull_ToMoodAnalyser_ReturnsCorrectException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try {
            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {
            Assertions.assertTrue(MoodAnalyserException.TypeOfException.ENTERED_NULL.equals(e.type));
        }
    }

    @Test
    void givenEmpty_ToMoodAnalyser_ReturnsCorrectException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();

        }
        catch (MoodAnalyserException e){
            Assertions.assertTrue(MoodAnalyserException.TypeOfException.ENTERED_EMPTY.equals(e.type));

        }
    }
}
