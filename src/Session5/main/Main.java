package Session5.main;

import Session5.adapter.ArcherToMeleeAdapter;
import Session5.model.Archer;
import Session5.model.Enemy;
import Session5.model.Warrior;

import java.util.Scanner;

public class Main {

	public Main() {

		Scanner sc = new Scanner(System.in);

		while (true){
			System.out.println("Game");
			String role;
			do{
				System.out.print("Input Role [Warrior | Archer] : ");
				role = sc.nextLine();
			}while(!role.equals("Warrior") && !role.equals("Archer"));
			Enemy enemy = new Enemy();
			if(role.equals("Warrior")){
				Warrior warrior = new Warrior(1, 1);
				Game game = new Game(warrior, enemy);
			}
			else {
				Archer archer = new Archer(1, 1);
				Game game = new Game(new ArcherToMeleeAdapter(archer), enemy);
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
