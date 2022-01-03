package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Vampire extends Enemy {

    private List<Vampire> vampiresForBattleLvl1 = Arrays.asList(
            new Vampire("VampireLvl1.1", 10, 1, 4),
            new Vampire("VampireLvl1.2", 11, 1, 5),
            new Vampire("VampireLvl1.3", 12, 1, 6),
            new Vampire("VampireLvl1.4", 13, 1, 10),
            new Vampire("VampireLvl1.5", 15, 1, 14)
    );
    public Vampire(String name, int health, int level, int gold){

    }
    public Vampire(){}

    public List<Vampire> getVampiresByLevel(int level){
        switch(level){
            case (1):
                return this.vampiresForBattleLvl1;
        }
        return null;
    }
    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }
}
