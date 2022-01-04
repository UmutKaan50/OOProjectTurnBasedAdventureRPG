package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class Helmet extends Armor {
    private int flatArmor;
    private int price;
    private String name;

    public Helmet(String name, int flatArmor, int price){
        this.name = name;
        this.flatArmor = flatArmor;
        this.price = price;
    }
    @Override
    public String getName(){return this.name;}
    @Override
    public int getFlatArmor(){
        return this.flatArmor;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}