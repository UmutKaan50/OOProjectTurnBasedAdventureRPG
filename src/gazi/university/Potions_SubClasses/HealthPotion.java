package gazi.university.Potions_SubClasses;

import gazi.university.Character;
import gazi.university.Potions;

public class HealthPotion extends Potions {
    // Maybe I can change Character association.
    // Implementing it in a use funciton could be better but I'm not sure about it.
    private Character character;
    public void regen(Character character){
        character.setHealth(character.getHealth() + 100);
    }
}
