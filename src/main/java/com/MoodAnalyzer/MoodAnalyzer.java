package com.MoodAnalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	public String message;

	public MoodAnalyzer() { // default constructor

	}

	public MoodAnalyzer(String message) { // parameterized constructor
		this.message = message; // UC1
	}

	public static void main(String[] args) throws MoodAnalyzerException {

		MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);

		System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());
	}

	public String analyseMood() throws MoodAnalyzerException {
		InvalidInput input1 = InvalidInput.NULL;
		InvalidInput input2 = InvalidInput.EMPTY;
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";

		} catch (NullPointerException e) {                                                                                     // Null input exception
			MoodAnalyzerException moodanalyzerexception = new MoodAnalyzerException("Mood of a person can't be: " + input1);
			throw moodanalyzerexception;                                                                                       // UC2
		}
		if (message == "")
			throw new MoodAnalyzerException("Mood of a person can't be: " + input2);
		return "HAPPY";

	}

}
