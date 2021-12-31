package gazi.university;

public class Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int money;
    private Inventory inventory;

    public Character(String name, int health, int mana, int strength, int money, Inventory inv){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.money = money;
        this.inventory = inv;
    }
    public void levelUp(){
        // Let's make this changes in another method and call them.
        // In addition I think it'll be better to have if and else if cases for leveling up.
        // I'll be commiting and pushing them soon inshaallah.

        // Deleted something here.

    }
    public void buyItem(){

    }

    public void sellItem(){}
    public void usePotion(){

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
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}