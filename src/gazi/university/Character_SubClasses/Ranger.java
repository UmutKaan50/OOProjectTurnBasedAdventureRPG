package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Inventory;

public class Ranger extends Character {
    public Ranger(String name, int health, int mana, int strength, int money, Inventory inv){
        super(name, health, mana, strength, money, inv);
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
