package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.*;
import gazi.university.NPC;

public class Shopkeeper extends NPC {
    private final Equipment equip;
    private final Character character;

    public Shopkeeper(Character character, Equipment equip){
        super(equip.getClass().getSimpleName());
        this.equip = equip;
        this.character = character;
        this.character.setCurrentLocation(this.getClass().getSimpleName());
    }
    public void buyItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "HealthPotion" -> {
                HealthPotion healthPotion = (HealthPotion) equipment;
                this.character.buyItem(healthPotion);
            }
            case "ManaPotion" -> {
                ManaPotion manaPotion = (ManaPotion) equipment;
                this.character.buyItem(manaPotion);
            }
        }
    }
    public void sellItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "HealthPotion" -> {
                HealthPotion healthPotion = (HealthPotion) equipment;
                this.character.sellItem(healthPotion);
            }
            case "ManaPotion" -> {
                ManaPotion manaPotion = (ManaPotion) equipment;
                this.character.sellItem(manaPotion);
            }
        }
    }
}

