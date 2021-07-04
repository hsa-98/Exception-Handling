package com.controller;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(){
        if (message.contains("sad")){
            return "Sad";
        }
        else{
            return "Happy";
        }
    }
}
