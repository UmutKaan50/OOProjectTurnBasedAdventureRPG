package gazi.university.Equipment_SubClasses;

import gazi.university.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Armor extends Equipment {
    private final List<Armor> listOfArmor = new ArrayList<>();
    private int flatArmor;
    private int price;
    private String name;

    public Armor(){}
    public List<Armor> getListOfArmor() {
        return this.listOfArmor;
    }

    public void addArmorToList(Armor armor){
        this.flatArmor = armor.flatArmor;
        this.price = armor.price;
        this.name = armor.getName();
        this.listOfArmor.add(armor);
    }

    public void removeArmorFromList(Armor armor){ //Added the removal of item
        int index = (int) this.getListOfArmor().stream().filter(x -> x.getFlatArmor() == armor.getFlatArmor() &&
                x.getPrice() == armor.getPrice() && x.getClass().getSimpleName().
                equals(armor.getClass().getSimpleName())).count();
        this.listOfArmor.remove(index);
    }
    public String getName(){return this.name;}
    public int getFlatArmor(){
        return this.flatArmor;
    }
    public int getPrice(){
        return this.price;
    }
}
