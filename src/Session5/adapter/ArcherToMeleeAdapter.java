package Session5.adapter;

import Session5.model.Archer;
import Session5.model.Enemy;
import Session5.model.MeleeHero;

public class ArcherToMeleeAdapter extends MeleeHero {

    Archer archer;

    public ArcherToMeleeAdapter(Archer archer) {
        this.archer = archer;
    }

    @Override
    public void attack(Enemy enemy) {
        archer.shoot(enemy);
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }
}
