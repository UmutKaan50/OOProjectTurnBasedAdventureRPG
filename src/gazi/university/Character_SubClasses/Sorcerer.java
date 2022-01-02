package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;

public class Sorcerer extends Character {
    public Sorcerer(String name, int health, int mana, int strength, int money, Equipment equipment){
        super(name, health, mana, strength, money, equipment);
    }

    @Override
    public int defaultAttack(Object obj) {
        return 0;
    }

    @Override
    public int activeSkill(Object obj) {
        return 0;
    }

    @Override
    public int passiveSkill() {
        return super.passiveSkill();
    }
}
