package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Dagger extends Weapon {
    private String WeaponName = Axe.class.getName();
    public Dagger(int Damage, int price) throws ClassNotFoundException {
        Dagger dagger = new Dagger(Damage, price,WeaponName);
    }
    private Dagger(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        super(Damage, price, WeaponName);
    }
}
