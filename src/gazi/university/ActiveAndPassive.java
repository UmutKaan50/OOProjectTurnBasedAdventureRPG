package gazi.university;

public interface ActiveAndPassive {

    // I thought that default attack should be int. So that it'll return enemy's next health value.
    int defaultAttack(Object obj);

    // I'm not sure about this part. But it looks good.
    int activeSkill(Object obj);
    int passiveSkill();
}
