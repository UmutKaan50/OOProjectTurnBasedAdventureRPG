package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Dagger extends Weapon {
    private int Damage;
    private int price;

    public Dagger(int Damage, int price) {
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
