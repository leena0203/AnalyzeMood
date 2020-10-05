package com.MoodAnalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	public String message;
	
	public MoodAnalyzer() {              //default constructor
		
	}
	public MoodAnalyzer(String message) {     //parameterized constructor
		this.message = message;
	}
	public static void main(String[] args) {
		
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am crying ");
		
		System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());

		}
		public String analyseMood() {
			
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			else
				return "HAPPY";
	}

}
