package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class Helmet extends Armor {
    private int flatArmor;
    private int price;

    // Constructor
    public Helmet(String name, int flatArmor, int price){
        super(name);
        this.flatArmor = flatArmor;
        this.price = price;
    }
    public Helmet(){}


    @Override
    public int getFlatArmor(){
        return this.flatArmor;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}