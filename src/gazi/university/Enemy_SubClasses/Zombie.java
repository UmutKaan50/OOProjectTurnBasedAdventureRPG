package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.Arrays;
import java.util.List;

public class Zombie extends Enemy {
    private String name;
    private int health;
    private int level;
    private int gold;

    private static final List<Zombie> zombiesForBattleLvl1 = Arrays.asList( // total number is 5
            new Zombie("ZombieLvl1.1", 10, 1, 6),
            new Zombie("ZombieLvl1.2", 11, 1, 7),
            new Zombie("ZombieLvl1.3", 12, 1, 10),
            new Zombie("ZombieLvl1.4", 12, 1, 11),
            new Zombie("ZombieLvl1.5", 15, 1, 16)
    );
    private static final List<Zombie> zombiesForBattleLvl2 = Arrays.asList( // total number is 9
            new Zombie("ZombieLvl2.1", 20, 2, 18),
            new Zombie("ZombieLvl2.2", 21, 2, 25),
            new Zombie("ZombieLvl2.3", 22, 2, 26),
            new Zombie("ZombieLvl2.4", 24, 2, 28),
            new Zombie("ZombieLvl2.5", 25, 2, 27),
            new Zombie("ZombieLvl2.1", 20, 2, 18),
            new Zombie("ZombieLvl2.2", 21, 2, 27),
            new Zombie("ZombieLvl2.9", 28, 2, 29),
            new Zombie("ZombieLvl2.8", 28, 2, 28)
    );
    private static final List<Zombie> zombiesForBattleLvl3 = Arrays.asList( // total number is 12
            new Zombie("ZombieLvl3.1", 30, 3, 26),
            new Zombie("ZombieLvl3.2", 31, 3, 27),
            new Zombie("ZombieLvl3.3", 33, 3, 33),
            new Zombie("ZombieLvl3.2", 32, 3, 31),
            new Zombie("ZombieLvl3.1", 30, 3, 26),
            new Zombie("ZombieLvl3.7", 36, 3, 36),
            new Zombie("ZombieLvl3.4", 34, 3, 34),
            new Zombie("ZombieLvl3.2", 32, 3, 31),
            new Zombie("ZombieLvl3.3", 35, 3, 34),
            new Zombie("ZombieLvl3.7", 36, 3, 36),
            new Zombie("ZombieLvl3.8", 37, 3, 37),
            new Zombie("ZombieLvl3.9", 39, 3, 39)
    );

    // Constructor
    private Zombie(String name, int health, int level, int gold){
        this.name = name;
        this.health = health;
        this.level = level;
        this.gold = gold;
    }
    public Zombie(){}

    public List<Zombie> getZombiesByLevel(int level){
        return switch (level) {
            case (1) -> zombiesForBattleLvl1;
            case (2) -> zombiesForBattleLvl2;
            case(3) -> zombiesForBattleLvl3;
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
