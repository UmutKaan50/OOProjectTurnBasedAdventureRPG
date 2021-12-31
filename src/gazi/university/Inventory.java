package gazi.university;
import java.security.PublicKey;
import java.util.*;

public class Inventory {
    // Variables: Equipments, Potions.
    // Constructors: 3

    private ArrayList<Equipment> equipmentList = new ArrayList<Equipment>();

    public Inventory(){

    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(ArrayList<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
