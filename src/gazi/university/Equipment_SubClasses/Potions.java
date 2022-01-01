package gazi.university.Equipment_SubClasses;

import gazi.university.Equipment;

import java.util.List;

public class Potions extends Equipment {
    // Made potions subclass of Equipments

    private List<Potions> ListOfPotions;

    public Potions(){}

    public List<Potions> getListOfPotions(){
        return this.ListOfPotions;
    }
    protected void addPotionsToList(Potions potions){
        this.ListOfPotions.add(potions);
    }
}
