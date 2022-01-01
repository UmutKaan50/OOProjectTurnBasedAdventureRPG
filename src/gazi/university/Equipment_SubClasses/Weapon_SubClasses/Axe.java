package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Axe extends Weapon {
    private int Damage;
    private int price;

    public Axe(int Damage, int price){
        this.Damage = Damage;
        this.price = price;
    }
    @Override
    public int getDamage(){
        return this.Damage;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
