package gazi.university.Character_SubClasses;


import gazi.university.Character;
import gazi.university.Equipment;

public class Duelist extends Character {

    public Duelist(String name, int health, int mana, int str, int money, Equipment equipment){
        super(name, health, mana, str, money, equipment);
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
