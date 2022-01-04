package gazi.university.Location_SubClasses;

import gazi.university.Enemy;
import gazi.university.Location;
import gazi.university.Character;

public abstract class Battlefield extends Location { //Since each battlefield's requirements vary from their level and
    // these methods are a MUST in each battlefield, we have
    //to make each method abstract and create their own logic.

    public Battlefield(Character character){
        super();
    }

    protected abstract void spawnEnemy(); //this method is not public but protected because we should not engage
    //in object creation in process of the creation of game's flow. Instead, we will only distribute the created objects in the game

    public abstract Enemy getEnemy();
    public abstract void killedEnemy(Character character, Enemy killedEnemy);
    protected abstract int getRemainedEnemies();
    protected abstract void setRemainedEnemies(int remainedEnemies);
}
