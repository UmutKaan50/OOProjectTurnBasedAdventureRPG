package gazi.university.Location_SubClasses;

import gazi.university.Enemy;
import gazi.university.Location;
import gazi.university.Character;
import java.util.List;

public abstract class Battlefield extends Location {
    private Enemy enemy;
    private List<Enemy> listOfEnemies;
    private int numberOfEnemies;
    private int remainedEnemies;
    private int totalGoldAward;
    private int totalExperience;

    public Battlefield(Enemy enemy, Character character){
        super(character);
    }
    public void spawnEnemy(Enemy enemy){

    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public List<Enemy> getListOfEnemies() {
        return listOfEnemies;
    }

    public void setListOfEnemies(List<Enemy> listOfEnemies) {
        this.listOfEnemies = listOfEnemies;
    }

    public int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    public void setNumberOfEnemies(int numberOfEnemies) {
        this.numberOfEnemies = numberOfEnemies;
    }

    public int getRemainedEnemies() {
        return remainedEnemies;
    }

    public void setRemainedEnemies(int remainedEnemies) {
        this.remainedEnemies = remainedEnemies;
    }

    public int getTotalGoldAward() {
        return totalGoldAward;
    }

    public void setTotalGoldAward(int totalGoldAward) {
        this.totalGoldAward = totalGoldAward;
    }

    public int getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

}
