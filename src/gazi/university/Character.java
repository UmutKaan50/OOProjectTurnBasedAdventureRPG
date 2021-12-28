package gazi.university;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int money;
    private Inventory inventory;

    public void levelUp(){

    }
    public void buyItem(){}
    public void sellItem(){}
    public void usePotion(){}
}