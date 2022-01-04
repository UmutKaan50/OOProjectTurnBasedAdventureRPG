package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Vampire extends Enemy {
    private String name;
    private int health;
    private int level;
    private int gold;

    private static final List<Vampire> vampiresForBattleLvl1 = Arrays.asList( // total number is 5
            new Vampire("VampireLvl1.1", 10, 1, 4),
            new Vampire("VampireLvl1.2", 11, 1, 5),
            new Vampire("VampireLvl1.3", 12, 1, 6),
            new Vampire("VampireLvl1.4", 13, 1, 10),
            new Vampire("VampireLvl1.5", 15, 1, 14)
    );
    private static final List<Vampire> vampiresForBattleLvl2 = Arrays.asList( // total number is 9
            new Vampire("VampireLvl2.1", 20, 2, 14),
            new Vampire("VampireLvl2.2", 21, 2, 12),
            new Vampire("VampireLvl2.3", 22, 2, 16),
            new Vampire("VampireLvl2.4", 23, 2, 20),
            new Vampire("VampireLvl2.5", 25, 2, 25),
            new Vampire("VampireLvl2.1", 20, 2, 20),
            new Vampire("VampireLvl2.2", 21, 2, 22),
            new Vampire("VampireLvl2.3", 24, 2, 24),
            new Vampire("VampireLvl2.6", 28, 2, 28)
    );
    private static final List<Vampire> vampireForBattleLvl3 = Arrays.asList( // total number is 12
            new Vampire("VampireLvl3.1", 30, 3, 24),
            new Vampire("VampireLvl3.2", 31, 3, 22),
            new Vampire("VampireLvl3.3", 32, 3, 26),
            new Vampire("VampireLvl3.4", 33, 3, 30),
            new Vampire("VampireLvl3.5", 35, 3, 35),
            new Vampire("VampireLvl3.8", 37, 3, 36),
            new Vampire("VampireLvl3.2", 31, 3, 32),
            new Vampire("VampireLvl3.9", 38, 3, 38),
            new Vampire("VampireLvl3.5", 35, 3, 35),
            new Vampire("VampireLvl3.1", 30, 3, 30),
            new Vampire("VampireLvl3.7", 36, 3, 35),
            new Vampire("VampireLvl3.9", 38, 3, 38),
            new Vampire("VampireLvl3.8", 37, 3, 36)
    );
    private Vampire(String name, int health, int level, int gold){
        this.name = name;
        this.health = health;
        this.level = level;
        this.gold = gold;
    }

    public Vampire(){}

    public List<Vampire> getVampiresByLevel(int level){
        return switch(level){
            case(1) -> vampiresForBattleLvl1;
            case(2) -> vampiresForBattleLvl2;
            case(3) -> vampireForBattleLvl3;
            default -> null;
        };
    }
    public void defaultAttack(Character character) {
        if(character.getDefance() > this.getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int dealt = character.getHealth() - (getDamage() - character.getDefance());
            character.setHealth(dealt);
            System.out.println("Dealt " + dealt + " damage!");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public void setGold(int gold) {
        this.gold = gold;
    }

}
