package gazi.university;

public class Enemy {
    private String name;
    private int health;
    private int level;
    public Enemy(String name, int health, int level){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public int goldAward(){
        return 0;
    }
    public int xpAward(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
