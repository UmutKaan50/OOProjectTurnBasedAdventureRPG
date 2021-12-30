package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee;

public class Sword extends Melee {
    private String WeaponName = Sword.class.getName();
    private int Damage;
    private int price;
    public Sword(int Damage, int price) throws ClassNotFoundException {
        Sword sword = new Sword(Damage, price,WeaponName);
    }
    private Sword(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        super(Damage, price, WeaponName);
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
