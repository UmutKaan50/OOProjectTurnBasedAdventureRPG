package gazi.university.Enemy_SubClasses;

import gazi.university.Enemy;

public class Zombie extends Enemy {
    public Zombie(String name, int health, int level){
        super(name, health, level);
    }

    @Override
    public void defaultAttack(Enemy enemy) {
    }

    @Override
    public void activeSkill(Enemy enemy) {

    }

    @Override
    public void passiveSkill() {

    }
}
