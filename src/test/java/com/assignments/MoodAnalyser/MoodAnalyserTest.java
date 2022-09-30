package com.assignments.MoodAnalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

	@Test
	public void givenMessageShouldReturnTrue() {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		String result = mood.analyseMood();
		assertEquals("SAD", result);
	}

	@Test
	public void givenMessageShouldReturnFalse() {
		MoodAnalyser mood = new MoodAnalyser("I am in Any Mood");
		String result = mood.analyseMood();
		assertEquals("HAPPY", result);
	}
}