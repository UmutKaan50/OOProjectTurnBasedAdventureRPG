package gazi.university.Character_SubClasses;


import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Equipment;

public class Duelist extends Character {

    // Constructor
    public Duelist(String name, int health, int mana, int str, int dex, int intel, int money, Equipment equipment){
        super(name, health, mana, str, dex, intel, money, equipment);
        setDamage(5);
        setDefence(0);
    }

    // Looking for the type of this method.
    // enemy.setHealth(enemy.getHealth() - getDamage());


    @Override
    public void defaultAttack(Enemy enemy) {
        if(enemy.getDefence() > getDamage()) {
            System.out.println("Dealt 0 damage!");
        }
        else {
            int newLife = enemy.getHealth() - (getDamage() - enemy.getDefence());
            enemy.setHealth(newLife);
            System.out.println("Dealt " + (getDamage() - enemy.getDefence()) + " damage!");
            //System.out.println("hi, dmg: " + getDamage() + " enemydef: " + enemy.getDefence());
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

                // Duelist's active skill increases duelist damage by 2 and deals double damage.
                setDamage(getDamage() + 2);
                enemy.setHealth(enemy.getHealth() - ((getDamage() * 2) - enemy.getDefence()));
                System.out.println("Dealt " + ((getDamage() * 2) - enemy.getDefence()) + " damage!");
                setDamage(getDamage() - 2);
            }


        }
    }

}
