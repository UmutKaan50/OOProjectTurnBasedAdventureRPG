package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class Shield extends Armor {
    private String ArmorName = Shield.class.getName();
    public Shield(int flatArmor, int price) throws ClassNotFoundException {
        Shield shield = new Shield(flatArmor, price, this.ArmorName); //It uses the second private constructor and passes the data to superclass with default class name
    }
    private Shield(int flatArmor, int price, String ArmorName) throws ClassNotFoundException { //This constructor should be private since it sets the ArmorName
        super(flatArmor, price, ArmorName);
    }
}
