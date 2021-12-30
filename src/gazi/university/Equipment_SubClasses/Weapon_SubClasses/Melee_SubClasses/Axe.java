package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee;

public class Axe extends Melee {
    private String WeaponName = Axe.class.getName();
    private int Damage;
    private int price;

    public Axe(int Damage, int price) throws ClassNotFoundException {
        Axe axe = new Axe(Damage, price,WeaponName);
    }
    private Axe(int Damage, int price, String WeaponName) throws ClassNotFoundException {
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
