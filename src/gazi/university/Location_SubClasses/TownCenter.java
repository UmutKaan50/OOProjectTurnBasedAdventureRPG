package gazi.university.Location_SubClasses;

import gazi.university.Character;
import gazi.university.Location;
import gazi.university.NPC;
import gazi.university.NPC_SubClasses.Blacksmith;
import gazi.university.NPC_SubClasses.Shopkeeper;

public class TownCenter extends Location {
    private final Blacksmith blacksmith;
    private final Shopkeeper shopkeeper;

    // Constructor
    public TownCenter(Character character) {
        super(character);
        this.blacksmith = new Blacksmith(character,character.getEquipment());
        this.shopkeeper = new Shopkeeper(character, character.getEquipment());
    }

    public NPC goToNPC(String npcType){ //returns an instance of NPC's subclass
        String blackName = this.blacksmith.getClass().getSimpleName();
        String shopName = this.shopkeeper.getClass().getSimpleName();

        if(npcType.equalsIgnoreCase(blackName)){
            return this.blacksmith;
        }else if(npcType.equalsIgnoreCase(shopName)){
            return this.shopkeeper;
        }
        return null;
    }
}
