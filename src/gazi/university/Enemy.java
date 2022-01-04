package gazi.university;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements ActiveAndPassive{

    private String name;
    private int health;
    private int level;
    private int damage;
    private int defence;

    private int gold;
    private final List<Enemy> listOfEnemies = new ArrayList<>();

    public Enemy(){}
    public String getName() {
        return name;
    }
    public void setName(String name){this.name = name;}
    public int getGoldAward(){
        return 0;
    }
    public int getXpAward(){
        return 0;
    }
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
        this.listOfEnemies.add(enemy);
    }

    @Override
    public void defaultAttack(Enemy enemy) {

    }

    @Override
    public void activeSkill(Enemy enemy) {

    }

}
