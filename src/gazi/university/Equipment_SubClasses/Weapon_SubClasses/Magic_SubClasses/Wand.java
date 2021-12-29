package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Magic_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;

public class Wand extends Armor {
    private String ArmorName = Boots.class.getName();
    public Wand(int flatArmor, int price) throws ClassNotFoundException {
        Wand wand = new Wand(flatArmor, price, this.ArmorName); //It uses the second private constructor and passes the data to superclass with default class name
    }
    private Wand(int flatArmor, int price, String ArmorName) throws ClassNotFoundException { //This constructor should be private since it sets the ArmorName
        super(flatArmor, price, ArmorName);
    }
}
