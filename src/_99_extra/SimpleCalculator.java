package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		while (true) {
			// 1. Get 2 numbers from the user and convert them to integer.

			String x = JOptionPane.showInputDialog("Input a number.");
			String y = JOptionPane.showInputDialog("Input another number");
			int number1 = Integer.parseInt(x);
			int number2 = Integer.parseInt(y);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			if (operation == 0) {
				add(number1, number2);
			}
			if (operation == 1) {
				subtract(number1, number2);
			}
			if (operation == 2 ) {
				multiply(number1, number2);
			}
			if (operation == 3 ) {
				divide(number1, number2);
			}
			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

		}
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int number1, int number2) {
		int answer = number1 + number2;
		String solution = number1 + " + " + number2 + " = " + answer;
		JOptionPane.showMessageDialog(null, solution);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int number1, int number2) {
		int answer2 = number1 - number2;
		String solution = number1 + " - " + number2 + " = " + answer2;
		JOptionPane.showMessageDialog(null, solution);
	}
	static void multiply(int number1, int number2) {
		int answer3 = number1 * number2;
		String solution = number1 + " * " + number2 + " = " + answer3;
		JOptionPane.showMessageDialog(null, solution);
	}
	static void divide(int number1, int number2) {
		int answer4 = number1 / number2;
		String solution = number1 + " / " + number2 + " = " + answer4;
		JOptionPane.showMessageDialog(null, solution);
	}
}