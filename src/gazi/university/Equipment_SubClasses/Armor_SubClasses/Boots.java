package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class Boots extends Armor {
    private int flatArmor;
    private int price;

    public Boots(int flatArmor, int price){
        this.flatArmor = flatArmor;
        this.price = price;
    }
    @Override
    public int getFlatArmor(){
        return this.flatArmor;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
