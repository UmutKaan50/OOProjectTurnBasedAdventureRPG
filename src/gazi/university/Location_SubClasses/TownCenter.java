package gazi.university.Location_SubClasses;

import gazi.university.Character;
import gazi.university.Location;
import gazi.university.NPC;
import gazi.university.NPC_SubClasses.Blacksmith;
import gazi.university.NPC_SubClasses.Shopkeeper;

public class TownCenter extends Location {
    private Blacksmith blacksmith;
    private Shopkeeper shopkeeper;

    public TownCenter(Character character) {
        super(character);
    }
    public NPC goTo(String npcType){ //returns an instance of NPC's subclass
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
