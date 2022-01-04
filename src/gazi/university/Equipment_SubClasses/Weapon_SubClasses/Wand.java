package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Wand extends Weapon {
    private int Damage;
    private int price;

    public Wand(String name, int Damage, int price){
        super(name);
        this.Damage = Damage;
        this.price = price;
    }

    public int getDamage(){
        return this.Damage;
    }
    public int getPrice(){
        return this.price;
    }
}
