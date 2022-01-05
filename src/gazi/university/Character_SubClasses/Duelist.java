package gazi.university.Character_SubClasses;


import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Duelist extends Character {

    // Constructor
    public Duelist(String name, int health, int mana, int str, int dex, int intel, int money, Equipment equipment){
        super(name, health, mana, str, dex, intel, money, equipment);
    }

    // Looking for the type of this method.
    // enemy.setHealth(enemy.getHealth() - getDamage());


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
        // Duelist's active skill deals double damage and increased damage by 2. (for now)
        enemy.setHealth(enemy.getHealth() - getDamage() * 2);
        setDamage(getDamage() + 2);
        setMana(getMana() - 10);
    }

}
