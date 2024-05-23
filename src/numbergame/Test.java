package numbergame;

import java.util.Random;
import java.util.Scanner;


public class Test {
	static int score = 0, life = 5;	
	
	public static void main(String[] args) {
		
		String flag = "y";
		Scanner sc = new Scanner(System.in);
			
			do {
				
				Random rd = new Random();
				int random = rd.nextInt(100)+1;
				
				userchoice(random);
				
				System.out.println("Do you want to play again? [y/n]  ");
				flag = sc.next();
				life = 5;
				score = 0;
				System.out.println("\n");
				
			} while (flag.equalsIgnoreCase("y"));
		
		}
	
	
	static void userchoice(int rand) {
		System.out.println("Guess a number between 1 to 100 ");
		Scanner sc = new Scanner(System.in);
		
		do {
		lifeCount(life);
		System.out.print("Your Number: ");
		int guess = sc.nextInt();
		
				if (guess == rand) {
					System.out.println("-----------------------------------------");
					System.out.println("|     Congratulations! Its a match.     |");
					System.out.println("-----------------------------------------");
					score += 100;
					break;
				}
				else if (guess < rand) {
					System.out.println("Try Guessing Higher Number. ");
					score += 5;
				}
				else if (guess > rand) {
					System.out.println("Try Guessing Lower Number.");
					score += 5;
				}
				
				System.out.println("\n");
				
		life--;
			
		}while (life > 0);
		
		if(life == 0) {
			System.out.println("----------------------------------");
			System.out.println("|  Moye Moye                     |");
			System.out.println("----------------------------------");
			System.out.println("|   Your Score -> "+ score + "            |");
			System.out.println("----------------------------------");
		}
		
	}
		
	
	static void lifeCount(int life) {
		switch (life) {
		case 5:
			System.out.println("----------------------------------");
			System.out.println("|  Life    <3  <3  <3  <3  <3    |");
			System.out.println("----------------------------------");
			break;
		case 4:
			System.out.println("----------------------------------");
			System.out.println("|  Life:    <3  <3  <3  <3       |");
			System.out.println("----------------------------------");
			break;
		case 3:
			System.out.println("----------------------------------");
			System.out.println("|  Life:    <3  <3  <3           |");
			System.out.println("----------------------------------");
			break;
		case 2:
			System.out.println("----------------------------------");
			System.out.println("|  Life:    <3  <3               |");
			System.out.println("----------------------------------");
			break;
		case 1:
			System.out.println("----------------------------------");
			System.out.println("|  Life:    <3                   |");
			System.out.println("----------------------------------");
			break;
		default:
			System.out.println("Moye Moye");
			break;
		}
	}

	}

