package optional;

import java.util.Random;

public class Validation {
	public static void main(String[] args) {

		
		for (int i = 0; i < 11; i++) {
			int randomNumber = new Random().nextInt(5);
			
			System.out.print(randomNumber);

			if (randomNumber == 1)
				System.out.println(" You are so nice!");
			if (randomNumber == 2)
				System.out.println(" You have beautiful cheekbones!");
			if (randomNumber == 3)
				System.out.println(" You are great!!!");
			if (randomNumber == 4)
				System.out.println(" You have gorgeous smile!");
			if(randomNumber == 0)
				System.out.println(" Your eyes are beautiful!");
		}

	}
}
