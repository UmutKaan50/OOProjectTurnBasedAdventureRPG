package gazi.university.Location_SubClasses;

import gazi.university.Character;
import gazi.university.Location;
import gazi.university.NPC;
import gazi.university.NPC_SubClasses.WeaponMerchant;
import gazi.university.NPC_SubClasses.PotionMerchant;

public class TownCenter extends Location {
    private WeaponMerchant weaponMerchant;
    private PotionMerchant potionMerchant;

    // Constructor
    public TownCenter(Character character) {
        super(character);
        this.weaponMerchant = new WeaponMerchant(character);
        this.potionMerchant = new PotionMerchant(character);
    }

    public NPC goToNPC(String npcType){ //returns an instance of NPC's subclass
        String blackName = this.weaponMerchant.getClass().getSimpleName();
        String shopName = this.potionMerchant.getClass().getSimpleName();

        if(npcType.equalsIgnoreCase(blackName)){
            return this.weaponMerchant;
        }else if(npcType.equalsIgnoreCase(shopName)){
            return this.potionMerchant;
        }
        return null;
    }
}
