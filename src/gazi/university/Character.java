package gazi.university;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.BodyArmor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Helmet;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Shield;
import gazi.university.Equipment_SubClasses.Potion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.HealthPotion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.ManaPotion;
import gazi.university.Equipment_SubClasses.Weapon;

public class Character implements CharacterAttack {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int money;
    private Equipment equipment;
    private int damage;

    // Added on Wednesday, 15:10 by Umut Kaan -----------------
    private Weapon weaponEquipped = null;
    private BodyArmor bodyArmorEquipped = null;
    private Shield shieldEquipped = null;
    private Boots bootsEquipped = null;
    private Helmet helmetEquipped = null;
    private HealthPotion healthPotionEquipped = null;
    private ManaPotion manaPotionEquipped = null;

    public Weapon getWeaponEquipped() {
        return weaponEquipped;
    }

    public void setWeaponEquipped(Weapon weaponEquipped) {
        this.weaponEquipped = weaponEquipped;
    }

    public BodyArmor getBodyArmorEquipped() {
        return bodyArmorEquipped;
    }

    public void setBodyArmorEquipped(BodyArmor bodyArmorEquipped) {
        this.bodyArmorEquipped = bodyArmorEquipped;
    }

    public Shield getShieldEquipped() {
        return shieldEquipped;
    }

    public void setShieldEquipped(Shield shieldEquipped) {
        this.shieldEquipped = shieldEquipped;
    }

    public Boots getBootsEquipped() {
        return bootsEquipped;
    }

    public void setBootsEquipped(Boots bootsEquipped) {
        this.bootsEquipped = bootsEquipped;
    }

    public Helmet getHelmetEquipped() {
        return helmetEquipped;
    }

    public void setHelmetEquipped(Helmet helmetEquipped) {
        this.helmetEquipped = helmetEquipped;
    }

    public HealthPotion getHealthPotionEquipped() {
        return healthPotionEquipped;
    }

    public void setHealthPotionEquipped(HealthPotion healthPotionEquipped) {
        this.healthPotionEquipped = healthPotionEquipped;
    }

    public ManaPotion getManaPotionEquipped() {
        return manaPotionEquipped;
    }

    public void setManaPotionEquipped(ManaPotion manaPotionEquipped) {
        this.manaPotionEquipped = manaPotionEquipped;
    }
    // -------------------------------------------------------------

    // Added defence variable for combat.
    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    private String currentLocation;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

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
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Character(String name, int health, int mana, int strength, int dexterity, int intelligence,
                     int money, Equipment equipment){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.money = money;
        this.equipment = equipment;
    }
    // Adding another constructor for flexibility. And I needed it.
    public Character(){

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

    // Umut Kaan's thinking about


    // And same logic implemented in selling.
    public void sellItem(Weapon weapon){
        setMoney(getMoney() + weapon.getPrice());
        equipment.getListOfWeapons().remove(weapon);

    }
    public void sellItem(Armor armor){
        setMoney(getMoney() + armor.getPrice());
        equipment.getListOfArmor().remove(armor);

    }
    public void sellItem(Potion potion){
        setMoney(getMoney() + potion.getPrice());
        equipment.getListOfPotions().remove(potion);

    }
    public void usePotion(Potion potion){
        // Thinking about adding a potion as parameter and removing it after usage.
        equipment.getListOfPotions().remove(potion);

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
    public Equipment getEquipment() {
        return equipment;
    }
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void defaultAttack(Enemy enemy) {

    }

    @Override
    public void activeSkill(Enemy enemy) {

    }

    // Implementing and overriding methods from interfaces.

}