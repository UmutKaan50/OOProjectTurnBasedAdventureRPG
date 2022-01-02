package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

public class Vampire extends Enemy {
    public Vampire(String name, int health, int level){
        super(name, health, level);
    }

    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }

    public void activeSkill(Character character) {

    }

    @Override
    public void passiveSkill() {

    }
}
