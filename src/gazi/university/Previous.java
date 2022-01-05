package gazi.university;

public class Previous {

    /*
    *
    *  Umut Kaan used to store this functions in Character class.
    public void buyItem(Weapon weapon){
        if(weaponEquipped != null) {
            equipment.setWeaponToList(weapon);
        }
        else{
            weaponEquipped = weapon;

        }
        setMoney(getMoney() - weapon.getPrice());
    }

    // Adding armor to armor list of directly equipping it after after buying here.
    public void buyItem(Armor armor){

        setMoney(getMoney() - armor.getPrice());

        if (armor instanceof BodyArmor){
            if (bodyArmorEquipped != null){
                equipment.setArmorToList(armor);
            }
            else{
                bodyArmorEquipped = (BodyArmor) armor;
            }
        }
        else if (armor instanceof Boots){
            if (bootsEquipped != null){
                equipment.setArmorToList(armor);
            }
            else{
                bootsEquipped = (Boots) armor;
            }

        }
        else if (armor instanceof Helmet){
            if(helmetEquipped != null){
                equipment.setArmorToList(armor);
            }
            else{
                helmetEquipped = (Helmet) armor;
            }

        }
        else if (armor instanceof Shield){
            if (shieldEquipped != null){
                equipment.setArmorToList(armor);
            }
            else{
                shieldEquipped = (Shield) armor;
            }
        }
    }

    public void buyItem(Potion potion){

        setMoney(getMoney() - potion.getPrice());

        if (potion instanceof HealthPotion){
            if (healthPotionEquipped != null){
                equipment.setPotionsToList(potion);
            }
            else{
                healthPotionEquipped = (HealthPotion) potion;
            }
        }
        else if(potion instanceof  ManaPotion){
            if (manaPotionEquipped != null){
                equipment.setPotionsToList(potion);
            }
            else{
                manaPotionEquipped = (ManaPotion) potion;
            }
        }

        equipment.setPotionsToList(potion);

    }
    * */

    /*
    * Rahman's previous functions in Shopkeeper and Blacksmith:
    *
    *
    public void buyItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "HealthPotion" -> {
                HealthPotion healthPotion = (HealthPotion) equipment;
                getCharacter().buyItem(healthPotion);
            }
            case "ManaPotion" -> {
                ManaPotion manaPotion = (ManaPotion) equipment;
                getCharacter().buyItem(manaPotion);
            }
        }
    }
    public void sellItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "HealthPotion" -> {
                HealthPotion healthPotion = (HealthPotion) equipment;
                getCharacter().sellItem(healthPotion);
            }
            case "ManaPotion" -> {
                ManaPotion manaPotion = (ManaPotion) equipment;
                getCharacter().sellItem(manaPotion);
            }
        }
    }
    *
    *

    public void buyItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "Weapon" -> {
                Weapon weapon = (Weapon) equipment;
                getCharacter().buyItem(weapon);
            }
            case "Armor" -> {
                Armor armor = (Armor) equipment;
                getCharacter().buyItem(armor);
            }
            case "Potions" -> {
                Potion potions = (Potion) equipment;
                getCharacter().buyItem(potions);
            }
        }
    }



    public void sellItem(Equipment equipment){
        String superClassName = equipment.getClass().getSuperclass().getSimpleName();
        switch (superClassName) {
            case "Weapon" -> {
                Weapon weapon = (Weapon) equipment;
                getCharacter().sellItem(weapon);
            }
            case "Armor" -> {
                Armor armor = (Armor) equipment;
                getCharacter().sellItem(armor);
            }
            case "Potions" -> {
                Potion potions = (Potion) equipment;
                getCharacter().sellItem(potions);
            }
        }
    }
    * */
}
