package gazi.university.Potions_SubClasses;

import gazi.university.Character;
import gazi.university.Potions;

public class HealthPotion extends Potions {
    private Character character;

    public HealthPotion(int price){
        super(price);
    }
    public void regen(Character character){
        character.setHealth(character.getHealth() + 100);
    }
}
