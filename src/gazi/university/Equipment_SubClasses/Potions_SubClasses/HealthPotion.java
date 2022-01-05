package gazi.university.Equipment_SubClasses.Potions_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment_SubClasses.Potion;

public class HealthPotion extends Potion {
    // Maybe I can change Character association.
    // Implementing it in a use funciton could be better but I'm not sure about it.
    private Character character;

    // Constructor
    public HealthPotion(String name, int price, int regenAmount) {
        super(name, price, regenAmount);
    }
    public HealthPotion(){}

    public void regen(Character character){
        character.setHealth(character.getHealth() + 100);
    }
}
