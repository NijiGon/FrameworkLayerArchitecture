package Session5.main;

import java.util.Scanner;

import Session5.model.Enemy;
import Session5.model.MeleeHero;

public class Game {
	
	// DISCLAIMER
	// This class contains the game's logic
	// This has nothing to do with the FLA subject
	// Do not read!
	// ------------
	
	private MeleeHero player;
	private Enemy enemy;
	private Scanner sc = new Scanner(System.in);

	public Game(MeleeHero player, Enemy enemy) {
		this.player = player;
		this.enemy = enemy;
		
		while(true) {
			printGame();
			
			int input;
			
			do {
				System.out.print("Input action : ");
				input = sc.nextInt();
				sc.nextLine();
			}
			while(input < 1 || input > 3);
			
			if(input == 1) {
				player.attack(enemy);
			}
			else if(input == 2) {
				if(player.posX + 1 != enemy.posX)
					player.moveForward();
			}
			else {
				player.moveBackward();
			}
			
			if(enemy.getHealth() == 0) {
				clearScreen();
				System.out.println("You win!");
				System.out.println("Press Enter to continue..");
				sc.nextLine();
				break;
			}
		}
	}
	
	private void printGame() {
		clearScreen();
		System.out.println(" 1 2 3 4 5 6 7 8 9");
		System.out.println("===================");
		System.out.println("|                 |");
		System.out.print("|");
		
		for(int i = 0; i < 17; i ++) {
			if(i % 2 == 0) {
				if(i / 2 == player.posX) {
					System.out.print("P");
				}
				else if (i / 2 == enemy.posX) {
					System.out.print("E");
				}
				else {
					System.out.print(" ");
				}
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println("|");
		System.out.println("|                 |");
		System.out.println("===================");
		System.out.println("1. Attack");
		System.out.println("2. Move Forward");
		System.out.println("3. Move Backward");
	}
	
	private void clearScreen() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	// DISCLAIMER
	// This class contains the game's logic
	// This has nothing to do with the FLA subject
	// Do not read!
	// ------------
}
