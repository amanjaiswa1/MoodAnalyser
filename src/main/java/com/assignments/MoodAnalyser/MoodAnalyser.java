package com.assignments.MoodAnalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) throws MoodAnalysisException {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EntryEMPTY, "Please enter a mood.");
			}
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EntryNULL, "Please provide a valid input.");
		}
	}
}