package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.NPC;

public class Shopkeeper extends NPC {
    private Equipment equip;

    public Shopkeeper(Character character, Equipment equip){
        super(equip.getClass().getSimpleName());
        this.equip = equip;
    }
}

