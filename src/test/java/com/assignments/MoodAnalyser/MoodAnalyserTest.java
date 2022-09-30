package com.assignments.MoodAnalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

	@Test
	public void givenMessageShouldReturnTrue() {
		try {
			String mood = new MoodAnalyser("Sad").analyseMood();
			assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessageShouldReturnMessage() {
		try {
			new MoodAnalyser(null).analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}