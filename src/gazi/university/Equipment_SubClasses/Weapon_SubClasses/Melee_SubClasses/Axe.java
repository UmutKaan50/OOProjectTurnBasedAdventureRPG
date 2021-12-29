package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

public class Axe extends Weapon {
    private String WeaponName = Axe.class.getName();
    public Axe(int Damage, int price) throws ClassNotFoundException {
        Axe axe = new Axe(Damage, price,WeaponName);
    }
    private Axe(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        super(Damage, price, WeaponName);
    }
}
