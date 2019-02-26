package Uppgifter;

import java.util.Scanner;

public class GissaTalet {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int talet = (int) (Math.random()*100);
		int lives = 5;
		int guess = sc.nextInt();
		int attempts = 0;
		
		while(lives == 0 || guess == talet) {
			if(guess > talet) {
				System.out.println("The number is lower!");
				System.out.println("Lives: " + lives);
				lives--;
				attempts++;
			}
			else if(guess < talet) {
				System.out.println("The number is higher!");
				System.out.println("Lives: " + lives);
				lives--;
				attempts++;
			}
			else {
				System.out.println("Congrats you win!");
				attempts++;
				System.out.println("Your tries: " + attempts);
				break;
			}
			
		}
	}

}
