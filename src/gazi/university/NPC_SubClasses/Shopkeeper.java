package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.Potion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.*;
import gazi.university.NPC;

public class Shopkeeper extends NPC {
    private Equipment equip;


    HealthPotion hp1 = new HealthPotion("Broken Health Potion",50,50);
    HealthPotion hp2 = new HealthPotion("Normal Health Potion", 100,75);
    HealthPotion hp3 = new HealthPotion("Masterwork Health Potion", 200,100);

    ManaPotion mp1 = new ManaPotion("Broken Mana Potion", 50,50);
    ManaPotion mp2 = new ManaPotion("Normal Mana Potion",100,75);
    ManaPotion mp3 = new ManaPotion("Masterwork Health Potion", 200,100);


    public Shopkeeper(Character character){
        super(character);
        getCharacter().setCurrentLocation(this.getClass().getSimpleName());

        equip.setPotionsToList(hp1);
        equip.setPotionsToList(hp2);
        equip.setPotionsToList(hp3);

        equip.setPotionsToList(mp1);
        equip.setPotionsToList(mp2);
        equip.setPotionsToList(mp3);

    }


    public void buyItem(Potion potion){

        getCharacter().setMoney(getCharacter().getMoney() - potion.getPrice());

        if (potion instanceof HealthPotion){
            if (getCharacter().getHealthPotionEquipped() != null){
                getCharacter().getEquipment().setPotionsToList(potion);
            }
            else{
                getCharacter().setHealthPotionEquipped((HealthPotion) potion);
            }
        }
        else if(potion instanceof  ManaPotion){
            if (getCharacter().getManaPotionEquipped() != null){
                getCharacter().getEquipment().setPotionsToList(potion);
            }
            else{
                getCharacter().setManaPotionEquipped((ManaPotion) potion);
            }
        }

        getCharacter().getEquipment().setPotionsToList(potion);

    }
}

