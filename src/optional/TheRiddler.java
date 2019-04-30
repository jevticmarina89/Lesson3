package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		

		int score = 0;

		JOptionPane.showMessageDialog(null, "SOLVE A RIDDLE");
		String answer = JOptionPane.showInputDialog("I have a tongue but cannot talk.\n I have no legs but sometimes walk. What am I?\nAnswer :");
		
		if(answer.equals("a shoe")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		   score++;}
		else {
			JOptionPane.showMessageDialog(null, "WRONG! \n The answer is: a shoe");
		}
		
		String answer1 = JOptionPane.showInputDialog("What has a head and a tail, but no body?\nAnswer:");
		if(answer1.equals("a coin")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		   score++;}
		else {
			JOptionPane.showMessageDialog(null, "WRONG! \n The answer is: a coin");
		}
		
		String answer2 = JOptionPane.showInputDialog("Which creature walks on four legs in the morning, \n two legs in the afternoon, \n and three legs in the evening?\nAnswer:");
		if(answer2.equals("a man")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		   score++;}
		else {
			JOptionPane.showMessageDialog(null, "WRONG! \n The answer is: a man");
		}
		
		JOptionPane.showInternalMessageDialog(null, "Your score: " +score);
	}
}

