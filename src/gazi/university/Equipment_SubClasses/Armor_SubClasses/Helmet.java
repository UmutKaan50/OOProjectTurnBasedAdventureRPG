package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class Helmet extends Armor {
    private String ArmorName = Boots.class.getName();
    public Helmet(int flatArmor, int price) throws ClassNotFoundException {
        Helmet helmet = new Helmet(flatArmor, price, this.ArmorName); //It uses the second private constructor and passes the data to superclass with default class name
    }
    private Helmet(int flatArmor, int price, String ArmorName) throws ClassNotFoundException { //This constructor should be private since it sets the ArmorName
        super(flatArmor, price, ArmorName);
    }
}