package gazi.university;

public class Inventory {
    // We need only update our Equipment class and be able to get this update from Inventory class
    // Through Inventory class, we can access to the all list of equipments we want which can facilitate our job

    private Equipment equipment;

    public Inventory(){

    }

    public void updateEquipments(Equipment equipment) {
        this.equipment = equipment;
    }
    public Equipment getEquipment(){
        return this.equipment;
    }
}
