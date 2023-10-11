package Session5.model;

public abstract class MeleeHero {
	
	int health;
	int damage;
	public int posX;
	
	public abstract void attack(Enemy enemy);
	
	public abstract void moveForward();
	
	public abstract void moveBackward();
}
