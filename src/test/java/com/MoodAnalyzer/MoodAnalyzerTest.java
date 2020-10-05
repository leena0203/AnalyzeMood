package com.MoodAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	public static MoodAnalyzer moodanalyzer;

	@Test
	void givenMessage_whensad_returnSadMood() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
		String testcase1 = moodanalyzer.analyseMood();
		assertEquals("SAD", testcase1);
	}

	@Test
	void givenMessage_whenAnyMood_returnHAPPY() {
		MoodAnalyzer moodanalyzerobj1 = new MoodAnalyzer("I am Happy Mood");
		assertEquals("HAPPY", moodanalyzerobj1.analyseMood());

	}

}
