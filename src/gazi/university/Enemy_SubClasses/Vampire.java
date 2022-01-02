package gazi.university.Enemy_SubClasses;

import gazi.university.Enemy;

public class Vampire extends Enemy {
    public Vampire(String name, int health, int level){
        super(name, health, level);
    }

    @Override
    public int defaultAttack(Enemy enemy) {
        return super.defaultAttack(enemy);
    }

    @Override
    public int activeSkill(Enemy enemy) {
        return super.activeSkill(enemy);
    }

    @Override
    public int passiveSkill() {
        return super.passiveSkill();
    }
}
