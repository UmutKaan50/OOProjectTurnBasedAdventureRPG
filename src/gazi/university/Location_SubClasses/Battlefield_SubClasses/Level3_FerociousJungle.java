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

public class Level3_FerociousJungle extends Battlefield {
    private List<Enemy> enemyList = new ArrayList<Enemy>();
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
        System.out.println("-Your values-\n");
        System.out.println(getCharacter().getName() + ", lvl " +getCharacter().getLvl());
        System.out.println("Life: " + getCharacter().getHealth());
        System.out.println("Mana: " + getCharacter().getMana());
        System.out.println("\nDamage: " + getCharacter().getDamage());
        System.out.println("\nDefence: " + getCharacter().getDefence());

    }

    public void enemyStats(int number){
        System.out.println("-Enemy values-\n");
        System.out.println(enemyList.get(number).getClass().getSimpleName() + ", lvl" + enemyList.get(number).getLevel());
        System.out.println("Life: " + enemyList.get(number).getHealth());
        System.out.println("\nDamage: " + enemyList.get(number).getDamage());
        System.out.println("\nDefence: " + enemyList.get(number).getDefence());

    }

    @Override
    protected void spawnEnemy() {
        Zombie z1 = new Zombie("z1", 45,3,20,5,50,50);
        Poacher p1 = new Poacher("p1",50, 3,21, 6,55,55);
        Vampire v1 = new Vampire("v1", 55,3,22,7,60,60);
        Poacher p2 = new Poacher("p2", 60,3,23, 8,65,65);
        Vampire v2 = new Vampire("v2", 65,3, 24, 9, 70,70);

        enemyList.add(z1);
        enemyList.add(p1);
        enemyList.add(v1);
        enemyList.add(p2);
        enemyList.add(v2);
    }

//    @Override
//    public Enemy getEnemyList() {
//        return null;
//    }

    @Override
    public void killedEnemy(Character character, Enemy killedEnemy) {
//        this.remainedNumber = numberOfEnemies - 1;
//        this.enemy.getListOfEnemies().remove(numberOfEnemies - remainedNumber);
    }

}
