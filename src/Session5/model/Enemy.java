package Session5.model;

import java.util.Random;

public class Enemy {
	
	int health;
	public int posX;
	
	public Enemy() {
		this.posX = new Random().nextInt(3) + 6;
		this.health = 1;
	}
	
	public void deductHealth() {
		health --;
	}
	
	public int getHealth() {
		return health;
	}
}
