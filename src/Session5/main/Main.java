package Session5.main;

import Session5.adapter.ArcherToMeleeAdapter;
import Session5.model.Archer;
import Session5.model.Enemy;
import Session5.model.Warrior;

public class Main {

	public Main() {
		Enemy enemy = new Enemy();
		Warrior warrior = new Warrior(1, 1);
		Archer archer = new Archer(1, 1);
		Game game = new Game(warrior, enemy);
	}

	public static void main(String[] args) {
		new Main();
	}
}
