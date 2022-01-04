package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Axe extends Weapon {
    private int Damage;
    private int price;
    private String name;

    public Axe(String name, int Damage, int price){
        this.name = name;
        this.Damage = Damage;
        this.price = price;
    }
    @Override
    public String getName(){
        return this.name;
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
