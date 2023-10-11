package Session5.model;

public class Archer {
    int health;
    int damage;
    int posX;

    public Archer(int health, int damage) {
        this.health = health;
        this.damage = damage;
        posX = 0;
    }

    public void shoot(Enemy enemy){
        enemy.deductHealth();
    }
}
