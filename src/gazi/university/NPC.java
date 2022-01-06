package gazi.university;

public abstract class NPC {
    private Character character;

    // I removed free NPC constructor.
    public NPC(Character character){
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public abstract void showInventory();

    public abstract void decision();
}