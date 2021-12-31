package gazi.university;

public class Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int money;
    private Inventory inventory;

    // Added variables
    // Dexterity and intelligence was forgotten.
    private int dexterity;
    private int intelligence;
    private int lvl = 0;
    private int experience = 0;

    private static final int xpToLvl2 = 50;
    private static final int xpToLvl3 = 150;
    private static final int xpToLvl4 = 350;
    private static final int xpToLvl5 = 650;

    // Getters and setters for my additional variables.
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

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

        // Checking the level up process here.
        if (experience >= xpToLvl2 && lvl == 1)
        {
            levelUpChanges();
        }
        else if (experience >= xpToLvl3 && lvl == 2)
        {
            levelUpChanges();
        }
        else if (experience >= xpToLvl4 && lvl == 3)
        {
           levelUpChanges();
        }
        else if(experience >= xpToLvl5 && lvl == 4)
        {
           levelUpChanges();
        }





    }
    private void levelUpChanges(){
        lvl++;
        experience = 0;
        health += 20;
        mana += 20;
        strength += 5;
        money += 100;
    }

    // Configured both buyItem and sellItem classes.
    public void buyItem(Equipment item){
        inventory.getEquipmentList().add(item);
    }

    public void sellItem(Equipment item){
        inventory.getEquipmentList().remove(item);
    }

    public void usePotion(){
        // Thinking about adding a potion as parameter and removing it after usage.

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