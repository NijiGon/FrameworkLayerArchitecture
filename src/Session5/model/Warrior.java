package Session5.model;

public class Warrior extends MeleeHero {

	public Warrior(int health, int damage){
		this.health = health;
		this.damage = damage;
		posX = 0;
	}
	public void attack(Enemy enemy) {
		// Ensure that enemy is close enough
		if(enemy.posX - this.posX <= 1) {
			enemy.deductHealth();
		}
	}
	
	public void moveForward() {
		if(posX == 8) {
			return;
		}
		posX ++;
	}
	
	public void moveBackward() {
		if(posX == 0) {
			return;
		}
		posX --;
	}
}
