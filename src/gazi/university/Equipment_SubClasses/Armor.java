package gazi.university.Equipment_SubClasses;

import java.util.ArrayList;
import java.util.List;

public class Armor {
    private final List<Armor> listOfArmor = new ArrayList<>();
    private int flatArmor;
    private int price;

    public Armor(){}
    public List<Armor> getListOfArmor() {
        return this.listOfArmor;
    }

    public void addArmorToList(Armor armor){
        this.listOfArmor.add(armor);
    }
    public int getFlatArmor(){
        return this.flatArmor;
    }
    public int getPrice(){
        return this.price;
    }
}
