package gazi.university.NPC_SubClasses;

import gazi.university.Equipment;
import gazi.university.NPC;

public class Shopkeeper extends NPC {
    private Equipment equip;
    private String name;

    public Shopkeeper(String name, Equipment equip){
        super(name);
        this.name = name;
        this.equip = equip;
    }
    public Equipment getEquip() {
        return equip;
    }

    public void setEquip(Equipment equip) {
        this.equip = equip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

