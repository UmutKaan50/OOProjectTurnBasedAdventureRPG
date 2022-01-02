package gazi.university.Character_SubClasses;


import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Duelist extends Character {

    public Duelist(String name, int health, int mana, int str, int money, Equipment equipment){
        super(name, health, mana, str, money, equipment);
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
        return 0;
    }

}
