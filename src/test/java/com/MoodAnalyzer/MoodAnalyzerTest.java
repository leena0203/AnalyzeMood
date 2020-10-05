package com.MoodAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void givenMessage_whensad_returnSadMood() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
		String  testcase1 = moodanalyzer.analyseMood("I am in Sad Mood");
		assertEquals("SAD",testcase1);
	}
		
		@Test
		void givenMessage_whenAnyMood_returnHAPPY() {
		MoodAnalyzer moodanalyzerobj1 = new MoodAnalyzer();
		assertEquals("HAPPY",moodanalyzerobj1.analyseMood("I am in any Mood"));
		
		
	}

}
