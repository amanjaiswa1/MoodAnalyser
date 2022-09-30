package com.assignments.MoodAnalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {
	@Test
	public void givenMessageNullShouldReturnMessage() {
		try {
			new MoodAnalyser(null).analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.EntryNULL, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessageBlankShouldReturnMessage() {
		try {
			new MoodAnalyser("").analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.EntryEMPTY, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
}