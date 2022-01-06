package gazi.university;

import java.util.ArrayList;
import java.util.List;

public class Enemy {

    private String name;
    private int health;
    private int level;
    private int damage;
    private int defence;
    private int gold;
    private int xp;
    private final List<Enemy> listOfEnemies = new ArrayList<>();

    // Constructor
    public Enemy(){}
    public String getName() {
        return name;
    }
    public void setName(String name){this.name = name;}
    public int getHealth() {
        return health;
    }
    public void setHealth(int health){this.health = health;}
    public int getLevel() {
        return level;
    }
    public void setDamage(int Damage){this.damage = Damage;}
    public int getDamage() {
        return damage;
    }
    public int getGold(){return this.gold;}
    public void setGold(int gold){this.gold = gold;}
    public int getXp(){return this.xp;}
    public void setXp(int xp){this.xp = xp;}
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public List<Enemy> getListOfEnemies() {
        return listOfEnemies;
    }

    public void addEnemyToList(Enemy enemy){
        this.name = enemy.getName();
        this.health = enemy.getHealth();
        this.level = enemy.getLevel();
        this.damage = enemy.getDamage();
        this.defence = enemy.getDefence();
        this.gold = enemy.getGold();
        this.listOfEnemies.add(enemy);
    }

    public void defaultAttack(Character character) {
        if (character.getDefence() > getDamage())
            System.out.println("Dealt 0 damage!");
        else {
            int newLife = character.getHealth() - (getDamage() - character.getDefence());
            character.setHealth(newLife);
            System.out.println("Dealt" + (getDamage() - getDefence()) + " damage!");
        }

    }

}
