package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.List;
import java.util.Random;

public class Level3_FerociousJungle extends Battlefield {
    private Enemy enemy;
    private final int numberOfEnemies = 5;
    private int remainedNumber = numberOfEnemies;

    // Constructor
    public Level3_FerociousJungle(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName());
        spawnEnemy();
    }

    @Override
    public boolean getLocation() {
        return true;
    }

    @Override
    protected void spawnEnemy() {
        this.enemy = new Enemy();
        Poacher poacher = new Poacher();
        List<Poacher> poachersLvl3 = poacher.getPoachersByLevel(3);
        Vampire vampire = new Vampire();
        List<Vampire> vampiresLvl3 = vampire.getVampiresByLevel(3);
        Zombie zombie = new Zombie();
        List<Zombie> zombiesByLvl3 = zombie.getZombiesByLevel(3);

        int[] array = new int[numberOfEnemies];
        for(int i = 0; i < numberOfEnemies; i++){
            if(i < poachersLvl3.size()){
                array[i] = i;
            }
            if(i >= poachersLvl3.size() && i < (poachersLvl3.size() + vampiresLvl3.size()) - 1){
                array[i] = i - poachersLvl3.size(); // returns the value starting from zero
            }
            if( i >= poachersLvl3.size() + vampiresLvl3.size() &&
                    i < poachersLvl3.size() + vampiresLvl3.size() + zombiesByLvl3.size()){
                array[i] = i - (poachersLvl3.size() + vampiresLvl3.size()); // returns the value starting from zero
            }
        }

        String[] typeName = {"Poacher", "Vampire", "Zombie"};
        int times = 0;
        while(times != this.remainedNumber){ // this guy generates random list of enemies from random enemy types
            Random random = new Random();
            Random randomIndex = new Random();
            int randomIndexForList = randomIndex.nextInt(numberOfEnemies);
            int randomNumber = random.nextInt(typeName.length);
            switch (typeName[randomNumber]) {
                case "Poacher" -> {
                    try {
                        this.enemy.addEnemyToList(poachersLvl3.get(array[randomIndexForList]));
                    } catch(ArrayIndexOutOfBoundsException ex){
                        try {
                            this.enemy.addEnemyToList(vampiresLvl3.get(array[randomIndexForList]));
                        }
                        catch(ArrayIndexOutOfBoundsException exception){
                            this.enemy.addEnemyToList(zombiesByLvl3.get(array[randomIndexForList]));
                        }
                    }
                }
                case "Vampire" -> {
                    this.enemy.addEnemyToList(vampiresLvl3.get(array[randomIndexForList]));
                }
                case "Zombie" -> {
                    this.enemy.addEnemyToList(zombiesByLvl3.get(array[randomIndexForList]));
                }
            }
            times++;
        }
    }

    @Override
    public Enemy getEnemy() {
        return this.enemy;
    }

    @Override
    public void killedEnemy(Character character, Enemy killedEnemy) {
        this.remainedNumber = numberOfEnemies - 1;
        this.enemy.getListOfEnemies().remove(numberOfEnemies - remainedNumber);
    }

}
