package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Sword extends Weapon {
    private String WeaponName = Axe.class.getName();
    public Sword(int Damage, int price) throws ClassNotFoundException {
        Sword sword = new Sword(Damage, price,WeaponName);
    }
    private Sword(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        super(Damage, price, WeaponName);
    }
}
