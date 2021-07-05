package com.controller;

public class MoodAnalyserException extends Exception {
    TypeOfException type;
    enum TypeOfException{
        ENTERED_NULL, ENTERED_EMPTY
    }
    public MoodAnalyserException(String message,TypeOfException type) {
        super(message);
        this.type = type;
    }
}
