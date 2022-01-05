package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Axe extends Weapon {
    private int Damage;
    private int price;
    private String name;

    // Constructor
    public Axe(String name, int Damage, int price){
        super(name);
        this.Damage = Damage;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getFlatDamage(){
        return this.Damage;
    }
    public int getPrice(){
        return this.price;
    }
}
