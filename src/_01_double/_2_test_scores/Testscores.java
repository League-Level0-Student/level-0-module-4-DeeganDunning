package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscores {
	public static void main(String[] args) {
		String testAsString = JOptionPane.showInputDialog ("Enter your test socre.");
		double testAsDouble = Double.parseDouble(testAsString);
		if (testAsDouble >= 87) {
			JOptionPane.showMessageDialog(null, "Amazing work");
		}
		if (testAsDouble <= 70) {
			JOptionPane.showMessageDialog(null, "Study harder");
		}
		if (testAsDouble > 70 && testAsDouble < 87) {
			JOptionPane.showMessageDialog(null, "Good job");
		}
	}
}

