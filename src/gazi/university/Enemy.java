package gazi.university;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements ActiveAndPassive{

    private String name;
    private int health;
    private int level;
    private int damage;
    private List<Enemy> listOfEnemies = new ArrayList<>();

    public Enemy(){}
    public int getGoldAward(){
        return 0;
    }
    public int getXpAward(){
        return 0;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getLevel() {
        return level;
    }
    public int getDamage() {
        return damage;
    }
    public List<Enemy> getListOfEnemies() {
        return this.listOfEnemies;
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
