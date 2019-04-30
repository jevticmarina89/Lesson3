package optional;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		
	
	String hours = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
	int h = Integer.parseInt(hours);
	if(h>=3 && h<=5) {
		JOptionPane.showMessageDialog(null, "You are a CODE NINjA!");
	}
	else if(h<=2) {
		JOptionPane.showMessageDialog(null, "Stop watching YouTube and write some code instead.");
	}
	else if(h>5) {
		playBatmanTheme();
	}

	}
	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

