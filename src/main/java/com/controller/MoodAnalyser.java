package com.controller;

public class MoodAnalyser {
    public String message;


    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(){
        try {
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (Exception e){
            return "Please Enter Input";
        }
    }
}
