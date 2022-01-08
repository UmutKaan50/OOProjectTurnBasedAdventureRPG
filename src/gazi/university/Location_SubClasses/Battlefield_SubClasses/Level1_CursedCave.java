package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level1_CursedCave extends Battlefield {

    private List<Enemy> enemyList = new ArrayList<Enemy>();
    private final int numberOfEnemies = 3;
    private int remainedNumber = numberOfEnemies;


    // Constructor
    public Level1_CursedCave(Character character){
        super(character);
        character.setCurrentLocation(this.getClass().getSimpleName()); //Let know where currently the character is.
        spawnEnemy();
    }

    @Override
    public boolean getLocation() {

        System.out.println("You're now in: " + this.getClass().getSimpleName());
        System.out.println("There are " + numberOfEnemies + " enemies here.");

        boolean result = combat(numberOfEnemies);



        return result;
    }

    public boolean combat(int numberOfEnemies){
        for (int i = 0; i < numberOfEnemies; i++){
            getCharacter().levelUp();

            //int defEnHealth = enemyList.get(i).getHealth();

            while (getCharacter().getHealth() > 0 && enemyList.get(i).getHealth() > 0){
                if ((numberOfEnemies - i > 1))
                System.out.println((numberOfEnemies - i) + " enemies left!");
                else
                System.out.println("1 enemy left!");
                playerStats();
                System.out.println();
                enemyStats(i);
                System.out.println("<A>ttack directly\t|\tuse <S>kill\t|\t<R>un away");
                Scanner scan = new Scanner(System.in);
                String selection = scan.next();
                selection = selection.toUpperCase();
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException exception){
                }

                if (selection.equals("A"))
                {
                    System.out.println("You've attacked to the enemy!");
                    getCharacter().defaultAttack(enemyList.get(i));


                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemyList.get(i).getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        enemyList.get(i).defaultAttack(getCharacter());
                    }


                    }
                else if(selection.equals("S")){
                    System.out.println("You've used skill to the enemy!");
                    getCharacter().activeSkill(enemyList.get(i));
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemyList.get(i).getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        enemyList.get(i).defaultAttack(getCharacter());
                    }
                }

                else {
                    System.out.println("Wrong input!");
                    //return false;

                }

            }
            if (enemyList.get(i).getHealth() <= 0 && getCharacter().getHealth() > 0){
                System.out.println("You've defeated the enemy!");
                getCharacter().setMoney(getCharacter().getMoney() + enemyList.get(i).getGold());
                System.out.println("Money gained: " + enemyList.get(i).getGold() + " gold");
                getCharacter().setExperience(getCharacter().getExperience() + enemyList.get(i).getXp());
                System.out.println("Xp gained: " + enemyList.get(i).getXp());
                //enemyList.get(i).setHealth(defEnHealth);
                getCharacter().levelUp();

            }
            else if(getCharacter().getHealth() <= 0){
                return false;
            }


        }

        return true;
    }

    public void playerStats(){
        System.out.println("-Your values-\n");
        System.out.println(getCharacter().getName() + ", lvl " +getCharacter().getLvl());
        System.out.println("Life: " + getCharacter().getHealth());
        System.out.println("Mana: " + getCharacter().getMana());
        System.out.println("Damage: " + getCharacter().getDamage());
        System.out.println("Defence: " + getCharacter().getDefence());

    }

    public void enemyStats(int i){
        System.out.println("-Enemy values-\n");
        System.out.println(enemyList.get(i).getClass().getSimpleName() + ", lvl" + enemyList.get(i).getLevel());
        System.out.println("Life: " + enemyList.get(i).getHealth());
        System.out.println("Damage: " + enemyList.get(i).getDamage());
        System.out.println("Defence: " + enemyList.get(i).getDefence());

    }

    @Override
    protected void spawnEnemy() {
        Zombie z1 = new Zombie("z1", 15,1,14,1,20,20);
        Poacher p1 = new Poacher("p1",15,1,15,2,25,25);
        Vampire v1 = new Vampire("v1", 15,1,16,3,30,30);

        enemyList.add(z1);
        enemyList.add(p1);
        enemyList.add(v1);
    }

//    @Override
//    public Enemy getEnemyList() {
//        return null;
//    }


//    @Override
//    protected void spawnEnemy() { // this method generates list of Enemies in random order respective to the level fo battlefield
//        this.enemy = new Enemy();
//        Poacher poacher = new Poacher();
//        List<Poacher> poachersLvl1 = poacher.getPoachersByLevel(1);
//        Vampire vampire = new Vampire();
//        List<Vampire> vampiresLvl1 = vampire.getVampiresByLevel(1);
//        Zombie zombie = new Zombie();
//        List<Zombie> zombiesByLvl1 = zombie.getZombiesByLevel(1);
//
//        int[] array = new int[numberOfEnemies];
//        for(int i = 0; i < numberOfEnemies; i++){ //
//            if(i < poachersLvl1.size()){
//                array[i] = i;
//            }
//            if(i >= poachersLvl1.size() && i < (poachersLvl1.size() + vampiresLvl1.size())){
//                array[i] = i - poachersLvl1.size(); // returns the value starting from zero
//            }
//            if( i >= poachersLvl1.size() + vampiresLvl1.size() &&
//                    i < poachersLvl1.size() + vampiresLvl1.size() + zombiesByLvl1.size()){
//                array[i] = i - (poachersLvl1.size() + vampiresLvl1.size()); // returns the value starting from zero
//            }
//        }
//
//        String[] typeName = {"Poacher", "Vampire", "Zombie"};
//        int times = 0;
//
//        while(times != this.remainedNumber){ // this guy generates random list of enemies from random enemy types
//            Random random = new Random();
//            Random randomIndex = new Random();
//            int randomIndexForList = randomIndex.nextInt(numberOfEnemies);
//            int randomNumber = random.nextInt(typeName.length);
//            switch (typeName[randomNumber]) {
//                case "Poacher" -> {
//                    this.enemy.addEnemyToList(poachersLvl1.get(array[randomIndexForList]));
//                }
//                case "Vampire" -> {
//                    this.enemy.addEnemyToList(vampiresLvl1.get(array[randomIndexForList]));
//                }
//                case "Zombie" -> {
//                    this.enemy.addEnemyToList(zombiesByLvl1.get(array[randomIndexForList]));
//                }
//            }
//            times++;
//        }
//    }

//    @Override
//    public Enemy getEnemyList() {
//        return this.enemyList;
//    }

    @Override
    public void killedEnemy(Character character, Enemy killedEnemy) {
//        this.remainedNumber = numberOfEnemies - 1;
//        this.enemyList.remove(numberOfEnemies - remainedNumber);
    }
}
