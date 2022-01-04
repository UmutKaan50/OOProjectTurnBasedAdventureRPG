package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Wand extends Weapon {
    private int Damage;
    private int price;
    private String name;

    public Wand(String name, int Damage, int price){
        this.name = name;
        this.Damage = Damage;
        this.price = price;
    }
    public String getName(){return this.name;}
    public int getDamage(){
        return this.Damage;
    }
    public int getPrice(){
        return this.price;
    }
}
