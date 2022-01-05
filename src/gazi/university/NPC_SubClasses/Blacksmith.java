package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.*;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.BodyArmor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Helmet;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Shield;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.*;
import gazi.university.NPC;

public class Blacksmith extends NPC {
    // "I think them beaing final could be a problem for us. So I omitted that word." -UKO
    private Equipment equip;


    Sword sword1 = new Sword("Heavy Sword",5,50);
    Sword sword2 = new Sword("Masterwork Sword",10, 100);

    Axe axe1 = new Axe("Heavy Axe", 15,200);
    Axe axe2 = new Axe("Masterwork Axe", 20,300);

    Bow bow1 = new Bow("Heavy Bow",5,50);
    Bow bow2 = new Bow("Masterwork Bow",10,100);

    Crossbow crossbow1 = new Crossbow("Heavy Crossbow", 15,200);
    Crossbow crossbow2 = new Crossbow("Masterwork Crossbow",20, 300);

    Wand wand1 = new Wand("Heavy Wand",5,50);
    Wand wand2 = new Wand("Masterwork Wand",10,100);

    Staff staff1 = new Staff("Heavy Staff",15,200);
    Staff staff2 = new Staff("Masterwork Staff",20,300);

    // Constructor
    public Blacksmith(Character character, Equipment equip){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(character);
        this.equip = equip;
        // I think this part works.
        character.setCurrentLocation(this.getClass().getSimpleName());

        equip.setWeaponToList(sword1);
        equip.setWeaponToList(sword2);

        equip.setWeaponToList(axe1);
        equip.setWeaponToList(axe2);

        equip.setWeaponToList(bow1);
        equip.setWeaponToList(bow2);

        equip.setWeaponToList(crossbow1);
        equip.setWeaponToList(crossbow2);

        equip.setWeaponToList(wand1);
        equip.setWeaponToList(wand2);

        equip.setWeaponToList(staff1);
        equip.setWeaponToList(staff2);
    }

    public void buyItem(Weapon weapon){
        if(getCharacter().getWeaponEquipped() != null) {
            getCharacter().getEquipment().setWeaponToList(weapon);
        }
        else{
            getCharacter().setWeaponEquipped(weapon);
        }
        getCharacter().setMoney(getCharacter().getMoney() - weapon.getPrice());
    }

    // Adding armor to armor list of directly equipping it after after buying here.
    public void buyItem(Armor armor){

        getCharacter().setMoney(getCharacter().getMoney() - armor.getPrice());

        if (armor instanceof BodyArmor){
            if (getCharacter().getBodyArmorEquipped() != null){
                getCharacter().getEquipment().setArmorToList(armor);
            }
            else{
                getCharacter().setBodyArmorEquipped((BodyArmor) armor);
            }
        }
        else if (armor instanceof Boots){
            if (getCharacter().getBootsEquipped() != null){
                getCharacter().getHelmetEquipped().setArmorToList(armor);
            }
            else{
                getCharacter().setBootsEquipped((Boots) armor);
            }

        }
        else if (armor instanceof Helmet){
            if(getCharacter().getHelmetEquipped() != null){
                getCharacter().getEquipment().setArmorToList(armor);
            }
            else{
                getCharacter().setHelmetEquipped((Helmet) armor);
            }

        }
        else if (armor instanceof Shield){
            if (getCharacter().getShieldEquipped() != null){
                getCharacter().getEquipment().setArmorToList(armor);
            }
            else{
                getCharacter().setShieldEquipped((Shield) armor);
            }

        }

    }
}