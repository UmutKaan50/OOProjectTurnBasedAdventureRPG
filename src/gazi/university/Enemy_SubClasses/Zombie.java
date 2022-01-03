package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Zombie extends Enemy {
    private List<Zombie> zombiesForBattleLvl1 = Arrays.asList(
            new Zombie("ZombieLvl1.1", 10, 1, 6),
            new Zombie("ZombieLvl1.2", 11, 1, 7),
            new Zombie("ZombieLvl1.3", 12, 1, 10),
            new Zombie("ZombieLvl1.4", 12, 1, 11),
            new Zombie("ZombieLvl1.5", 15, 1,16)
    );

    public Zombie(String name, int health, int level, int gold){
        super();
    }
    public Zombie(){}
    public List<Zombie> getZombiesByLevel(int level){
        switch(level){
            case(1):
                return this.zombiesForBattleLvl1;
        }
        return null;
    }
    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }
}
