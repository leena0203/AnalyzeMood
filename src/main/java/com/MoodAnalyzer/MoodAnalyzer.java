package com.MoodAnalyzer;

import java.util.Scanner;

public class MoodAnalyzer {

	public static void main(String[] args) {
		
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
		Scanner sc = new Scanner(System.in);
		
		String message = sc.nextLine();
		System.out.println("Mood of a person is: " + moodanalyzer.analyseMood(message));

		}
		public String analyseMood(String message) {
			if (message.contains("sad")) {
				return "SAD";
			}
			else
				return "HAPPY";
	}

}
