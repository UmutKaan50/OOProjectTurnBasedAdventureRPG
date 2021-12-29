package gazi.university.Equipment_SubClasses.Weapon_SubClasses.Magic_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;

public class Staff extends Armor {
    private String ArmorName = Boots.class.getName();
    public Staff(int flatArmor, int price) throws ClassNotFoundException {
        Staff staff = new Staff(flatArmor, price, this.ArmorName); //It uses the second private constructor and passes the data to superclass with default class name
    }
    private Staff(int flatArmor, int price, String ArmorName) throws ClassNotFoundException { //This constructor should be private since it sets the ArmorName
        super(flatArmor, price, ArmorName);
    }
}
