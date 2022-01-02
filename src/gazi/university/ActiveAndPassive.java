package gazi.university;

public interface ActiveAndPassive {

    // I thought that default attack should be int. So that it'll return enemy's next health value.
    int defaultAttack(Enemy enemy);

    // I'm not sure about this part. But it looks good.
    int activeSkill(Enemy enemy);
    int passiveSkill();
}
