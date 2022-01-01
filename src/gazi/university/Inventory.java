package gazi.university;

public class Inventory {
    // We do not need this class since we have one class that contains all the necessary objects in it.!!!
    // Suggest me logical use of this class, otherwise I am going to delete it.
    // By logically I mean not because we have to use it, but we NEED this to use it.!!

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
