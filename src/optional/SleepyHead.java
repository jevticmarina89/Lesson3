package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		
		int answer = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int answer1 = JOptionPane.showConfirmDialog(null, "is it a weekend?", "", JOptionPane.YES_NO_OPTION);
		int answer2 = JOptionPane.showConfirmDialog(null, "is it a vacation?", "", JOptionPane.YES_NO_OPTION);
		
		if(answer==0) {
			if(answer2==0) {
			isWeekday = true;
			isVacation = true;
			JOptionPane.showMessageDialog(null,"sleep in!");
		}}
		if(answer==0) {
			if(answer1!=0 && answer2!=0) {
			isWeekday = true;
			isVacation = false;
			JOptionPane.showMessageDialog(null,"get up lazybones!");
		} }
		if(answer!=0) {
			if(answer1==0 || answer2==0) {
			isWeekday = false;
			isVacation = true;
			JOptionPane.showMessageDialog(null,"sleep in!");
		}
		}
		
		
	}
}

