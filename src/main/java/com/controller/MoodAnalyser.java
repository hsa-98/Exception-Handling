package com.controller;

public class MoodAnalyser {
    public String message;
    public String messageEmpty = "Please input a string";
    public String messageNull = "Please input a non null string";

    public MoodAnalyser() {
    }


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if(message.length()==0){
                throw new MoodAnalyserException(messageEmpty,MoodAnalyserException.TypeOfException.ENTERED_EMPTY);
            }
            else if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (NullPointerException e){
            throw  new MoodAnalyserException(messageNull,MoodAnalyserException.TypeOfException.ENTERED_NULL);
        }
    }
}
