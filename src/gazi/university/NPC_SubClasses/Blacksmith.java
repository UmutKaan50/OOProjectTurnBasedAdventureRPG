package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.*;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.*;
import gazi.university.NPC;

public class Blacksmith extends NPC {
    // "I think them beaing final could be a problem for us. So I omitted that word." -UKO
    private Equipment equip;
    private Character character;

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





    public Blacksmith(Character character, Equipment equip){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(equip.getClass().getSimpleName());
        this.equip = equip;
        this.character = character;
        this.character.setCurrentLocation(this.getClass().getSimpleName());

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

    public void buyItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "Weapon" -> {
                Weapon weapon = (Weapon) equipment;
                this.character.buyItem(weapon);
            }
            case "Armor" -> {
                Armor armor = (Armor) equipment;
                this.character.buyItem(armor);
            }
            case "Potions" -> {
                Potions potions = (Potions) equipment;
                this.character.buyItem(potions);
            }
        }
    }

    public void sellItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "Weapon" -> {
                Weapon weapon = (Weapon) equipment;
                this.character.sellItem(weapon);
            }
            case "Armor" -> {
                Armor armor = (Armor) equipment;
                this.character.sellItem(armor);
            }
            case "Potions" -> {
                Potions potions = (Potions) equipment;
                this.character.sellItem(potions);
            }
        }
    }

}