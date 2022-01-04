package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.List;
import java.util.Random;

public class Level2_DeadDesert extends Battlefield {
    private Enemy enemy;
    private final int numberOfEnemies = 25;
    private int remainedNumber = numberOfEnemies;

    public Level2_DeadDesert(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName());
        spawnEnemy();
    }

    @Override
    protected Enemy spawnEnemy() {
        this.enemy = new Enemy();
        Poacher poacher = new Poacher();
        List<Poacher> poachersLvl2 = poacher.getPoachersByLevel(2);
        Vampire vampire = new Vampire();
        List<Vampire> vampiresLvl2 = vampire.getVampiresByLevel(2);
        Zombie zombie = new Zombie();
        List<Zombie> zombiesByLvl2 = zombie.getZombiesByLevel(2);

        int[] array = new int[numberOfEnemies];
        for(int i = 0; i < numberOfEnemies; i++){
            if(i != poachersLvl2.size()){
                array[i] = i;
            }
            if(i == poachersLvl2.size() && i != (poachersLvl2.size() + vampiresLvl2.size()) - 1){
                array[i] = i - poachersLvl2.size(); // returns the value starting from zero
            }
            if( i == poachersLvl2.size() + vampiresLvl2.size() &&
                    i < poachersLvl2.size() + vampiresLvl2.size() + zombiesByLvl2.size()){
                array[i] = i - (poachersLvl2.size() + vampiresLvl2.size()); // returns the value starting from zero
            }
        }

        String[] typeName = {"Poacher", "Vampire", "Zombie"};
        int times = 0;
        while(times != this.remainedNumber){
            Random random = new Random();
            Random randomIndex = new Random();
            int randomIndexForList = randomIndex.nextInt(25);
            int randomNumber = random.nextInt(typeName.length);
            switch (typeName[randomNumber]) { // this is called "Enhanced switch statement", guys. :)
                case "Poacher" -> {
                    this.enemy.addEnemyToList(poachersLvl2.get(array[randomIndexForList]));
                }
                case "Vampire" -> {
                    this.enemy.addEnemyToList(vampiresLvl2.get(array[randomIndexForList]));
                }
                case "Zombie" -> {
                    this.enemy.addEnemyToList(zombiesByLvl2.get(array[randomIndexForList]));
                }
            }
            times++;
        }
        return this.enemy;
    }

    @Override
    public Enemy getEnemy() {
        return null;
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
}
