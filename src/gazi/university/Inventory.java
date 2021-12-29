package gazi.university;

public class Inventory {
    private Equipment equipment;
    private Potions potions;

    public Inventory(Equipment equipment, Potions potions){
        this.equipment = equipment;
        this.potions = potions;
    }
    public Inventory(Equipment equipment){
        this.equipment = equipment;
    }
    public Inventory(Potions potions){
        this.potions = potions;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Potions getPotions() {
        return potions;
    }

    public void setPotions(Potions potions) {
        this.potions = potions;
    }
}
