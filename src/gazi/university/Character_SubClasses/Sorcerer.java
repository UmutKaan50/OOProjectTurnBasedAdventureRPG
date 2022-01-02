package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Sorcerer extends Character {
    public Sorcerer(String name, int health, int mana, int strength, int money, Equipment equipment){
        super(name, health, mana, strength, money, equipment);
    }
    @Override
    public void defaultAttack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - getDamage());
    }

    @Override
    public void activeSkill(Enemy enemy) {

    }

    @Override
    public void passiveSkill() {

    }
}
