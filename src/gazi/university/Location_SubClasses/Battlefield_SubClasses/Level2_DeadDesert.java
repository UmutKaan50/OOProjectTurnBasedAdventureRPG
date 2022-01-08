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

public class Level2_DeadDesert extends Battlefield {
    private List<Enemy> enemyList = new ArrayList<Enemy>();
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
        System.out.println("-Your values-");
        System.out.println(getCharacter().getName() + ", lvl " +getCharacter().getLvl());
        System.out.println("Life: " + getCharacter().getHealth());
        System.out.println("Mana: " + getCharacter().getMana());
        System.out.println("Damage: " + getCharacter().getDamage());
        System.out.println("Defence: " + getCharacter().getDefence());

    }

    public void enemyStats(int i){
        System.out.println("-Enemy values-");
        System.out.println(enemyList.get(i).getClass().getSimpleName() + ", lvl" + enemyList.get(i).getLevel());
        System.out.println("Life: " + enemyList.get(i).getHealth());
        System.out.println("Damage: " + enemyList.get(i).getDamage());
        System.out.println("Defence: " + enemyList.get(i).getDefence());

    }

    @Override
    protected void spawnEnemy() {
        Zombie z1 = new Zombie("z1", 30,2,17,4,35,35);
        Poacher p1 = new Poacher("p1",35,2,18,5,40,40);
        Vampire v1 = new Vampire("v1", 40,2,19,6,45,45);
        Zombie z2 = new Zombie("z2", 45, 2, 20, 7,50,50);

        enemyList.add(z1);
        enemyList.add(p1);
        enemyList.add(v1);
        enemyList.add(z2);
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
