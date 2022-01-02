package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

public class Zombie extends Enemy {
    public Zombie(String name, int health, int level){
        super(name, health, level);
    }

    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }

    public void activeSkill(Character character) {

    }

}
