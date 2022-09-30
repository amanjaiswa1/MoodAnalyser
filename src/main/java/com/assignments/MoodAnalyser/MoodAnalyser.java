package com.assignments.MoodAnalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
}