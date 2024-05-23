package numbergame;

import java.util.Random;
import java.util.Scanner;


public class Test {
	
	static Random rd = new Random();
	static int random = rd.nextInt(100)+1;
	
	public static void main(String[] args) {
		
		System.out.println(random);

		userchoice(random);
		
		}
	
	
	static void userchoice(int rand) {
		System.out.println("Guess a number between 1 to 100 ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Number: ");
		int guess = sc.nextInt();
		
		if (guess == rand) {
			System.out.println("Congratulations! Its a match.");
		}
		else if (guess < rand) {
			System.out.println("Try Guessing Higher Number. ");
		}
	}
	
	}

