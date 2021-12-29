package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class BodyArmor extends Armor {
    private String ArmorName = Boots.class.getName();
    public BodyArmor(int flatArmor, int price) throws ClassNotFoundException {
        BodyArmor bodyArmor = new BodyArmor(flatArmor, price, this.ArmorName); //It uses the second private constructor and passes the data to superclass with default class name
    }
    private BodyArmor(int flatArmor, int price, String ArmorName) throws ClassNotFoundException { //This constructor should be private since it sets the ArmorName
        super(flatArmor, price, ArmorName);
    }
}
