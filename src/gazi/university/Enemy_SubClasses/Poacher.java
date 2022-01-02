package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

public class Poacher extends Enemy {
    public Poacher(String name, int health, int level){
        super(name, health, level);
    }

    // Planning to make more changes here.

    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }


    public void activeSkill(Character character) {

    }

}


