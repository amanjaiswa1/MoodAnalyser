package com.assignments.MoodAnalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

	@Test
	public void givenMessageShouldReturnFalse() {
		MoodAnalyser mood = new MoodAnalyser(null);
		String result = mood.analyseMood();
		assertEquals("HAPPY", result);
	}
}