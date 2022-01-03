package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.Random;

public class Level2_DeadDesert extends Battlefield {
    private Enemy enemy;
    private final int numberOfEnemies = 25;
    private int remainedNumber = numberOfEnemies;
    private final int totalGoldAward = numberOfEnemies * 10;
    private int remainedGold = totalGoldAward;
    private final int totalXpAward = numberOfEnemies * 5;
    private int remainedXpAward = totalXpAward;

    public Level2_DeadDesert(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName());
    }

    @Override
    public Enemy spawnEnemy() {
        int times = 0;
        String[] typeName = {"Poacher", "Vampire", "Zombie"};//Thinking about how to randomly pick up the level of enemy

        while(times != this.remainedNumber){
            Random random = new Random();
            int randomNumber = random.nextInt(typeName.length);
            switch (typeName[randomNumber]) { // this is called "Enhanced switch statement", guys. :)
                case "Poacher" -> {
                }
                case "Vampire" -> {

                }
                case "Zombie" -> {

                }
            }
            times++;
        }
        return this.enemy;
    }

    @Override
    public void killedEnemy(Character character, Enemy killedEnemy) {
        this.remainedNumber = numberOfEnemies - 1;
        this.enemy.getListOfEnemies().remove(numberOfEnemies - remainedNumber);
    }

    @Override
    public int getRemainedEnemies() {
        return this.remainedNumber;
    }

    @Override
    public void setRemainedEnemies(int remainedEnemies) {//Thinking about using this method in database management since
                                                         //in the flow of game this method should be secured from player.
        this.remainedNumber = remainedEnemies;

    }

    @Override
    public int getRemainedGold() {
        return 0;
    }

    @Override
    public void setRemainedGold(int totalGoldAward) {

    }

    @Override
    public int getRemainedExperience() {
        return 0;
    }

    @Override
    public void setRemainedExperience(int totalExperience) {

    }
}
