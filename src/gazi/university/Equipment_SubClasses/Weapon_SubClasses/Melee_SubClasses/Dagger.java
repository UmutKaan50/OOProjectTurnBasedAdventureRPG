package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee;

public class Dagger extends Melee {
    private String WeaponName = Dagger.class.getName();
    private int Damage;
    private int price;

    public Dagger(int Damage, int price) throws ClassNotFoundException {
        Dagger dagger = new Dagger(Damage, price,WeaponName);
    }
    private Dagger(int Damage, int price, String WeaponName) throws ClassNotFoundException {
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
