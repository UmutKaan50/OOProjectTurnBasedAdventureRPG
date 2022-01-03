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

public class Level1_CurvedCave extends Battlefield {
    private Enemy enemy;
    private final int numberOfEnemies = 15;
    private int remainedNumber = numberOfEnemies;
    private final int totalGoldAward = numberOfEnemies * 10; //150
    private int remainedGold = totalGoldAward;
    private final int totalXpAward = numberOfEnemies * 5; //75
    private int remainedXpAward = totalXpAward;
    private List<Integer> GoldXpPerEnemy = new ArrayList<>();


    public Level1_CurvedCave(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName()); //Let know where currently the character is.
    }

    @Override
    public Enemy spawnEnemy() { // this method generates list of Enemies in random order respective to the level fo battlefield
        this.enemy = new Enemy();
        Poacher poacher = new Poacher();
        List<Poacher> poachersLvl1 = poacher.getPoachersByLevel(1);
        Vampire vampire = new Vampire();
        List<Vampire> vampiresLvl1 = vampire.getVampiresByLevel(1);
        Zombie zombie = new Zombie();
        List<Zombie> zombiesByLvl1 = zombie.getZombiesByLevel(1);

        int[] array = new int[numberOfEnemies];
        for(int i = 0; i < numberOfEnemies; i++){
            if(i != poachersLvl1.size()){
                array[i] = i;
            }
            if(i >= poachersLvl1.size() && i < poachersLvl1.size() + vampiresLvl1.size()){
                array[i] = i - poachersLvl1.size(); // returns the value starting from zero
            }
            if( i >= poachersLvl1.size() + vampiresLvl1.size() &&
                    i < poachersLvl1.size() + vampiresLvl1.size() + zombiesByLvl1.size()){
                array[i] = i - poachersLvl1.size() + vampiresLvl1.size(); // returns the value starting from zero
            }
        }

        String[] typeName = {"Poacher", "Vampire", "Zombie"};
        int times = 0;
        while(times != this.remainedNumber){
            Random random = new Random();
            Random randomIndex = new Random();
            int randomIndexForList = randomIndex.nextInt(15);
            int randomNumber = random.nextInt(typeName.length);
            switch (typeName[randomNumber]) { // this is called "Enhanced switch statement", guys. :)
                case "Poacher" -> {
                    this.enemy.addEnemyToList(poachersLvl1.get(array[randomIndexForList]));
                }
                case "Vampire" -> {
                    this.enemy.addEnemyToList(vampiresLvl1.get(array[randomIndexForList]));
                }
                case "Zombie" -> {
                    this.enemy.addEnemyToList(zombiesByLvl1.get(array[randomIndexForList]));
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
    protected void setRemainedEnemies(int remainedEnemies) {//Thinking about using this method in database management since
                                                            // in the flow of game this method should be secured from player.
        this.remainedNumber = remainedEnemies;

    }

    @Override
    protected int getRemainedGold() {
        return this.remainedGold;
    }

    @Override
    protected void setRemainedGold(int totalGoldAward) {
        this.remainedGold = remainedGold;
    }

    @Override
    protected int getRemainedExperience() {
        return this.remainedXpAward;
    }

    @Override
    protected void setRemainedExperience(int totalExperience) {
        this.remainedXpAward = remainedXpAward;
    }
}
