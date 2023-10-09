package ru.sayron.headsxhands.data;

public class Monster extends Creature {

    /**
     * Constructor for the Monster class.
     *
     * @param attack  the attack value of the monster
     * @param defense the defense value of the monster
     * @param health  the health value of the monster
     */
    public Monster(int attack, int defense, int health) {
        super(attack, defense, health);
    }

    /**
     * Returns a string representation of the monster's stats.
     *
     * @return the string representation of the monster's stats
     */
    @Override
    public String toString() {
        return "Monster Stats:\n" +
                "Health: " + getHealth() + "\n" +
                "Attack: " + getAttack() + "\n" +
                "Defense: " + getDefense();
    }
}
