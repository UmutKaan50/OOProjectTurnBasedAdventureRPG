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
    private int xp;
    private int damage;

    private static final List<Vampire> vampiresForBattleLvl1 = List.of( // total number is 1
            new Vampire("VampireLvl1.5", 15, 1, 19, 5, 20)
    );
    private static final List<Vampire> vampiresForBattleLvl2 = List.of( // total number is 1
            new Vampire("VampireLvl2.6", 28, 2, 28, 15, 30)
    );
    private static final List<Vampire> vampireForBattleLvl3 = Arrays.asList( // total number is 2
            new Vampire("VampireLvl3.9", 38, 3, 38, 30, 40),
            new Vampire("VampireLvl3.8", 37, 3, 36, 30, 40)
    );

    // Constructor
    private Vampire(String name, int health, int level, int gold, int damage, int xp){
        this.name = name;
        this.health = health;
        this.level = level;
        this.gold = gold;
        this.xp = xp;
        this.damage = damage;
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
    public void defaultAttack(Character character) { // Needs to be corrected!
        if(character.getDefence() > this.getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int newLife = character.getHealth() - (getDamage() - character.getDefence());
            character.setHealth(newLife);
            System.out.println("Dealt " + (getDamage() - getDefence()) + " damage!");
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

    @Override
    public int getXp(){return this.xp;}

    @Override
     public void setXp(int xp){this.xp = xp;}

    @Override
    public int getDamage(){return this.damage;}

    @Override
    public void setDamage(int damage){this.damage = damage;}

}
