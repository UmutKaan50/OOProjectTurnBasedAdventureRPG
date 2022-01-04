package gazi.university.Equipment_SubClasses.Armor_SubClasses;

import gazi.university.Equipment_SubClasses.Armor;

public class BodyArmor extends Armor {
    private int flatArmor;
    private int price;
    private String name;

    public BodyArmor(String name, int flatArmor, int price){
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
