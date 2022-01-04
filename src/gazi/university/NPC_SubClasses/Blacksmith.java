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

    Sword sword1 = new Sword(0,0);
    Sword sword2 = new Sword(0,0);

    Axe axe1 = new Axe(0,0);
    Axe axe2 = new Axe(0,0);

    Bow bow1 = new Bow(0,0);
    Bow bow2 = new Bow(0,0);

    Wand wand1 = new Wand(0,0);
    Wand wand2 = new Wand(0,0);

    Staff staff1 = new Staff(0,0);
    Staff staff2 = new Staff(0,0);

    Crossbow crossbow1 = new Crossbow(0,0);
    Crossbow crossbow2 = new Crossbow(0,0);



    public Blacksmith(Character character, Equipment equip){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(equip.getClass().getSimpleName());
        this.equip = equip;
        this.character = character;
        this.character.setCurrentLocation(this.getClass().getSimpleName());
        equip.setWeaponToList(sword1);
        equip.setWeaponToList(sword2);
        equip.setWeaponToList(axe1);
        equip.setWeaponToList(axe2);
        equip.setWeaponToList(wand1);
        equip.setWeaponToList(wand2);
        equip.setWeaponToList(staff1);
        equip.setWeaponToList(staff2);
        equip.setWeaponToList(bow1);
        equip.setWeaponToList(bow2);

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