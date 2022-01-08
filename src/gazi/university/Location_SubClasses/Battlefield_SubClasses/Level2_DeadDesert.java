package gazi.university.Location_SubClasses.Battlefield_SubClasses;

import gazi.university.Character;
import gazi.university.Enemy;
import gazi.university.Enemy_SubClasses.Poacher;
import gazi.university.Enemy_SubClasses.Vampire;
import gazi.university.Enemy_SubClasses.Zombie;
import gazi.university.Location_SubClasses.Battlefield;

import java.util.List;
import java.util.Scanner;

public class Level2_DeadDesert extends Battlefield {
    private List<Enemy> enemyList;
    private final int numberOfEnemies = 4;
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

        boolean result = combat(numberOfEnemies);



        return result;
    }

    public boolean combat(int numberOfEnemies){
        for (int i = 0; i < numberOfEnemies; i++){
            getCharacter().levelUp();

            int defEnHealth = enemyList.get(numberOfEnemies).getHealth();

            while (getCharacter().getHealth() > 0 && enemyList.get(numberOfEnemies).getHealth() > 0){
                playerStats();
                System.out.println();
                enemyStats();
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
                    getCharacter().defaultAttack(enemyList.get(numberOfEnemies));


                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemyList.get(numberOfEnemies).getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        enemyList.get(numberOfEnemies).defaultAttack(getCharacter());
                    }


                }
                else if(selection.equals("S")){
                    System.out.println("You've used skill to the enemy!");
                    getCharacter().activeSkill(enemyList.get(numberOfEnemies));
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException exception){
                    }
                    if (enemyList.get(numberOfEnemies).getHealth() > 0){
                        System.out.println();
                        System.out.println("Enemy has attacked to you!");
                        enemyList.get(numberOfEnemies).defaultAttack(getCharacter());
                    }
                }

                else {
                    System.out.println("Wrong input!");
                    //return false;

                }

            }
            if (enemyList.get(numberOfEnemies).getHealth() <= 0 && getCharacter().getHealth() > 0){
                System.out.println("You've defeated the enemy!");
                getCharacter().setMoney(getCharacter().getMoney() + enemyList.get(numberOfEnemies).getGold());
                System.out.println("Money gained: " + enemyList.get(numberOfEnemies).getGold() + " gold");
                getCharacter().setExperience(getCharacter().getExperience() + enemyList.get(numberOfEnemies).getXp());
                System.out.println("Xp gained: " + enemyList.get(numberOfEnemies).getXp());
                enemyList.get(numberOfEnemies).setHealth(defEnHealth);
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
        System.out.println("\nDamage: " + getCharacter().getDamage());
        System.out.println("\nDefence: " + getCharacter().getDefence());

    }

    public void enemyStats(){
        System.out.println("-Enemy values-\n");
        System.out.println(enemyList.get(numberOfEnemies).getClass().getSimpleName() + ", lvl" + enemyList.get(numberOfEnemies).getLevel());
        System.out.println("Life: " + enemyList.get(numberOfEnemies).getHealth());
        System.out.println("\nDamage: " + enemyList.get(numberOfEnemies).getDamage());
        System.out.println("\nDefence: " + enemyList.get(numberOfEnemies).getDefence());

    }

    @Override
    protected void spawnEnemy() {
        Zombie z1 = new Zombie("z1", 15,1,20,5,1,20);
        Poacher p1 = new Poacher("p1",15,1,20,5,1,20);
        Vampire v1 = new Vampire("v1", 15,1,20,5,1,20);

        enemyList.add(z1);
        enemyList.add(p1);
        enemyList.add(v1);
    }



//    @Override
//    public Enemy getEnemyList() {
//        return null;
//    }

    @Override
    public void killedEnemy(Character character, Enemy killedEnemy) {
//        this.remainedNumber = numberOfEnemies - 1;
//        this.enemyList.getListOfEnemies().remove(numberOfEnemies - remainedNumber);
    }
}
