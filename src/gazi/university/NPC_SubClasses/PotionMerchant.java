package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.Potion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.*;
import gazi.university.NPC;

import java.util.List;

public class PotionMerchant extends NPC {

    private List<Potion> potions = null;


    HealthPotion hp1 = new HealthPotion("Broken Health Potion",50,50);
    HealthPotion hp2 = new HealthPotion("Normal Health Potion", 100,75);
    HealthPotion hp3 = new HealthPotion("Masterwork Health Potion", 200,100);

    ManaPotion mp1 = new ManaPotion("Broken Mana Potion", 50,50);
    ManaPotion mp2 = new ManaPotion("Normal Mana Potion",100,75);
    ManaPotion mp3 = new ManaPotion("Masterwork Health Potion", 200,100);


    public PotionMerchant(Character character){
        super(character);
        getCharacter().setCurrentLocation(this.getClass().getSimpleName());

        potions.add(hp1);
        potions.add(hp2);
        potions.add(hp3);

        potions.add(mp1);
        potions.add(mp2);
        potions.add(mp3);
    }


    public void buyPotion(Potion potion){

        getCharacter().setMoney(getCharacter().getMoney() - potion.getPrice());

        if (potion instanceof HealthPotion){
            if (getCharacter().getHealthPotionEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(potion);
            }
            else{
                getCharacter().setHealthPotionEquipped((HealthPotion) potion);
            }
        }
        else if(potion instanceof  ManaPotion){
            if (getCharacter().getManaPotionEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(potion);
            }
            else{
                getCharacter().setManaPotionEquipped((ManaPotion) potion);
            }
        }

    }
}

