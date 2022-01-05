package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.BodyArmor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Helmet;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Shield;
import gazi.university.NPC;

import java.util.Arrays;
import java.util.List;

public class ArmorMerchant extends NPC {

    private List<Armor> armorList = null;

    // Umut Kaan's TODO: Configure their values.


    BodyArmor bodyArmor1 = new BodyArmor("Thick Body Armor", 5,100);
    BodyArmor bodyArmor2 = new BodyArmor("Magnificent Body Armor", 10, 200);

    Boots boots1 = new Boots("Thick Boots", 2,50);
    Boots boots2 = new Boots("Magnificent Boots", 5, 150);

    Helmet helmet1 = new Helmet("Thick Helmet", 3, 50);
    Helmet helmet2 = new Helmet("Magnificent Helmet", 6,150);

    Shield shield1 = new Shield("Thick Shield", 5, 100);
    Shield shield2 = new Shield("Magnificent Shield", 10,250);


    public ArmorMerchant(Character character) {
        super(character);

        armorList.add(bodyArmor1);
        armorList.add(bodyArmor2);

        armorList.add(boots1);
        armorList.add(boots2);

        armorList.add(helmet1);
        armorList.add(helmet2);

        armorList.add(shield1);
        armorList.add(shield2);
    }

    // Adding armor to armor list of directly equipping it after after buying here.
    public void buyArmor(Armor armor){

        getCharacter().setMoney(getCharacter().getMoney() - armor.getPrice());

        if (armor instanceof BodyArmor){
            if (getCharacter().getBodyArmorEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(armor);
            }
            else{
                getCharacter().setBodyArmorEquipped((BodyArmor) armor);
            }
        }
        else if (armor instanceof Boots){
            if (getCharacter().getBootsEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(armor);
            }
            else{
                getCharacter().setBootsEquipped((Boots) armor);
            }

        }
        else if (armor instanceof Helmet){
            if(getCharacter().getHelmetEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(armor);
            }
            else{
                getCharacter().setHelmetEquipped((Helmet) armor);
            }

        }
        else if (armor instanceof Shield){
            if (getCharacter().getShieldEquipped() != null){
                getCharacter().getEquipment().addEquipmentToList(armor);
            }
            else{
                getCharacter().setShieldEquipped((Shield) armor);
            }

        }

    }

}
