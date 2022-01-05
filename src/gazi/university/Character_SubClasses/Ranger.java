package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Ranger extends Character {

    // Constructor
    public Ranger(String name, int health, int mana, int str, int dex, int intel, int money, Equipment equipment){
        super(name, health, mana, str, dex, intel, money, equipment);
    }
    @Override
    public void defaultAttack(Enemy enemy) {
        if(enemy.getDefence() > this.getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int dealt = enemy.getHealth() - (getDamage() - enemy.getDefence());
            enemy.setHealth(dealt);
            System.out.println("Dealt " + dealt + " damage!");
        }
    }

    @Override
    public void activeSkill(Enemy enemy) {
        // Ranger's active skills damages opponnent normal attack and then heals same amount dealt damage.
        enemy.setHealth(enemy.getHealth() - getDamage());
        setHealth(getHealth() + getDamage());
        setMana(getMana() - 10);

    }

}
