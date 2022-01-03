package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.*;
import gazi.university.NPC;

public class Blacksmith extends NPC {
    private final Equipment equip;
    private final Character character;

    public Blacksmith(Character character, Equipment equip){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(equip.getClass().getSimpleName());
        this.equip = equip;
        this.character = character;
        this.character.setCurrentLocation(this.getClass().getSimpleName());
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