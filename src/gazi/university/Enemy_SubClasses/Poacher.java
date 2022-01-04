package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Poacher extends Enemy {
    private String name;
    private int health;
    private int level;
    private int gold;

    private static final List<Poacher> poacherForBattleLvl1 = Arrays.asList( // total number is 5
            new Poacher("PoacherLvl1.1", 10, 1, 4),
            new Poacher("PoacherLvl1.2", 11, 1, 5),
            new Poacher("PoacherLvl1.3", 12, 1, 6),
            new Poacher("PoacherLvl1.4", 14, 1, 12),
            new Poacher("PoacherLvl1.5", 15, 1, 13)
    );
    private static final List<Poacher> poacherForBattleLvl2 = Arrays.asList( // total number is 7
            new Poacher("PoacherLvl2.3", 21, 2, 19),
            new Poacher("PoacherLvl2.4", 22, 2, 20),
            new Poacher("PoacherLvl2.6", 23, 2, 22),
            new Poacher("PoacherLvl2.7", 24, 2, 23),
            new Poacher("PoacherLvl2.8", 24, 2, 24),
            new Poacher("PoacherLvl2.8", 25, 2, 25),
            new Poacher("PoacherLvl2.9", 28, 2, 28)
    );
    private static final List<Poacher> poacherForBattleLvl3 = Arrays.asList( //  total number is 11
            new Poacher("PoacherLvl3.1", 20, 2, 29),
            new Poacher("PoacherLvl3.1", 21, 2, 29),
            new Poacher("PoacherLvl3.2", 22, 2, 20),
            new Poacher("PoacherLvl3.3", 23, 2, 32),
            new Poacher("PoacherLvl3.4", 24, 2, 33),
            new Poacher("PoacherLvl3.4", 24, 2, 34),
            new Poacher("PoacherLvl3.5", 25, 2, 35),
            new Poacher("PoacherLvl3.9", 28, 2, 38),
            new Poacher("PoacherLvl3.4", 24, 2, 34),
            new Poacher("PoacherLvl3.5", 25, 2, 35),
            new Poacher("PoacherLvl3.9", 28, 2, 38),
            new Poacher("PoacherLvl3.1", 20, 2, 29)
    );

    private Poacher(String name, int health, int level, int gold){
        this.name = name;
        this.health = health;
        this.level = level;
        this.gold = gold;
    }

    public Poacher(){
        super();
    }

    public List<Poacher> getPoachersByLevel(int level){
        return switch (level) {
            case(1) -> poacherForBattleLvl1;
            case(2) -> poacherForBattleLvl2;
            case(3) -> poacherForBattleLvl3;
            default -> null;
        };
    }
    public void defaultAttack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }


    // Planning to make more changes here.
}


