package gazi.university.Equipment_SubClasses;

import gazi.university.Equipment;

import java.util.List;
import java.util.SplittableRandom;

public class Potions extends Equipment {

    private List<Potions> listOfPotions;
    private int price;
    private String name;
    private int regenAmount;

    // Constructor
    public Potions(String name, int price, int regenAmount){
        this.name = name;
        this.price = price;
        this.regenAmount = regenAmount;
    }

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

    public void setListOfPotions(List<Potions> listOfPotions) {
        this.listOfPotions = listOfPotions;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegenAmount() {
        return regenAmount;
    }

    public void setRegenAmount(int regenAmount) {
        this.regenAmount = regenAmount;
    }
}
