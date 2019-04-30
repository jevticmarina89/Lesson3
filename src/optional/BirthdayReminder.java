package optional;

import java.util.Scanner;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		
		String momsBirthday = "September 28th";
		String dadsBirthday = "October 27th";
		String myBirthday = "June 30th";

		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter which one's birthday do you want: ");
	String person = sc.nextLine();
		
	System.out.println(person);	
		
	if(person.equals("mom")) {
		System.out.println(momsBirthday);
	}
	else if(person.equals("dad")) {
		System.out.println(dadsBirthday);
	}
	else if(person.equals("marina")) {
		System.out.println(myBirthday);
	}
	else {
		System.out.println("Sorry, i don't remember that person's birthday!");
	}
		

	}
}
