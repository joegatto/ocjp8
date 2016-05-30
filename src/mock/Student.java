package mock;

import java.util.ArrayList;

public class Student {

	private ArrayList<Integer> scores;
	private double average;

	public double getAverage() {
		return average;
	}

	private void computeAverage() {
		// valid code to compute average
		// average =//update average value
	}

	public Student() {
		computeAverage();
	}

	public ArrayList<Integer> getScores() {
		return new ArrayList<>(scores);
	}
}
