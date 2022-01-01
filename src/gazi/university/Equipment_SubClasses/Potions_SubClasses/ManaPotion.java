package gazi.university.Equipment_SubClasses.Potions_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment_SubClasses.Potions;

public class ManaPotion extends Potions {
    private Character character;

    public void regen(Character character){
        character.setMana(character.getMana() + 100);
    }
}
