package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {

	public static void main(String[] args) {
		
		String answer = JOptionPane.showInputDialog("Are you happy?");
		
		if(answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		if(answer.equals("no")) {
			String answer1 = JOptionPane.showInputDialog("Do U want to be happy?");
			if(answer1.equals("yes")) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING!");	
				}
			
			else if(answer1.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
