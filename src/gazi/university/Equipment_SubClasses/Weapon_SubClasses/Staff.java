package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;

public class Staff extends Armor {
    private int Damage;
    private int price;
    private String name;

    public Staff(String name, int Damage, int price){
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
