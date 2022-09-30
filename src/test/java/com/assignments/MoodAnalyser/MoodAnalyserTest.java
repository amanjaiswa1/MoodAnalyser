package com.assignments.MoodAnalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

	@Test
	public void givenMessageShouldReturnTrue() {
		String result = MoodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("SAD", result);
	}

	@Test
	public void givenMessageShouldReturnFalse() {
		String result = MoodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", result);
	}
}
