package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.*;
import gazi.university.NPC;

public class Shopkeeper extends NPC {
    private Equipment equip;
    private Character character;

    HealthPotion hp1 = new HealthPotion();
    HealthPotion hp2 = new HealthPotion();
    HealthPotion hp3 = new HealthPotion();

    ManaPotion mp1 = new ManaPotion();
    ManaPotion mp2 = new ManaPotion();
    ManaPotion mp3 = new ManaPotion();


    public Shopkeeper(Character character, Equipment equip){
        super(equip.getClass().getSimpleName());
        this.equip = equip;
        this.character = character;
        this.character.setCurrentLocation(this.getClass().getSimpleName());

        equip.setPotionsToList(hp1);
        equip.setPotionsToList(hp2);
        equip.setPotionsToList(hp3);

        equip.setPotionsToList(mp1);
        equip.setPotionsToList(mp2);
        equip.setPotionsToList(mp3);

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

