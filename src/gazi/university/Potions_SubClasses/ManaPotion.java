package gazi.university.Potions_SubClasses;

import gazi.university.Character;
import gazi.university.Potions;

public class ManaPotion extends Potions {
    private Character character;

    public ManaPotion(int price){
        super(price);
    }

    public void regen(Character character){
        character.setMana(character.getMana() + 100);
    }
}
