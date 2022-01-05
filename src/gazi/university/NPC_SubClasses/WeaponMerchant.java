package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.*;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.*;
import gazi.university.NPC;

import java.util.Arrays;
import java.util.List;

public class WeaponMerchant extends NPC {

    private List<Weapon> weaponList = null;

    Sword sword1 = new Sword("Heay Sword", 5, 50);
    Sword sword2 = new Sword("Masterwork Sword", 10, 100);

    Axe axe1 = new Axe("Heavy Axe", 15, 150);
    Axe axe2 = new Axe("Masterwork Axe", 20, 250);

    Bow bow1 = new Bow("Heavy Bow", 5,50);
    Bow bow2 = new Bow("Masterwork Bow", 10, 100);

    Crossbow  crossbow1 = new Crossbow("Heavy CrossBow", 15, 150);
    Crossbow crossbow2 = new Crossbow("Masterwork Crossbow", 20, 250);

    Wand wand1 = new Wand("Heavy Wand", 5, 50);
    Wand wand2 = new Wand("Masterwork Wand", 10, 100);

    Staff staff1 = new Staff("Heavy Staff", 15, 150);
    Staff staff2 = new Staff("Masterwork Staff", 20, 250);

    // "I think them beaing final could be a problem for us. So I omitted that word." -UKO








    // Constructor
    public WeaponMerchant(Character character){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(character);

        // Another approach!
        weaponList.add(sword1);
        weaponList.add(sword2);

        weaponList.add(axe1);
        weaponList.add(axe2);

        weaponList.add(bow1);
        weaponList.add(bow2);

        weaponList.add(crossbow1);
        weaponList.add(crossbow2);

        weaponList.add(wand1);
        weaponList.add(wand2);

        weaponList.add(staff1);
        weaponList.add(staff2);


        // I think this part works.
        character.setCurrentLocation(this.getClass().getSimpleName());
    }

    public void buyWeapon(Weapon weapon){
        if(getCharacter().getWeaponEquipped() != null) {
            getCharacter().getEquipment().setWeaponToList(weapon);
        }
        else{
            getCharacter().setWeaponEquipped(weapon);
        }
        getCharacter().setMoney(getCharacter().getMoney() - weapon.getPrice());
    }


}