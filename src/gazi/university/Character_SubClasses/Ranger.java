package gazi.university.Character_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Ranger extends Character {

    // Constructor
    public Ranger(String name, int health, int mana, int str, int dex, int intel, int money, Equipment equipment){
        super(name, health, mana, str, dex, intel, money, equipment);
        setDamage(5);
        setDefence(0);
    }
    @Override
    public void defaultAttack(Enemy enemy) {
        if(enemy.getDefence() > this.getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int newLife = enemy.getHealth() - (getDamage() - enemy.getDefence());
            enemy.setHealth(newLife);
            System.out.println("Dealt " + (getDamage() - enemy.getDefence()) + " damage!");
        }
    }

    @Override
    public void activeSkill(Enemy enemy) {
        if (getMana() < 10){
            System.out.println("Not enough mana!");
        }
        else {
            setMana(getMana() - 10);
            if(enemy.getDefence() > this.getDamage())

                System.out.println("Dealt 0 damage!");
            else {

                // Ranger's active skills damages opponnent normal attack and then heals same amount dealt damage.
                enemy.setHealth(enemy.getHealth() - getDamage());
                setHealth(getHealth() + getDamage() / 2);
                System.out.println("Dealt " + getDamage() + " damage!");
            }

        }
    }

}
