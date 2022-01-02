package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Ranger extends Character {
    public Ranger(String name, int health, int mana, int strength, int money, Equipment equipment){
        super(name, health, mana, strength, money, equipment);
    }

    @Override
    public int defaultAttack(Enemy enemy) {
        return 0;
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
