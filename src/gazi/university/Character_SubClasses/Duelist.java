package gazi.university.Character_SubClasses;


import gazi.university.Character;
import gazi.university.Inventory;

public class Duelist extends Character {

    public Duelist(String name, int health, int mana, int str, int money, Inventory inv){
        super(name, health, mana, str, money, inv);
    }

    @Override
    public int defaultAttack(Object obj) {
        return 9;
    }

    @Override
    public int activeSkill(Object obj) {
        return 0;
    }

    @Override
    public int passiveSkill() {
        return 0;
    }

}
