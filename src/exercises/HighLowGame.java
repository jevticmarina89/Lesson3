package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {

		int n = new Random().nextInt(100) + 1;
		System.out.println(n);

		for (int i = 4; i >= 0; i--) {
			String number = JOptionPane.showInputDialog("Guess a number");
			int m = Integer.parseInt(number);

			if (i != 0) {
				if (m > n)
					JOptionPane.showMessageDialog(null, m + " is too high," + i + " more tries");
				else if (m < n)
					JOptionPane.showMessageDialog(null, m + " is too low," + i + " more tries");
				else if (m == n) {
					JOptionPane.showMessageDialog(null, "You win!");
					System.exit(0);
				}
			}
			else if (i == 0) {
				JOptionPane.showMessageDialog(null, "You lose!");

			}

		}
	}
}