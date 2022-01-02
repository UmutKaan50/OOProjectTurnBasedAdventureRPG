package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level2_DeadDesert extends Battlefield {
    private List<Enemy> listOfEnemies = new ArrayList<>();
    private static final int numberOfEnemies = 25;
    private int remainedNumber = numberOfEnemies;

    public Level2_DeadDesert(Enemy enemy, Character character){
        super(enemy, character);
        character.setCurrentLocation(this.getClass().getSimpleName());
        spawnEnemy(enemy);
    }

    @Override
    protected void spawnEnemy(Enemy enemy) {
        int times = 0;
        String[] typeName = {"Poacher", "Vampire", "Zombie"};//Thinking about how to randomly pick up the level of enemy

        while(times != this.remainedNumber){
            Random random = new Random();
            int randomNumber = random.nextInt(typeName.length);
            switch (typeName[randomNumber]) { // this is called "Enhanced switch statement", guys. :)
                case "Poacher" -> {
                    Poacher poacher = new Poacher("Poacher1", 10, 1);
                    this.listOfEnemies.add(poacher);
                }
                case "Vampire" -> {
                    Vampire vampire = new Vampire("Vampire1", 10, 1);
                    this.listOfEnemies.add(vampire);
                }
                case "Zombie" -> {
                    Zombie zombie = new Zombie("Zombie1", 10, 1);
                    this.listOfEnemies.add(zombie);
                }
            }
            times++;
        }
    }

    @Override
    public List<Enemy> getListOfEnemy() {
        return this.listOfEnemies;
    }

    @Override
    public void killedEnemy(Enemy killedEnemy) {
        this.remainedNumber = numberOfEnemies - 1;
        this.listOfEnemies.remove(numberOfEnemies - remainedNumber);
    }

    @Override
    public int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    @Override
    public void setNumberOfEnemies(int numberOfEnemies) {//thinking about deletion

    }

    @Override
    public int getRemainedEnemies() {
        return this.remainedNumber;
    }

    @Override
    public void setRemainedEnemies(int remainedEnemies) {

    }

    @Override
    public int getTotalGoldAward() {
        return 0;
    }

    @Override
    public void setTotalGoldAward(int totalGoldAward) {

    }

    @Override
    public int getTotalExperience() {
        return 0;
    }

    @Override
    public void setTotalExperience(int totalExperience) {

    }
}
