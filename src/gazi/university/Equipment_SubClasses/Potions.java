package gazi.university.Equipment_SubClasses;

import gazi.university.Equipment;

import java.util.List;

public class Potions extends Equipment {

    private List<Potions> listOfPotions;
    private int price;

    public Potions(){}

    public List<Potions> getListOfPotions(){
        return this.listOfPotions;
    }

    public void addPotionsToList(Potions potions){
        this.price = potions.getPrice();
        this.listOfPotions.add(potions);
    }

    public void removePotionsFromList(Weapon weapon){ //Added the removal of item
        int index = (int) this.getListOfPotions().stream().filter(x -> x.getPrice() == weapon.getPrice()
                && x.getClass().getSimpleName().equals(weapon.getClass().getSimpleName())).count();
        this.listOfPotions.remove(index);
    }
    public int getPrice(){
        return this.price;
    }

    public void effect(Potions potion){

    }
}
