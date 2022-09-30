package com.assignments.MoodAnalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) throws MoodAnalysisException {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please provide a valid input");
		}
	}
}