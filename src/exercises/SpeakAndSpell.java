package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. 
 * It was my favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		int score = 0;
		
speak("spell mandelbrot");
String word = JOptionPane.showInputDialog("Can you spell the word correctly?");
		
if(word.equals("mandelbrot")) {
	speak("correct");
	score++;
} else {
	speak("wrong");
}


speak("spell pomegranate");
String word1 = JOptionPane.showInputDialog("Can you spell the word correctly?");	

if(word1.equals("pomegranate")) {
	speak("correct");
	score++;
} else {
	speak("wrong");
}


speak("spell velocipede");
String word2 = JOptionPane.showInputDialog("Can you spell the word correctly?");
	
if(word2.equals("velocipede")) {
	speak("correct");
	score++;
} else {
	speak("wrong");
}

System.out.println("Your score is: " + score);

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
