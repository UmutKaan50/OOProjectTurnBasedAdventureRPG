package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Vampire extends Enemy {

    // Constructor
    public Vampire(String name, int health, int level, int damage, int defence, int gold, int xp){
        super(name, health, level, damage, defence, gold, xp);
    }

    public void defaultAttack(Character character) { // Needs to be corrected!
        if(character.getDefence() > this.getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int newLife = character.getHealth() - (getDamage() - character.getDefence());
            character.setHealth(newLife);
            System.out.println("Dealt " + (getDamage() - getDefence()) + " damage!");
        }
    }


}
