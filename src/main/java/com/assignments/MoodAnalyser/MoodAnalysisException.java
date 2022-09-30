package com.assignments.MoodAnalyser;

public class MoodAnalysisException extends Exception {
	enum ExceptionType {
        EntryNULL, EntryEMPTY;
    }
    ExceptionType exceptionType;
    public MoodAnalysisException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
