package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Level2_DeadDesert extends Battlefield {
    private Enemy enemy;
    private final int numberOfEnemies = 8;
    private int remainedNumber = numberOfEnemies;

    // Constructor
    public Level2_DeadDesert(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName());
        spawnEnemy();
    }

    @Override
    public boolean getLocation() {

        System.out.println("You're now in: " + this.getClass().getSimpleName());
        System.out.println("\nThere are " + numberOfEnemies + " enemies here.");

        combat(numberOfEnemies);



        return true;
    }

    public boolean combat(int numberOfEnemies){
        for (int i = 0; i < numberOfEnemies; i++){
            int defEnHealth = enemy.getHealth();

            while (getCharacter().getHealth() > 0 && enemy.getHealth() > 0){
                playerStats();
                System.out.println();
                enemyStats();
                System.out.println("<A>ttack directly\t|\tuse <S>kill\t|\t<R<un away");
                Scanner scan = new Scanner(System.in);
                String selection = scan.next();
                selection = selection.toUpperCase();
                try{
                    Thread.sleep(1500);
                }
                catch (InterruptedException exception){
                }

                if (selection.equals("A"))
                {
                    System.out.println("You've attacked to the enemy!");
                    getCharacter().defaultAttack(enemy);


                    try{
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemy.getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        getEnemy().defaultAttack(getCharacter());
                    }


                }
                else if(selection.equals("S")){
                    System.out.println("You've used skill to the enemy!");
                    getCharacter().activeSkill(enemy);
                    try{
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemy.getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        getEnemy().defaultAttack(getCharacter());
                    }
                }

                else {
                    return false;

                }

            }
            if (enemy.getHealth() <= 0 && getCharacter().getHealth() > 0){
                System.out.println("You've defeated the enemy!");
                getCharacter().setMoney(getCharacter().getMoney() + enemy.getGold());
                System.out.println("Money gained: " + enemy.getGold() + " gold");
                getCharacter().setExperience(getCharacter().getExperience() + enemy.getXp());
                enemy.setHealth(defEnHealth);

            }


        }

        return true;
    }

    public void playerStats(){
        System.out.println("-Your values-\n");
        System.out.println("Life: " + getCharacter().getHealth());
        System.out.println("Mana: " + getCharacter().getMana());
        System.out.println("\nDamage: " + getCharacter().getDamage());
        System.out.println("\nDefence: " + getCharacter().getDefence());

    }

    public void enemyStats(){
        System.out.println("-Enemy values-\n");
        System.out.println("Life: " + getEnemy().getHealth());
        System.out.println("\nDamage: " + getEnemy().getDamage());
        System.out.println("\nDefence: " + getEnemy().getDefence());

    }

    @Override
    protected void spawnEnemy() {
        this.enemy = new Enemy();
        Poacher poacher = new Poacher();
        List<Poacher> poachersLvl2 = poacher.getPoachersByLevel(2);
        Vampire vampire = new Vampire();
        List<Vampire> vampiresLvl2 = vampire.getVampiresByLevel(2);
        Zombie zombie = new Zombie();
        List<Zombie> zombiesByLvl2 = zombie.getZombiesByLevel(2);

        int[] array = new int[numberOfEnemies];
        for(int i = 0; i < numberOfEnemies; i++){
            if(i < poachersLvl2.size()){
                array[i] = i;
            }
            if(i >= poachersLvl2.size() && i < (poachersLvl2.size() + vampiresLvl2.size())){
                array[i] = i - poachersLvl2.size(); // returns the value starting from zero
            }
            if( i >= poachersLvl2.size() + vampiresLvl2.size() &&
                    i < poachersLvl2.size() + vampiresLvl2.size() + zombiesByLvl2.size()){
                array[i] = i - (poachersLvl2.size() + vampiresLvl2.size()); // returns the value starting from zero
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
                        this.enemy.addEnemyToList(poachersLvl2.get(array[randomIndexForList]));
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        try {
                            this.enemy.addEnemyToList(vampiresLvl2.get(array[randomIndexForList]));
                        } catch (ArrayIndexOutOfBoundsException exception) {
                            this.enemy.addEnemyToList(zombiesByLvl2.get(array[randomIndexForList]));
                        }
                    }
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
}
