package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Location_SubClasses.Battlefield;

public class Level2_DeadDesert extends Battlefield {

    public Level2_DeadDesert(Enemy enemy, Character character){
        super(enemy, character);
        character.setCurrentLocation(this.getClass().getSimpleName());
        spawnEnemy(enemy);
    }

    @Override
    protected void spawnEnemy(Enemy enemy) {

    }

    @Override
    public Enemy getEnemy() {
        return null;
    }

    @Override
    public void setEnemy(Enemy enemy) {

    }

    @Override
    public void killedEnemy(Enemy killedEnemy) {

    }

    @Override
    public int getNumberOfEnemies() {
        return 0;
    }

    @Override
    public void setNumberOfEnemies(int numberOfEnemies) {

    }

    @Override
    public int getRemainedEnemies() {
        return 0;
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
