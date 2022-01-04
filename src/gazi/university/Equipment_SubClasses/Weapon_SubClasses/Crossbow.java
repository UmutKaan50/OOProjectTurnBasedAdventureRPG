package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Crossbow extends Weapon {

    private int Damage;
    private int price;

    public Crossbow(int Damage, int price){
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
