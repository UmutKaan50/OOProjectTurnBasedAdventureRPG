package gazi.university.Location_SubClasses;

import gazi.university.Enemy;
import gazi.university.Location;
import gazi.university.Character;

import java.util.List;

public abstract class Battlefield extends Location { //Since each battlefield's requirements vary from their level and
    // these methods are a MUST in each battlefield, we have
    //to make each method abstract and create their own logic.

    public Battlefield(Enemy enemy, Character character){
        super(character);
    }

    protected abstract void spawnEnemy(Enemy enemy); //this method is not public but protected because we should not engage
    //in object creation in process of the creation of game's flow. Instead, we will only distribute the created objects in the game


    // Deleted get and setEnemy method since we must define
    //certain amount and kind of enemies belonging to respective level of battlefield
    public abstract List<Enemy> getListOfEnemy();

    public abstract void killedEnemy(Enemy killedEnemy);

    public abstract int getNumberOfEnemies();

    protected abstract void setNumberOfEnemies(int numberOfEnemies); //Thinking about deleting this method since the number
    //of enemies must be defined by default.

    public abstract int getRemainedEnemies();

    protected abstract void setRemainedEnemies(int remainedEnemies);

    public abstract int getTotalGoldAward();

    public abstract void setTotalGoldAward(int totalGoldAward);

    public abstract int getTotalExperience();

    public abstract void setTotalExperience(int totalExperience);
}
