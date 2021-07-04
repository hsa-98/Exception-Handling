package com.controller;

public class MoodAnalyser {
    public String analyseMood(String mood){
        if (mood.contains("sad")){
            return "Sad";
        }
        else{
            return "Happy";
        }
    }
}
