package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Sword extends Weapon {
    private String name;
    private int Damage;
    private int price;

    public Sword(String name, int Damage, int price){
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
