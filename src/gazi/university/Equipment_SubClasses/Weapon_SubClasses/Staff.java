package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;

public class Staff extends Armor {
    private int Damage;
    private int price;

    public Staff(int Damage, int price){
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
