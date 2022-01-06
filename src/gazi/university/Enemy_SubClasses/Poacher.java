package gazi.university.Enemy_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;

import java.util.List;

public class Poacher extends Enemy {
    private String name;
    private int health;
    private int level;
    private int gold;
    private int xp;
    private int damage;

    private static final List<Poacher> poacherForBattleLvl1 = List.of( // total number is 1
            new Poacher("PoacherLvl1.5", 15, 1, 12, 5,20)
    );
    private static final List<Poacher> poacherForBattleLvl2 = List.of( // total number is 1
            new Poacher("PoacherLvl2.7", 24, 2, 27, 15,30)
    );
    private static final List<Poacher> poacherForBattleLvl3 = List.of( //  total number is 1
            new Poacher("PoacherLvl3.2", 22, 2, 20, 30, 40)
    );

    // Constructor
    private Poacher(String name, int health, int level, int gold, int damage, int xp){
        this.name = name;
        this.health = health;
        this.level = level;
        this.gold = gold;
        this.xp = xp;
        this.damage = damage;
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
    public void defaultAttack(Character character) { //Needs to be corrected!
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
    public void setDamage(int damage){
        this.damage = damage;
    }

    // Planning to make more changes here.
}


