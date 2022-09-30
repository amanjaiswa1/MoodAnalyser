package com.assignments.MoodAnalyser;

public class MoodAnalyser {

	public static String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
}