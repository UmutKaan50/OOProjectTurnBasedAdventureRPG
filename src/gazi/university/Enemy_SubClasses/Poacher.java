package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Poacher extends Enemy {
    private List<Poacher> poacherforBattleLvl1 = Arrays.asList(
            new Poacher("PoacherLvl1.1", 10, 1, 4),
            new Poacher("PoacherLvl1.3", 11, 1, 5),
            new Poacher("PoacherLvl1.4", 12, 1, 6),
            new Poacher("PoacherLvl2.2", 14, 1, 12),
            new Poacher("PoacherLvl2.3", 15, 1, 13));

    private Poacher(String name, int health, int level, int gold){
    }
    public Poacher(){
        super();
    }
    public List<Poacher> getPoachersByLevel(int level){
        switch(level){
            case(1):
                return this.poacherforBattleLvl1;
        }
        return null;
    }

    // Planning to make more changes here.

    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }

}


